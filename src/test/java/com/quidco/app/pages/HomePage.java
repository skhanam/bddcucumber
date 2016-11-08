package com.quidco.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by thadeus on 11/04/16.
 */
public class HomePage extends BasePage {

    @FindBy(css = ".nav>.signin>a.link")
    private WebElement signInLink;

    public void navigateToHomePage(String url){
        driver.get(url);
    }
    public LoginPage  clickSignInOnNavigationBar(){
        waitForElementDisplay(signInLink);
        signInLink.click();
        return PageFactory.initElements(driver,LoginPage.class);
    }
}
