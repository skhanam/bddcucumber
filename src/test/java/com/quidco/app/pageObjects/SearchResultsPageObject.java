package com.quidco.app.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPageObject {

    @FindBy(xpath = "//div[@id='search-results-similar-retailers-container']/h3")
    public static WebElement similarRetailersTitle;

    @FindBy(xpath = "//div[@id='search-results-similar-retailers-container']/ul[@class='search-results-list']/li")
    public static List<WebElement> similarRetailers;

    @FindBy(id = "close-search")
    public static WebElement closeSearch;

    public static String similarRetailersConstantString = "Similar retailers to ";

    @FindBy(xpath = "//msm-component-search-product-list/div/button")
    public static WebElement viewMoreProductsBtn;

    public static String retailerName = "#search-results-top-retailer-container .retailer-name>a";

    public static String buyNowBtnLoc = "//msm-component-search-product-list/msm-component-search-product-product[%s]//div[contains(@class,'product-buy-now-container')]/a";

    @FindBy(xpath = "//msm-marketplace-product-detail-right//msm-marketplace-product-buy-now/div/a")
    public static WebElement  buyNowBtnProductDetailsPage;

    @FindBy(xpath = "//msm-marketplace-merchants-list//div[@class='title-container']")
    public static WebElement otherSellersTitle;

    @FindBy(xpath = "//msm-marketplace-merchants-list/div//button")
    public static WebElement viewMoreSellersBtn;

    public String additionalSellersLoc = "//msm-marketplace-additional-seller";

    public static String buyAtOtherSellersPattern = "Buy at [0-9]+ other sellers";

}
