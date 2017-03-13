package com.quidco.app.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by ashishmohindroo on 11/11/16.
 */
public class LogoutPageObject {

    @FindBy(css = "#messages_area .alert-text")
    public static WebElement signOutMessage;

}
