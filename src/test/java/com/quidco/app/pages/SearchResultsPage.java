package com.quidco.app.pages;

import com.google.common.base.Function;
import com.quidco.app.pageObjects.HomePageObject;
import com.quidco.app.pageObjects.SearchResultsPageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by ashishmohindroo on 12/16/16.
 */
public class SearchResultsPage extends BasePage {

    public static SearchResultsPageObject searchResultsPageObject = PageFactory.initElements(driver, SearchResultsPageObject.class);
    private static SearchResultsPage searchResultsPage = new SearchResultsPage();
    private String searchTerm = null;

    private SearchResultsPage() {
    }

    public static SearchResultsPage getInstance() {
        return searchResultsPage;
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }


    public SearchResultsPage validateRetailers() {

        waitForPresenceOfElement(By.xpath(HomePageObject.retailersHeadingTitle));
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
        waitForElementDisplay(SearchResultsPageObject.similarRetailersTitle);
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
        scrollElementIntoViewatBottom(SearchResultsPageObject.viewMoreProductsBtn);
        WebElement viewMoreBtn = waitForElementDisplay(SearchResultsPageObject.viewMoreProductsBtn);
        viewMoreBtn.click();
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//msm-component-search-product-list/div/button[contains(@class,'btn-is-loading')]")));
        } catch (NoSuchElementException e) {

        }
    }

    public HomePage clickRetailer() {
        WebElement retailer = waitForPresenceOfElement(By.cssSelector(searchResultsPageObject.retailerName));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        retailer.click();
        return HomePage.getInstance();
    }

}
