package com.quidco.app.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by ashishmohindroo on 11/11/16.
 */
public class LogoutPageObjects {

    @FindBy(css = ".alert-auth>h2")
    public static WebElement signOutMessage;

}
