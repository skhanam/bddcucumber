package com.quidco.app.pages;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by thadeus on 04/05/16.
 */
public class TestHomePage {
    WebDriver driver= null;
    @Before
    public void SetUp(){
        driver = new FirefoxDriver();
        driver.get("https://www.quidco.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void RateTests(){
       WebElement search = driver.findElement(By.cssSelector("#store-q1search"));
      //  search.clear();
      search.sendKeys("Amazon");
    List<WebElement> Rates= driver.findElements(By.cssSelector(".rate"));
        for (WebElement el : Rates){
            System.out.println(el.getText());
        }

    }
}
