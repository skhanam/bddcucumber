package com.quidco.app.pages;

import com.quidco.app.pageObjects.NotificationsPageObject;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ashishmohindroo on 11/8/16.
 */
public class NotificationsPage extends BasePage {

    private static NotificationsPage notificationsPage = new NotificationsPage();

    private NotificationsPage(){}

    public static NotificationsPage getInstance(){
        return notificationsPage;
    }

    protected NotificationsPageObject notificationsPageObject = PageFactory.initElements(driver,NotificationsPageObject.class);

    public LogoutPage clickSignOutLink(){
        waitForElementDisplay(notificationsPageObject.signOutLink);
        notificationsPageObject.signOutLink.click();
        return LogoutPage.getInstance();
    }

}
