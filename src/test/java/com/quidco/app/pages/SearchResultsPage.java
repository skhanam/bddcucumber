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

import java.util.List;

import static com.quidco.app.helper.Constants.countMap;

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
        scrollElementIntoMiddle(SearchResultsPageObject.viewMoreProductsBtn);
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

    public void verify_presence_of_search_results_for_products(int numProducts) {
        waitForElementDisplay(HomePageObject.productsLabel);
        List<WebElement> products = preciseWaitForElements(HomePageObject.products);
        Assert.assertTrue(numProducts == products.size());
    }


    public SearchResultsPage clickBuyNowForProduct(String productIndex) {

        WebElement buyNow = waitForPresenceOfElement(By.xpath(String.format(searchResultsPageObject.buyNowBtnLoc, countMap.get(productIndex))));
        buyNow.click();
        return this;
    }

    public void clickBuyNowOnProductDetailPage() {
        WebElement buyNow = waitForElementDisplay(searchResultsPageObject.buyNowBtnProductDetailsPage);
        buyNow.click();
    }

    public void checkPresenceOfOtherSellers(int number) {

        waitForElementDisplay(searchResultsPageObject.otherSellersTitle);
        String otherSellersTitle = searchResultsPageObject.otherSellersTitle.getText().trim();
        System.out.println(otherSellersTitle);
        String pattern = searchResultsPageObject.buyAtOtherSellersPattern;
        Assert.assertTrue(otherSellersTitle.matches(pattern));
        List<WebElement> additionalSellers = waitForPresenceOfAllElements(By.xpath(searchResultsPageObject.additionalSellersLoc));
        Assert.assertTrue(additionalSellers.size() > 0);
    }

    public SearchResultsPage clickViewMoreSellers(){

        scrollElementIntoMiddle(searchResultsPageObject.viewMoreSellersBtn);
        searchResultsPageObject.viewMoreSellersBtn.click();
        return this;
    }

    public void verifyMoreSellers(){
        List<WebElement> addSellers  = waitForPresenceOfAllElements(By.xpath(searchResultsPageObject.additionalSellersLoc));
        Assert.assertTrue(addSellers.size() > 3);
    }

}
