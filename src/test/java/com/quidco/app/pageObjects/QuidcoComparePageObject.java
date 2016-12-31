package com.quidco.app.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by ashishmohindroo on 12/15/16.
 */
public class QuidcoComparePageObject {

    public static String quidcoCompareTabs = "//div[@class=\"proposition__nav\"]//ul[contains(@class,\"nav-tabs\")]//li/a[text()='%s']";

    public String how_it_works_title = "//div[@class='how-it-works-panel']/div/h2[text()='%s']";

    public String iconMobile = "//div[contains(@class,'icon-left-mobile')]//h3[text()='%s']";

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

    public static String getPaidTitleText = "Get paid to compare";

    public static String moneyCashbackTitleText = "Save time and money, and earn cashback, in one place!";

    public static String chooseCompareTitleText = "Here's why Quidco Compare is right for you…";

    public static final String HOWITWORKS = "How it works";

    public static String insuranceName = "//div[@class='flex-grid-card']//div[@class='card__header--split-title']/h4[text()='%s']";

}
