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
    @FindBy(css = ".category-icons-container li.bookmarks")
    public static WebElement favIcon;

    public static String favDDItem = "li.dropdown.open li.dropdown-item>a[title='%s']";

    public static String userDropdownOptions = "//li[contains(@class,'user-activity')]//ul[contains(@class,'dropdown-menu')]" +
            "//li/a/span[contains(text(),'%s')]";
    public static String userDropdownOptionsWithSingleLine = "//li[contains(@class,'user-activity')]//ul[contains(@class,'dropdown-menu')]" +
            "//li/a[contains(text(),'%s')]";
    @FindBy(id = "store-q1search")
    public static WebElement searchInput;

    public static String retailersHeadingTitle = "//div[@id='search-results-top-retailer-container']/h3[text()='Retailers']";

    @FindBy(xpath =  "//div[@id='search-results-multiple-retailers-container']//h3[text()='Retailers']")
    public static WebElement multipleRetailersHeadingTitle;

    @FindBy(xpath = "//div[@id='search-results-multiple-retailers-container']//li")
    public static List<WebElement> multiRetailersList;



    public static String topRetailerTitle = "//div[@id='search-results-top-retailer-container']//div[@class='retailer-info']//p[text()='%s']";

    @FindBy(css = "::shadow .page-title-container")
    public static WebElement productsLabel;


    @FindBy(css = "::shadow msm-component-search-product-product a>div")
    public static List<WebElement> products;

    public static String productBuyNowBtn = "::shadow msm-component-search-product-product .btn";

    @FindBy(css = ".page-title-container")
    public static WebElement shippingAndPaymentsTitle;

    @FindBy(css = "#addressFullName")
    public static WebElement addressFullName;
    @FindBy(css = "#addressLine1")
    public static WebElement addressLine1;
    @FindBy(css = "#addressLine2")
    public static WebElement addressLine2;
    @FindBy(css = "#addressCity")
    public static WebElement addressCity;
    @FindBy(css = "#addressPostcode")
    public static WebElement addressPostcode;
    @FindBy(css = "#phoneNumber")
    public static WebElement phoneNumber;
    @FindBy(css = "#cardName")
    public static WebElement cardName;
    @FindBy(css = "#cardNumber")
    public static WebElement cardNumber;
    @FindBy(css = "#cardExpiryMonth")
    public static WebElement cardExpiryMonth;
    @FindBy(css = "#cardExpiryYear")
    public static WebElement cardExpiryYear;
    @FindBy(css = "#cardCVC")
    public static WebElement cardCVC;
    @FindBy(css = "msm-form-product .btn")
    public static WebElement reviewOrSubmitOrderBtn;
    @FindBy(css = ".page-main-title")
    public static WebElement orderPlacedtitle;

    @FindBy(css = "#billingLine1")
    public static WebElement billingLine1;
    @FindBy(css = "#billingLine2")
    public static WebElement billingLine2;
    @FindBy(css = "#billingCity")
    public static WebElement billingCity;
    @FindBy(css = "#billingPostcode")
    public static WebElement billingPostcode;
    @FindBy(css = ".retailer-cashback-summary-buttons #follow_link_text")
    public static WebElement favToggleBtn;
    public static String alertText  = "//div[@id=\"followAlert\"]//p[contains(@class,\"alert-text\")][text()=\"%s\"]";


}
