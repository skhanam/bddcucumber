package com.quidco.app.pages;

import com.quidco.app.pageObjects.LandingPageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ashishmohindroo on 11/8/16.
 */
public class LandingPage extends BasePage {

    LandingPageObject landingPageObject = PageFactory.initElements(driver,LandingPageObject.class);

    public void navigateToHomePage(String url){
        driver.get(url);
    }
    public LoginPage  clickSignInOnNavigationBar(){
        waitForElementDisplay(landingPageObject.signInLink);
        landingPageObject.signInLink.click();
        return PageFactory.initElements(driver,LoginPage.class);
    }
}


