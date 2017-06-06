package com.quidco.app.pages;

import com.quidco.app.pageObjects.FindByPostcodepageObjects;
import com.quidco.app.pageObjects.SurveyPageObjects;
import org.openqa.selenium.support.PageFactory;

import static com.quidco.app.pages.SurveyPage.surveyPageObjects;
import static com.quidco.app.utility.SeleniumUtils.actions;

/**
 * Created by laxmimaddali on 6/6/17.
 */
public class FindByPostcodePage extends BasePage{

    private static FindByPostcodePage findbypost = new FindByPostcodePage();
    protected static FindByPostcodepageObjects postcodepageObjects = PageFactory.initElements(driver, FindByPostcodepageObjects.class);


    public static FindByPostcodePage getInstance(){

        return findbypost;
    }

    public void clickOnHighStreet(){
        waitForElementDisplay(surveyPageObjects.waysToEarnButton);
        actions.moveToElement(surveyPageObjects.waysToEarnButton).build().perform();
        postcodepageObjects.highstreet.click();
    }

    public void clickOnFindNearByOption(){
        waitForElementDisplay(postcodepageObjects.findNearByOption);
        postcodepageObjects.findNearByOption.click();
    }

     public void enterPostcode(String postcode){
         waitForElementDisplay(postcodepageObjects.postCodeField);
         postcodepageObjects.postCodeField.clear();
         postcodepageObjects.postCodeField.sendKeys(postcode);
     }

     public void clickonFindOffersButton(){
         waitForElementDisplay(postcodepageObjects.findOffersButton);
         postcodepageObjects.findOffersButton.click();
     }


     public void validateListofRetailers(){
         waitForElementDisplay(postcodepageObjects.validateListOfOffers);
         postcodepageObjects.validateListOfOffers.isDisplayed();
     }

}
