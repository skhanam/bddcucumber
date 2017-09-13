package com.quidco.app.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ashishmohindroo on 12/15/16.
 */
public class QuidcoComparePageObject {

    public static final String HOWITWORKS = "How it works";
    public static final String INSURANCE = "Insurance";
    public static final String ENERGY = "Energy";
    public static final String BROADBAND = "Broadband";
    @FindBy(xpath = "//a[@href='#choose-compare']")
    public static WebElement chooseCompareCarousel;
    @FindBy(css = "#choose-compare")
    public static WebElement chooseCompareTitle;
    @FindBy(xpath = "//a[@href='#money-cashback']")
    public static WebElement moneyCashbackCaraousel;
    @FindBy(css = "#money-cashback")
    public static WebElement moneyCashbackTitle;
    @FindBy(xpath = "//a[@href='#get-paid']")
    public static WebElement getPaidCaraousel;
    @FindBy(css = "#get-paid")
    public static WebElement getPaidTitle;
    @FindBy(css = "#page-content .panel-title")
    public static List<WebElement> faqTitles;
    @FindBy(css = "#page-content .icon-primary-expand-bg")
    public static List<WebElement> plusSignsForFAQs;
    @FindBy(css = "#page-content .panel-content")
    public static List<WebElement> faqAnswers;
    @FindBy(id = "attribute_broadband")
    public static WebElement broadband_cb;
    @FindBy(css = ".deals-output>tr")
    public static List<WebElement> broadbandPackagesList;
    public static String categoryIcon = "//a//span[text()='%s']/../..";
    public static String insuranceTypesLocator = "//div[@data-id='Insurance']//span[text()='%s']";
    public static String energyTypesLocator = "//div[@data-id='Energy']//span[text()='%s']";
    public static String broadbandTypesLocator = "//div[@data-id='Broadband']//span[text()='%s']";
    public static String getPaidTitleText = "Get paid to compare";
    public static String moneyCashbackTitleText = "Save time and money, and earn cashback, in one place!";
    public static String chooseCompareTitleText = "Here's why Quidco Compare is right for you…";
    public static List<String> insuranceTypes = Arrays.asList(
            "Car Insurance",
            "Travel Insurance",
            "Home Insurance",
            "Pet Insurance",
            "Van Insurance",
            "Bike Insurance");
    public static List<String> energyTypes = Arrays.asList(
            "Electricity",
            "Gas",
            "Dual Fuel");
    public static List<String> broadbandTypes = Arrays.asList(
            "Home Broadband",
            "Office Broadband",
            "Mobile Broadband");

    public static String compareGridOptions = "//div[@class='card__header--split-title']/h4[text()='%s']";

    public static String quidcoCompareTabs = "//div[@class=\"proposition__nav\"]//ul[contains(@class,\"nav-tabs\")]//li/a[text()='%s']";

    public static String how_it_works_title = "//div[@class='how-it-works-panel']/div/h2[text()='%s']";

    public static String iconMobile = "//div[contains(@class,'icon-left-mobile')]//h3[text()='%s']";

    public static String getaQuoteBtn = "//div[@class='card__header--split-title']/h4[text()='%s']/../../../..//button";

}
