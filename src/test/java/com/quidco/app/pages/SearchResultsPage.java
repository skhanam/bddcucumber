package com.quidco.app.pages;

import com.google.common.base.Function;
import com.quidco.app.pageObjects.HomePageObject;
import com.quidco.app.pageObjects.QuidcoComparePageObject;
import com.quidco.app.pageObjects.SearchResultsPageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

/**
 * Created by ashishmohindroo on 12/16/16.
 */
public class SearchResultsPage extends BasePage {

    private static SearchResultsPage searchResultsPage = new SearchResultsPage();

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    private String searchTerm = null;

    public static SearchResultsPageObject searchResultsPageObject = PageFactory.initElements(driver, SearchResultsPageObject.class);

    private SearchResultsPage() {
    }

    public static SearchResultsPage getInstance() {
        return searchResultsPage;
    }


    public SearchResultsPage validateRetailers() {

        waitForElementDisplay(HomePageObject.retailersHeadingTitle);
        flwait.until(new Function() {
            @Override
            public Object apply(Object o) {
                return driver.findElement(By.xpath(String.format(HomePageObject.topRetailerTitle, getSearchTerm())));
            }});
        waitForElementDisplay(driver.findElement(By.xpath(String.format(HomePageObject.topRetailerTitle, this.getSearchTerm()))));
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

}
