package com.quidco.app.pages;

import com.quidco.app.pageObjects.LandingPageObject;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ashishmohindroo on 11/8/16.
 */
public class LandingPage extends BasePage {

    private LandingPageObject landingPageObject = PageFactory.initElements(driver, LandingPageObject.class);

    public void navigateToHomePage() {
        driver.get(QuidcoAppUrl);
    }

    public LoginPage clickSignInOnNavigationBar() {
        waitForElementDisplay(landingPageObject.signInLink);
        landingPageObject.signInLink.click();
        return PageFactory.initElements(driver, LoginPage.class);
    }
}


