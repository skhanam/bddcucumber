package com.quidco.app.pages;

import com.quidco.app.pageObjects.FacebookLoginPageObject;
import com.quidco.app.pageObjects.HomePageObject;
import com.quidco.app.pageObjects.SignupPageObject;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ashishmohindroo on 11/30/16.
 */
public class FacebookLoginPage extends BasePage {
    private static FacebookLoginPage facebookLoginPage = new FacebookLoginPage();

    private FacebookLoginPage(){}

    public static FacebookLoginPage getInstance(){
        return facebookLoginPage;
    }
    protected FacebookLoginPageObject facebookLoginPageObject = PageFactory.initElements(driver,FacebookLoginPageObject.class);

    public FacebookLoginPage enterUsernameAndPassword(String username,String password){
        facebookLoginPageObject.emailInput.sendKeys(username);
        facebookLoginPageObject.passwordInput.sendKeys(password);
        return this;
    }
    public void clickLogin(){
        facebookLoginPageObject.loginBtn.click();
    }


}
