package com.quidco.app.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by ashishmohindroo on 11/24/16.
 */
public class OnBoardingPageObject {

    @FindBy(css = ".welcome a")
    public static WebElement getStarted;
    @FindBy(css = "#basic-vs-premium>.row:nth-child(1)>div:nth-child(2)>div")
    public static WebElement retaileradsChkbox;
    @FindBy(css = "#basic-vs-premium>.row:nth-child(1)>div:nth-child(1)>div")
    public static WebElement premiumchkbox;
    @FindBy(css = "a.btn.pull-right")
    public static WebElement nextStep;
    @FindBy(css = "a.skip.pull-right")
    public static WebElement skipStep;
    @FindBy(css = "#your-details-form input[placeholder='Postcode']")
    public static WebElement postcode;
    @FindBy(css = "#your-details-form label[for=\"r1\"]")
    public static WebElement radio_male;
    @FindBy(css = "#your-details-form label[for=\"r2\"]")
    public static WebElement radio_female;
    @FindBy(css = ".dob:nth-child(1) select")
    public static Select select_dayOfBirth;
    @FindBy(css = ".dob:nth-child(2) select")
    public static Select select_MonthOfBirth;
    @FindBy(css = ".dob:nth-child(3) select")
    public static Select select_YearOfBirth;


}
