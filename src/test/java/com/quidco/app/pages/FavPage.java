package com.quidco.app.pages;

import com.quidco.app.pageObjects.FacebookLoginPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

/**
 * Created by amohindroo on 02/03/17.
 */
public class FavPage extends BasePage {

    private static FavPage favPage = new FavPage();

    private FavPage(){}

    public static FavPage getInstance(){
        return favPage;
    }
//    protected FacebookLoginPageObject facebookLoginPageObject = PageFactory.initElements(driver,FacebookLoginPageObject.class);
    public void removeAllRetailersAsFav(){
        List<WebElement> numOfRetailers = driver.findElements(By.cssSelector("div.settings-field .icon-primary-expand-bg"));
        for(WebElement e: numOfRetailers)
        {
            e.click();
            WebElement remove_btn = waitForElementDisplay(driver.findElement(By.cssSelector("input.remove-favourite")));
            scrollElementIntoMiddle(remove_btn);
            remove_btn.click();
            flwait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("input.remove-favourite")));
            numOfRetailers = driver.findElements(By.cssSelector("div.settings-field .icon-primary-expand-bg"));

        }


    }


}
