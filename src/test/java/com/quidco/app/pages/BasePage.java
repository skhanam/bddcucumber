package com.quidco.app.pages;

import com.quidco.app.helper.Constants;
import com.quidco.app.utility.Driver;
import com.quidco.app.utility.QuidcoChromeDriver;
import com.quidco.app.utility.QuidcoFirefoxDriver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by ashishmohindroo on 11/8/16.
 */
public abstract class  BasePage {

    public static WebDriver driver = null;
    public static WebDriverWait wait = null;

    public static WebDriver getDriverInstance(String browsertype) throws IOException {
        if (browsertype.equalsIgnoreCase("firefox") || browsertype.equalsIgnoreCase("")) {
            DesiredCapabilities dc = new DesiredCapabilities();
            driver = new QuidcoFirefoxDriver(dc);
        } else {
            if (browsertype.equalsIgnoreCase("chrome")) {
                DesiredCapabilities dc = DesiredCapabilities.chrome();
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + Constants.chromeMacdriver);
                driver = new QuidcoChromeDriver(dc);
            }
        }
        wait = new WebDriverWait(driver,10);
        return driver;
    }


    public void waitForElementDisplay(final WebElement element) {

        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public boolean isElementVisible(WebElement element){
        try{
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        }catch(NoSuchElementException e){
            return  false;
        }
        catch (TimeoutException e){}
        return false;
    }
}
