package com.quidco.app.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by laxmimaddali on 5/30/17.
 */
public class SurveyPageObjects {

    @FindBy(xpath = "//*[@id='main-nav']/div[1]/div/div/div/ul/li[1]/a")
    public static WebElement waysToEarnButton;

    @FindBy(xpath = "//*[@id='main-nav']/div[1]/div/div/div/ul/li[1]/ul/li[4]/a")
    public static WebElement opinionsOption;

    @FindBy(xpath = ".//*[@id='page-content']/div[3]/div[3]/div/div[2]/div[2]/a")
    public static WebElement completeYourProfileButton;

    @FindBy(xpath = ".//*[@id='page-content']/div[3]/div[3]/div/div[1]/div/h2")
    public static WebElement titleOfProfilePage;


}
