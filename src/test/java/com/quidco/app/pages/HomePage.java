package com.quidco.app.pages;

import com.quidco.app.pageObjects.HomePageObjects;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by thadeus on 11/04/16.
 */
public class HomePage extends BasePage {

    public static HomePageObjects homePageObjects = PageFactory.initElements(driver,HomePageObjects.class);
    public NotificationsPage clickAvatar(){
        homePageObjects.avatarIcon.click();
        return PageFactory.initElements(driver,NotificationsPage.class);
    }
    public boolean isAvatarVisible(){
        try {
            homePageObjects.avatarIcon.isDisplayed();
            return true;
        }catch(NoSuchElementException nosuchElementException){
            return false;
        }
    }

}


