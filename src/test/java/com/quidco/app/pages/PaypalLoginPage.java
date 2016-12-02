package com.quidco.app.pages;

import com.quidco.app.pageObjects.PaypalLoginPageObject;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ashishmohindroo on 11/30/16.
 */
public class PaypalLoginPage extends BasePage {
    private static PaypalLoginPage facebookLoginPage = new PaypalLoginPage();

    private PaypalLoginPage(){}

    public static PaypalLoginPage getInstance(){
        return facebookLoginPage;
    }
    protected PaypalLoginPageObject paypalLoginPageObject = PageFactory.initElements(driver,PaypalLoginPageObject.class);

    public PaypalLoginPage enterUsernameAndPassword(String username, String password){
        paypalLoginPageObject.emailInput.sendKeys(username);
        paypalLoginPageObject.passwordInput.sendKeys(password);
        return this;
    }
    public HomePage clickLogin(){
        paypalLoginPageObject.loginBtn.click();
        return HomePage.getInstance();
    }


}
