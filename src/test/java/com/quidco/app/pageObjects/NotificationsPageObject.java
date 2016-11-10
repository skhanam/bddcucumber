package com.quidco.app.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by ashishmohindroo on 11/10/16.
 */
public class NotificationsPageObject {

    @FindBy(css = ".sign-out>a[title='Logout']")
    public static WebElement signOutLink;
}
