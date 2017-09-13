package com.quidco.app.pages;

import com.quidco.app.pageObjects.FacebookLoginPageObject;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ashishmohindroo on 11/30/16.
 */
public class FacebookLoginPage extends BasePage {
    private static FacebookLoginPage facebookLoginPage = new FacebookLoginPage();
    protected FacebookLoginPageObject facebookLoginPageObject = PageFactory.initElements(driver, FacebookLoginPageObject.class);

    private FacebookLoginPage() {
    }

    public static FacebookLoginPage getInstance() {
        return facebookLoginPage;
    }

    public FacebookLoginPage enterUsernameAndPassword(String username, String password) {
        waitForElementDisplay(facebookLoginPageObject.emailInput);

        facebookLoginPageObject.emailInput.sendKeys(username);


        facebookLoginPageObject.passwordInput.sendKeys(password);
        return this;
    }

    public HomePage clickLogin() {
        facebookLoginPageObject.loginBtn.click();
        return HomePage.getInstance();
    }


}
