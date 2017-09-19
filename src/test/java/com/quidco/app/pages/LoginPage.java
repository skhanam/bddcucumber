package com.quidco.app.pages;

import com.quidco.app.pageObjects.LandingPageObject;
import com.quidco.app.pageObjects.LoginPageObjects;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage {

    protected static LoginPageObjects loginPageObjects = PageFactory.initElements(driver, LoginPageObjects.class);
    protected static LandingPageObject landingPageObject = PageFactory.initElements(driver,LandingPageObject.class);
    private static LoginPage loginPage = new LoginPage();

    private LoginPage() {
    }

    public static LoginPage getInstance() {
        return loginPage;
    }

    public LoginPage enterUsernameAndPassWord(String username, String password) {
        if(isElementVisible(landingPageObject.dismissAlert)){
            landingPageObject.dismissAlert.click();

        }
        waitForElementDisplay(loginPageObjects.usernameInput);
        loginPageObjects.usernameInput.sendKeys(username);
        loginPageObjects.passwordInput.sendKeys(password);
        return this;
    }

    public LoginPage enterValidUsernameAndPassword(String existingUsername, String existingPassword){
        if(isElementVisible(landingPageObject.dismissAlert)){
            landingPageObject.dismissAlert.click();

        }
        waitForElementDisplay(loginPageObjects.usernameInput);
        loginPageObjects.usernameInput.sendKeys(existingUsername);
        loginPageObjects.passwordInput.sendKeys(existingPassword);
        return this;
    }

    public HomePage clickSignInBtn() {
        waitForElementDisplay(loginPageObjects.signInBtn);
        loginPageObjects.signInBtn.click();
        if(isElementVisible(landingPageObject.dismissAlert)){
            landingPageObject.dismissAlert.click();
            waitForElementDisplay(driver.findElement(By.cssSelector(".user")));

        }else
        if (isElementVisible(loginPageObjects.continueBtn)) {
            loginPageObjects.continueBtn.click();
            waitForElementDisplay(driver.findElement(By.cssSelector(".user")));
        }
        return HomePage.getInstance();
    }

    public void checkWrongCredentialsMessage() {
        waitForElementDisplay(loginPageObjects.alertMessage);
        Assert.assertEquals(loginPageObjects.alertMessage.getText().trim(), "Invalid username or password.");

    }

    public void checkWrongCredentialsMessageForFacebook() {
        waitForElementDisplay(loginPageObjects.alertMessageForFacebook);
        Assert.assertEquals(loginPageObjects.alertMessageForFacebook.getText().trim(), "Log in as Quidco Tester");
    }

    public SignupPage clickJoinIn() {
        waitForElementDisplay(loginPageObjects.joinNowBtn);
        loginPageObjects.joinNowBtn.click();
        return SignupPage.getInstance();
    }

    public FacebookLoginPage clickSignInWithFacebook() {
        WebElement facebookBtn = waitForElementDisplay(loginPageObjects.signInWithFacebookBtn);
        facebookBtn.click();
        return FacebookLoginPage.getInstance();

    }


}
