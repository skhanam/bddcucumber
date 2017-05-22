package com.quidco.app.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by ashishmohindroo on 11/10/16.
 */
public class NotificationsPageObject {

    public final static String tabLocator = "//div[contains(@class,'horizontal-tabs')]/ul/li/a[text()='%s']";
    public final static String titleLocator = "//div[@class='account-notifications']" +
            "/div[@class='container']//h4[contains(text(),'%s')]";
    public final static String LinksLocator = "//div[@class='notification-annotation']//p/a[contains(text(),'%s')]";
    public final static String buttonLocator = "//div[@class='account-notifications']/div[@class='container']//p[contains(@class,'huge')]/a/button[text()='%s']";
    public final static String activityTabTitle = "//*[@id=\"left_nav\"]/ul/li[1]/a[contains(text(),'%s')]";
    public final static String paymentsTabTitle = "//div[@id='payments_page']//div[contains(@class,'price-header')]/h1[contains(text(),'%s')]";
    public final static String referQuidcoTitle = "//*[@id=\"page-content\"]/div[5]/div/div[3]/div/h2[contains(text(),'%s')]";
    public final static String myreviewsTitle = "//*[@id=\"page-content\"]/div[5]/div/div[1]/div/h1[contains(text(),'%s')]";
    public final static String settingsTitle = "//*[@id=\"page-content\"]/div[4]/div/div[2]/h1[contains(text(),'%s')]";

    @FindBy(id = "cas-sign-out")
    public static WebElement signOutLink;

}
