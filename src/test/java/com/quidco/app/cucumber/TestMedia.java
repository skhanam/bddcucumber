package com.quidco.app.cucumber;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by thadeus on 06/05/16.
 */
public class TestMedia {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new FirefoxDriver();
        driver.get("http://www.quidco.com");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();

      WebElement searchfield = driver.findElement(By.xpath("//*[@id='store-q1search']"));
        searchfield.sendKeys("marks and Spencer");


        List<WebElement> topMerchantResult = driver.findElements(By.cssSelector(".touch-link.mixpanel-search-merchant-link"));
        for (WebElement topmerchant: topMerchantResult) {
            System.out.println(driver.findElements(By.cssSelector(".touch-link.mixpanel-search-merchant-link")).size());
            assertTrue(topmerchant.getText().contains("Debenhams "));
        }
            List<WebElement> topRate = driver.findElements(By.cssSelector(".rate"));
            for (WebElement rate : topRate) {
                System.out.println(rate.getText());
                Integer.parseInt(rate.getAttribute("3%"));
                assertTrue(rate.getText().contains("3%"));


            }
        }
    }