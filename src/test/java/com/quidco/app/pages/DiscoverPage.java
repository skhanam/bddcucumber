package com.quidco.app.pages;

import com.quidco.app.pageObjects.DiscoverPageObjects;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class DiscoverPage extends BasePage {

    protected static DiscoverPageObjects discoverPageObjects = PageFactory.initElements(driver, DiscoverPageObjects.class);
    private static DiscoverPage loginPage = new DiscoverPage();
    public String retailerName;

    private DiscoverPage() {
    }

    public static DiscoverPage getInstance() {
        return loginPage;
    }

    public void click_random_retailer() {
        int randomNumber = new Random().nextInt(discoverPageObjects.merchantDivs.size() - 1) + 1;
        if (randomNumber<0) {
            randomNumber *= -1 ;
            WebElement div = discoverPageObjects.merchantDivs.get(randomNumber);
            retailerName = div.findElement(By.cssSelector(discoverPageObjects.merchantNameLoc)).getText();
            System.out.println("Going to click Merchant ->  " + retailerName);
            WebElement merchantBtn = div.findElement(By.cssSelector(discoverPageObjects.merchantBtnLoc));
            merchantBtn.click();
        } else {
            WebElement div = discoverPageObjects.merchantDivs.get(randomNumber);
            retailerName = div.findElement(By.cssSelector(discoverPageObjects.merchantNameLoc)).getText();
            System.out.println("Going to click Merchant ->  " + retailerName);
            WebElement merchantBtn = div.findElement(By.cssSelector(discoverPageObjects.merchantBtnLoc));
            merchantBtn.click();
        }
    }

    public void verify_correct_landing_page() {
        switchToPopWindow();
        preciseWaitForElement(discoverPageObjects.retailerHeaderTitle);
       Assert.assertTrue(discoverPageObjects.retailerHeaderTitle.getText().contains(retailerName));
    }
}
