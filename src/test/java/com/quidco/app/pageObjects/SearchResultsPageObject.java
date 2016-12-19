package com.quidco.app.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by ashishmohindroo on 12/16/16.
 */
public class SearchResultsPageObject {

    @FindBy(xpath = "//div[@id='search-results-similar-retailers-container']/h3")
    public static WebElement similarRetailersTitle;

    @FindBy(xpath = "//div[@id='search-results-similar-retailers-container']/ul[@class='search-results-list']/li")
    public static List<WebElement>  similarRetailers;

    @FindBy(id = "close-search")
    public static WebElement closeSearch;

    public static String similarRetailersConstantString = "Similar retailers to ";
}
