package com.quidco.app.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by ashishmohindroo on 11/10/16.
 */
public class NotificationsPageObject {

    @FindBy(css = ".sign-out>a[title='Logout']")
    public static WebElement signOutLink;
    public static String tabLocator = "//div[@class=\"horizontal-tabs\"]/ul/li/a[text()='%s'\"]";
    public static String titleLocator = "//div[@class='account-notifications']" +
            "/div[@class='container']//h4[contains(text(),'%s')]";
    public static String LinksLocator = "//div[@class='notification-annotation']//p/a[contains(text(),'%s')]";
    public static String buttonLocator = "//div[@class='notification-annotation']//a/button[contains(text(),'%s')]";
}
