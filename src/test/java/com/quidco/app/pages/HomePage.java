package com.quidco.app.pages;

import com.quidco.app.pageObjects.HomePageObjects;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by thadeus on 11/04/16.
 */
public class HomePage extends BasePage {

    HomePageObjects homePageObjects = PageFactory.initElements(driver,HomePageObjects.class);
    public NotificationsPage clickAvatar(){
        homePageObjects.avatarIcon.click();
        return PageFactory.initElements(driver,NotificationsPage.class);
    }
    public void verifyAvatarVisible(String status){
        String actual_status;
        if(homePageObjects.avatarIcon.isDisplayed()){
            actual_status = "valid";
        }else {
            actual_status = "invalid";
        }
        Assert.assertEquals(status,actual_status);


    }


}


