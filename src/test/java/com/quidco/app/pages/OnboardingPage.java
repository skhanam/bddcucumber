package com.quidco.app.pages;

import com.quidco.app.pageObjects.OnBoardingPageObject;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ashishmohindroo on 11/24/16.
 */
public class OnboardingPage extends BasePage {

    private static OnboardingPage onboardingPage = new OnboardingPage();

    private OnboardingPage() {
    }

    public static OnboardingPage getInstance() {
        return onboardingPage;
    }

    OnBoardingPageObject onBoardingPageObject = PageFactory.initElements(driver, OnBoardingPageObject.class);

    public OnboardingPage click_get_started() {
        waitForElementDisplay(onBoardingPageObject.getStarted);
        onBoardingPageObject.getStarted.click();
        return this;
    }

    public OnboardingPage select_account_type() {
        waitForElementDisplay(onBoardingPageObject.premiumchkbox);
        switch (this.getUserSubscription()) {
            case "premium":
                break;
            case "retailerads":
                onBoardingPageObject.retaileradsChkbox.click();
                break;
            default:

        }
        return this;
    }

    public OnboardingPage click_next_step() {
        waitForElementDisplay(onBoardingPageObject.nextStep);
        scrollElementIntoView(onBoardingPageObject.nextStep);
        onBoardingPageObject.nextStep.click();
        return this;
    }

    public HomePage click_finish() {
        waitForElementDisplay(onBoardingPageObject.nextStep);
        scrollElementIntoView(onBoardingPageObject.nextStep);
        onBoardingPageObject.nextStep.click();
        return HomePage.getInstance();
    }


    public OnboardingPage addUserDetails() {
        onBoardingPageObject.postcode.sendKeys("E130 SEG");
        onBoardingPageObject.radio_male.click();
        onBoardingPageObject.select_dayOfBirth.selectByValue("18");
        onBoardingPageObject.select_MonthOfBirth.selectByValue("09");
        onBoardingPageObject.select_YearOfBirth.selectByValue("1983");
        return this;
    }

    public OnboardingPage skipStep() {
        waitForElementDisplay(onBoardingPageObject.skipStep);
        scrollElementIntoView(onBoardingPageObject.nextStep);
        onBoardingPageObject.skipStep.click();
        return this;
    }

}