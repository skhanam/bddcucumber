package com.quidco.app.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by laxmimaddali on 6/6/17.
 */
public class FindByPostcodepageObjects {



    @FindBy(xpath = "//a[@href ='/quidco-high-street/retailers/']")
    public static WebElement highstreet;

    @FindBy(xpath = "//a[@href ='/quidco-high-street/nearby/']")
    public static WebElement findNearByOption;

    @FindBy(id = "postcode")
    public static WebElement postCodeField;

    @FindBy(name = "submit")
    public static WebElement findOffersButton;


    @FindBy(xpath = "//div[@class = 'row results']")
    public static WebElement validateListOfOffers;

}
