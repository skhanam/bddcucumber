package com.quidco.app.pages;

import com.quidco.app.pageObjects.LandingPageObject;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ashishmohindroo on 11/8/16.
 */
public class LandingPage extends BasePage {

    private static LandingPage landingPage = new LandingPage();

    public static LandingPageObject landingPageObject= PageFactory.initElements(driver, LandingPageObject.class);;

    private LandingPage(){}

    public static LandingPage getInstance(){
        return landingPage;
    }

    public void navigateToLandingPage() {
        driver.get(QuidcoAppUrl);
    }

    public LoginPage clickSignInOnNavigationBar() {
        waitForElementDisplay(landingPageObject.signInLink);
        landingPageObject.signInLink.click();
        return LoginPage.getInstance();
    }
}


