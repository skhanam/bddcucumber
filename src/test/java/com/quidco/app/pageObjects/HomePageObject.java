package com.quidco.app.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by ashishmohindroo on 11/10/16.
 */
public class HomePageObject {

    @FindBy(css = ".user")
    public static WebElement avatarIcon;

    public static String userDropdownOptions = "//li[contains(@class,'user-activity')]//ul[contains(@class,'dropdown-menu')]" +
            "//li/a/span[contains(text(),'%s')]";
    public static String userDropdownOptionsWithSingleLine = "//li[contains(@class,'user-activity')]//ul[contains(@class,'dropdown-menu')]" +
            "//li/a[contains(text(),'%s')]";
    @FindBy(id = "store-q1search")
    public static WebElement searchInput;

    @FindBy(xpath =  "//div[@id='search-results-top-retailer-container']/h3[text()='Retailers']")
    public static WebElement retailersHeadingTitle;
    @FindBy(xpath =  "//div[@id='search-results-multiple-retailers-container']//h3[text()='Retailers']")
    public static WebElement multipleRetailersHeadingTitle;

    @FindBy(xpath = "//div[@id='search-results-multiple-retailers-container']//li")
    public static List<WebElement> multiRetailersList;



    public static String topRetailerTitle = "//div[@id='search-results-top-retailer-container']//div[@class='retailer-info']//p[text()='%s']";

    @FindBy(css = "::shadow .page-title-container")
    public static WebElement productsLabel;

    @FindBy(css = "::shadow msm-component-search-product-product a>div")
    public static List<WebElement> products;

    public static String

}
