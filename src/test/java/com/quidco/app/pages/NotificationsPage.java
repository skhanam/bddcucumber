package com.quidco.app.pages;

import com.quidco.app.pageObjects.NotificationsPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by ashishmohindroo on 11/8/16.
 */
public class NotificationsPage extends BasePage {

    private static NotificationsPage notificationsPage = new NotificationsPage();
    protected NotificationsPageObject notificationsPageObject = PageFactory.initElements(driver, NotificationsPageObject.class);

    private NotificationsPage() {
    }

    public static NotificationsPage getInstance() {
        return notificationsPage;
    }

    public LogoutPage clickSignOutLink() throws InterruptedException {
        Thread.sleep(1500);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].removeAttribute('class')", notificationsPageObject.signOutLink);
        waitForElementDisplay(notificationsPageObject.signOutLink);
        notificationsPageObject.signOutLink.click();
        return LogoutPage.getInstance();
    }

    public NotificationsPage clickTab(String tabName) {
        driver.findElement(By.xpath(String.format(NotificationsPageObject.tabLocator, tabName))).click();
        return this;
    }

    public NotificationsPage validateTitleOnAccountSummaryPage(List<String> eNames) {

        for (String name : eNames) {
            waitForElementDisplay(driver.findElement(By.xpath(String.format(NotificationsPageObject.titleLocator, name))));
        }
        return this;
    }

    public NotificationsPage validateLinksOnAccountSummaryPage(List<String> eNames) {
        for (String name : eNames) {
            waitForElementDisplay(driver.findElement(By.xpath(String.format(NotificationsPageObject.LinksLocator, name))));
        }
        return this;
    }

    public NotificationsPage validateButtonsOnAccountSummaryPage(List<String> eNames) {
        for (String name : eNames) {
            waitForElementDisplay(driver.findElement(By.xpath(String.format(NotificationsPageObject.buttonLocator, name))));
        }
        return this;
    }

    public NotificationsPage validateTitleOnAppropriateTab(String title, String tabName) {
        switch (tabName) {
            case "Activity":
                waitForElementDisplay(driver.findElement(By.xpath(String.format(NotificationsPageObject.activityTabTitle, title))));
                break;
            case "Payments":
                waitForElementDisplay(driver.findElement(By.xpath(String.format(NotificationsPageObject.paymentsTabTitle, title))));
                break;
            case "Refer Quidco":
                waitForElementDisplay(driver.findElement(By.xpath(String.format(NotificationsPageObject.referQuidcoTitle, title))));
                break;
            case "My reviews":
                waitForElementDisplay(driver.findElement(By.xpath(String.format(NotificationsPageObject.myreviewsTitle, title))));
                break;
            case "Settings":
                waitForElementDisplay(driver.findElement(By.xpath(String.format(NotificationsPageObject.settingsTitle, title))));
                break;
        }
        return this;
    }

}
