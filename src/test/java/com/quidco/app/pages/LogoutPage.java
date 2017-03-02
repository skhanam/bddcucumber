package com.quidco.app.pages;

import com.quidco.app.pageObjects.LogoutPageObject;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ashishmohindroo on 11/9/16.
 */
public class LogoutPage extends BasePage {

    private static LogoutPage logoutPage = new LogoutPage();
    protected LogoutPageObject logoutPageObject = PageFactory.initElements(driver, LogoutPageObject.class);

    private LogoutPage() {
    }

    public static LogoutPage getInstance() {
        return logoutPage;
    }

    public void verifySignOutMessage() {

        waitForElementDisplay(logoutPageObject.signOutMessage);
        Assert.assertTrue(logoutPageObject.signOutMessage.getText().equalsIgnoreCase("You have successfully signed out - Sign back in"));
    }


}
