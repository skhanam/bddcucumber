package com.quidco.app.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ashishmohindroo on 11/8/16.
 */
public class SecondNavigationBarPage extends BasePage{

    @FindBy(css = ".user")
    private WebElement avatarIcon;

    public NotificationsPage clickAvatar(){
        avatarIcon.click();
        return PageFactory.initElements(driver,NotificationsPage.class);
    }
    public void verifyAvatarVisible(){
        Assert.assertTrue(avatarIcon.isDisplayed());
    }

}
