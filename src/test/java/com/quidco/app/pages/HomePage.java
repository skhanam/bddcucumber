package com.quidco.app.pages;

import com.quidco.app.pageObjects.HomePageObject;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by thadeus on 11/04/16.
 */
public class HomePage extends BasePage {

    private static HomePage homePage = new HomePage();

    private HomePage(){}

    public static HomePage getInstance(){
        return homePage;
    }
    protected static HomePageObject homePageObject = PageFactory.initElements(driver,HomePageObject.class);

    public NotificationsPage clickAvatar(){
        homePageObject.avatarIcon.click();
        return NotificationsPage.getInstance();
    }
    public boolean isAvatarVisible(){
        try {
            homePageObject.avatarIcon.isDisplayed();
            return true;
        }catch(NoSuchElementException nosuchElementException){
            return false;
        }
    }

}


