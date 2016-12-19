package com.quidco.app.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by ashishmohindroo on 12/15/16.
 */
public class QuidcoComparePageObject {

    public static String quidcoCompareTabs = "//div[@class=\"proposition__nav\"]//ul[contains(@class,\"nav-tabs\")]//li/a[text()='%s']";

    public static final String HOWITWORKS = "How it works";

    public String how_it_works_title =  "//div[@class='how-it-works-panel']/div/h2[text()='%s']";

    public String iconMobile = "//div[contains(@class,'icon-left-mobile')]//h3[text()='%s']";

    @FindBy(xpath = "//a[@href='#choose-compare']")
    public static WebElement chooseCompareCarousel;
    @FindBy(xpath = "//a[@href='#money-cashback']")
    public static WebElement moneyCashbackCaraousel;
    @FindBy(xpath = "//a[@href='#get-paid']")
    public static WebElement getPaidCaraousel;



}
