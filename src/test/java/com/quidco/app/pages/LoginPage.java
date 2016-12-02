package com.quidco.app.pages;

import com.quidco.app.pageObjects.LoginPageObjects;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by thadeus on 11/04/16.
 */
public class LoginPage extends BasePage{

    private static LoginPage loginPage = new LoginPage();

    private LoginPage(){}

    public static LoginPage getInstance(){
        return loginPage;
    }

    protected static LoginPageObjects loginPageObjects = PageFactory.initElements(driver,LoginPageObjects.class);

    public LoginPage enterUsernameAndPassWord(String username,String password){
        waitForElementDisplay(loginPageObjects.usernameInput);
        loginPageObjects.usernameInput.sendKeys(username);
        loginPageObjects.passwordInput.sendKeys(password);
        return this;
    }
    public HomePage clickSignInBtn(){
        waitForElementDisplay(loginPageObjects.signInBtn);
        loginPageObjects.signInBtn.click();
        if(isElementVisible(loginPageObjects.continueBtn)){
            loginPageObjects.continueBtn.click();
            waitForElementDisplay(driver.findElement(By.cssSelector(".user")));
        }
        return HomePage.getInstance();
    }
    public void checkWrongCredentialsMessage(){
        waitForElementDisplay(loginPageObjects.alertMessage);
        Assert.assertEquals(loginPageObjects.alertMessage.getText().trim(),"Invalid username or password.");

    }
    public void checkWrongCredentialsMessageForFacebook(){
        waitForElementDisplay(loginPageObjects.alertMessageForFacebook);
        Assert.assertEquals(loginPageObjects.alertMessageForFacebook.getText().trim(),"Log in as Quidco Tester");
    }

    public SignupPage clickJoinIn(){
        waitForElementDisplay(loginPageObjects.joinNowBtn);
        loginPageObjects.joinNowBtn.click();
        return SignupPage.getInstance();
    }
    public FacebookLoginPage clickSignInWithFacebook(){
        WebElement facebookBtn = waitForElementDisplay(loginPageObjects.signInWithFacebookBtn);
        facebookBtn.click();
        return FacebookLoginPage.getInstance();
    }
    public PaypalLoginPage clickSignInWithPayPal(){
        WebElement paypalBtn = waitForElementDisplay(loginPageObjects.signInWithPaypalBtns.get(0));
        paypalBtn.click();
        return PaypalLoginPage.getInstance();
    }

}
