package com.quidco.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ashishmohindroo on 11/8/16.
 */
public class NotificationsPage extends NavigationBarPage {

    @FindBy(css = ".sign-out>a[title='Logout']")
    private WebElement signOutLink;

    public LogoutPage clickSignOutLink(){
        waitForElementDisplay(signOutLink);
        signOutLink.click();
        return PageFactory.initElements(driver,LogoutPage.class);
    }

}
