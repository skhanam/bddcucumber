package com.quidco.app.pages;

import com.quidco.app.pageObjects.SurveyPageObjects;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

/**
 * Created by laxmimaddali on 5/30/17.
 */
public class SurveyPage extends BasePage {

   private static SurveyPage surveyPage = new SurveyPage();
   protected static SurveyPageObjects surveyPageObjects = PageFactory.initElements(driver, SurveyPageObjects.class);

   public SurveyPage(){

    }

    public static SurveyPage getInstance() {
        return surveyPage;
    }


    public SurveyPage clickOnOpinions() {
       waitForElementDisplay(surveyPageObjects.waysToEarnButton);
       actions.moveToElement(surveyPageObjects.waysToEarnButton).build().perform();
        surveyPageObjects.opinionsOption.click();
        return this;
    }

    public void validateSurveyPage(){
        waitForElementDisplay(surveyPageObjects.completeYourProfileButton);
        surveyPageObjects.completeYourProfileButton.isDisplayed();
    }
   public void clickOnUpdateProfileOption(){
       waitForElementDisplay(surveyPageObjects.completeYourProfileButton);
       surveyPageObjects.completeYourProfileButton.click();
   }
   public void validateProfilePage(){
       waitForElementDisplay(surveyPageObjects.titleOfProfilePage);
       surveyPageObjects.titleOfProfilePage.isDisplayed();
   }
}
