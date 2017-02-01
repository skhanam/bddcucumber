package com.quidco.app.pages;

import com.google.common.base.Function;
import com.quidco.app.pageObjects.HomePageObject;
import com.quidco.app.pageObjects.SearchResultsPageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by ashishmohindroo on 12/16/16.
 */
public class SearchResultsPage extends BasePage {

    private static SearchResultsPage searchResultsPage = new SearchResultsPage();

    public static SearchResultsPageObject searchResultsPageObject = PageFactory.initElements(driver, SearchResultsPageObject.class);

    private String searchTerm = null;

    public static SearchResultsPage getInstance() {
        return searchResultsPage;
    }

    private SearchResultsPage() {
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }


    public SearchResultsPage validateRetailers() {

        waitForElementDisplay(HomePageObject.retailersHeadingTitle);
        scrollElementByOffset(HomePageObject.retailersHeadingTitle,-100);
        flwait.until(new Function() {
            @Override
            public Object apply(Object o) {
                return driver.findElement(By.xpath(String.format(HomePageObject.topRetailerTitle, getSearchTerm())));
            }
        });
        waitForElementDisplay(driver.findElement(By.xpath(String.format(HomePageObject.topRetailerTitle, this.getSearchTerm()))));
        return this;
    }

    public SearchResultsPage verifyPresenceOfRetailers() {
        waitForElementDisplay(HomePageObject.multipleRetailersHeadingTitle);
        Assert.assertTrue(isListNotEmpty(HomePageObject.multiRetailersList));
        return this;
    }

    public SearchResultsPage validateSimilarRetailers() {
        scrollElementIntoView(SearchResultsPageObject.similarRetailersTitle);
        Assert.assertEquals(SearchResultsPageObject.similarRetailersTitle.getText(), SearchResultsPageObject.similarRetailersConstantString + this.getSearchTerm());
        Assert.assertNotEquals(0, searchResultsPageObject.similarRetailers.size());
        return this;
    }

    public HomePage closeSearch() {
        scrollElementIntoViewatBottom(SearchResultsPageObject.closeSearch);
        waitForElementDisplay(SearchResultsPageObject.closeSearch);
        SearchResultsPageObject.closeSearch.click();
        return HomePage.getInstance();
    }

    public void clickViewMoreProducts() {
        waitForElementDisplay(SearchResultsPageObject.viewMoreProductsBtn);
        scrollElementByOffset(SearchResultsPageObject.viewMoreProductsBtn,-100);
        SearchResultsPageObject.viewMoreProductsBtn.click();
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("::shadow div.main-button-container> button.btn-is-loading")));
        }catch (NoSuchElementException  e){

        }

    }

}
