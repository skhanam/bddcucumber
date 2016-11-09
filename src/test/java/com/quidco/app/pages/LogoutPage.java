package com.quidco.app.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by ashishmohindroo on 11/9/16.
 */
public class LogoutPage extends  BasePage {

    @FindBy(css = ".alert-auth>h2")
    private WebElement signOutMessage;

    public void verifySignOutMessage(){
        Assert.assertTrue(signOutMessage.getText().equalsIgnoreCase("You have successfully signed out - Sign back in"));
    }


}
