package com.quidco.app.pages;

import com.quidco.app.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by thadeus on 11/04/16.
 */
public class LoginPage extends Driver{


@FindBy(css ="#main-nav-login-dropdown-link" )
private WebElement loginLink;
@FindBy(css = "#dd-username")
private WebElement username;
@FindBy(css = "#dd-password")
private WebElement emailPassword;
@FindBy(xpath = "//*[@id='sign-in-dropdown']/form/div[5]/input")
private WebElement signInButton;
@FindBy(xpath = "//*[@id='main-nav']/div/div[7]/div[2]")
private WebElement userAvatar;

 public void clickOnLoginLink(){
        waitForElementDisplay(loginLink);
        loginLink.click();
    }
    public void enterUsernameAndPassWord(){
        waitForElementDisplay(username);
        username.sendKeys("t.ssewanyana@quidco.com");
        emailPassword.sendKeys("kalanzi09");
        signInButton.click();
    }
    public void validateUserLoggedIn(){
        waitForElementDisplay(userAvatar);
        assertTrue(userAvatar.isDisplayed());
    }


}
