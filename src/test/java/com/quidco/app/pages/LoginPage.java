package com.quidco.app.pages;

import com.quidco.app.pageObjects.LoginPageObjects;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by thadeus on 11/04/16.
 */
public class LoginPage extends BasePage{


    LoginPageObjects loginPageObjects = PageFactory.initElements(driver,LoginPageObjects.class);

    public LoginPage enterUsernameAndPassWord(String username,String password){
        waitForElementDisplay(loginPageObjects.usernameInput);
        loginPageObjects.usernameInput.sendKeys(username);
        loginPageObjects.passwordInput.sendKeys(password);
        return this;
    }
    public HomePage clickSignInBtn(){
        loginPageObjects.signInBtn.click();
        if(isElementVisible(loginPageObjects.continueBtn)){
            loginPageObjects.continueBtn.click();
        }
        return PageFactory.initElements(driver,HomePage.class);
    }
    public void checkWrongCredentialsMessage(){

    }
    public SignupPage clickJoinIn(){
        waitForElementDisplay(loginPageObjects.joinNowBtn);
        loginPageObjects.joinNowBtn.click();
        return new SignupPage();
    }
}
