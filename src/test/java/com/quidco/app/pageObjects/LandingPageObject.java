package com.quidco.app.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by ashishmohindroo on 11/10/16.
 */
public class LandingPageObject {

    @FindBy(css = ".btn.primary")
    public static WebElement signInLink;


    @FindBy(css = ".signed-out")
    public static List<WebElement> frontPageSignInLinks;

    @FindBy(css = ".list.is-hidden>li>a")
    public static WebElement browseCompare;

    @FindBy(xpath = "//ul[contains(@class,\"header-additional-links\")]//a[text()=\"Ways to Earn\"]/..")
    public static WebElement waysToEarn_dropdown;

    @FindBy(xpath = "//ul[contains(@class,\"header-additional-links\")]//a[text()=\"Ways to Earn\"]/..//li[@class=\"ways-to-earn__item ways-to-earn__item--compare\"]")
    public static WebElement quidcoCompareLink;


    @FindBy(css = ".btn.secondary")
    public static WebElement join_quidco_btn;

    public static String categoryLink = "//div[@id='categories_footer']//a[text()='%s']";

    @FindBy(css = "#dLabel")
    public static WebElement categoryLabel;

    @FindBy(css = ".vertical-margin-large-top")
    public static WebElement numberOfRetailersFoundLabel;

    @FindBy(css = "#modal-country .modal-footer button")
    public static WebElement exploreBtn;

    @FindBy(xpath = ".//*[@id='menu-show-more']/a")
    public static WebElement showMore;

    @FindBy(css = ".category")
    public static WebElement menuCategories;


    @FindBy(xpath = ".//*[@id='modal-country']/div/div/div[3]/button")
    public static WebElement dismissAlert;

    @FindBy(xpath = "//*[@id=\"main-nav\"]/div[2]/div/div/div/ul/div/ul/li[1]/a")
    public static WebElement joinNowBtn;


}
