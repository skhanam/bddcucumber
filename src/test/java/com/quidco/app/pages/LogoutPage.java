package com.quidco.app.pages;

import com.quidco.app.pageObjects.LogoutPageObjects;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ashishmohindroo on 11/9/16.
 */
public class LogoutPage extends  BasePage {

    LogoutPageObjects logoutPageObjects = PageFactory.initElements(driver,LogoutPageObjects.class);

    public void verifySignOutMessage(){

        waitForElementDisplay(logoutPageObjects.signOutMessage);
        Assert.assertTrue(logoutPageObjects.signOutMessage.getText().equalsIgnoreCase("You have successfully signed out - Sign back in"));
    }


}
