package com.quidco.app.pages;

import com.quidco.app.pageObjects.NotificationsPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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

    public void clickTab(String tabName){
        driver.findElement(By.xpath(String.format(NotificationsPageObject.tabLocator,tabName))).click();
    }

    public void validateTitleOnAccountSummaryPage(List<String> eNames){

        for (String name : eNames) {
            waitForElementDisplay(driver.findElement(By.xpath(String.format(NotificationsPageObject.titleLocator,name))));
        }
    }

    public void validateLinksOnAccountSummaryPage(List<String> eNames){
        for (String name : eNames) {
            waitForElementDisplay(driver.findElement(By.xpath(String.format(NotificationsPageObject.LinksLocator,name))));
        }
    }

    public void validateButtonsOnAccountSummaryPage(List<String> eNames){
        for (String name : eNames) {

            scrollElementIntoView(driver.findElement(By.xpath(String.format(NotificationsPageObject.buttonLocator,name))));
            waitForElementDisplay(driver.findElement(By.xpath()));

        }
    }

}
