package com.quidco.app.helper;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by thadeus on 14/06/16.
 */
public class Tab2 {
    WebDriver driver;

    @Before
    public void setup() throws Exception {
        driver = new FirefoxDriver();
        driver.get("https://www.google.co.uk");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void openTab() {
        //Open tab 2 using CTRL + t keys.
        driver.findElement(By.cssSelector(".gb_P")).click();

    }
}
