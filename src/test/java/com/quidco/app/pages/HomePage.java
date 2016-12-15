package com.quidco.app.pages;

import com.quidco.app.pageObjects.HomePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by thadeus on 11/04/16.
 */
public class HomePage extends BasePage {

    private static HomePage homePage = new HomePage();

    private HomePage(){}

    public static HomePage getInstance(){
        return homePage;
    }
    public  static HomePageObject homePageObject = PageFactory.initElements(driver,HomePageObject.class);

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
    public void moveToAvatarIcon(){
        Actions builder  = new Actions(driver);
        builder.moveToElement(homePageObject.avatarIcon).build().perform();
    }
    public void verifyDropDownOptions(List<String> options){
        for(String option:options){
            switch(option){
                case "Account Summary":
                case "Activity":
                case "Payments":
                    waitForElementDisplay(driver.findElement(By.xpath(String.format(HomePageObject.userDropdownOptions,option))));
                    break;
                case "Refer Quidco":
                case "My reviews":
                case "Settings":
                    waitForElementDisplay(driver.findElement(By.xpath(String.format(HomePageObject.userDropdownOptionsWithSingleLine,option))));
                    break;
            }
        }
    }
    public NotificationsPage click_dropdown_option(String option){

       WebElement el =  waitForElementDisplay(driver.findElement(By.xpath(String.format(HomePageObject.userDropdownOptions,option,option))));
        el.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return NotificationsPage.getInstance();
    }

}


