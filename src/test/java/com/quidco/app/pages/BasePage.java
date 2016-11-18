package com.quidco.app.pages;

import com.quidco.app.helper.Constants;
import com.quidco.app.utility.PropertyReader;
import com.quidco.app.utility.SeleniumUtils;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * Created by ashishmohindroo on 11/8/16.
 */
public abstract class BasePage extends SeleniumUtils{

    public static WebDriver driver = null;
    public static Logger logger = Logger.getLogger(BasePage.class.getName());
    public static Properties properties = PropertyReader.getPropertyReader();
    public static String QuidcoAppUrl;
    public static String username ;
    public static String password ;


    public BasePage(){
        QuidcoAppUrl = properties.getProperty("URL");
    }

    public static WebDriver getDriverInstance(String browsertype) throws IOException {
        if (browsertype.equalsIgnoreCase("firefox") || browsertype.equalsIgnoreCase("Firefox")) {
            DesiredCapabilities dc = new DesiredCapabilities();
            driver = new FirefoxDriver(dc);
        } else {
            if (browsertype.equalsIgnoreCase("chrome")) {
                DesiredCapabilities dc = DesiredCapabilities.chrome();
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + Constants.chromeMacdriver);
                driver = new ChromeDriver(dc);
            }
        }
        wait = new WebDriverWait(driver, 10);
        return driver;
    }
}
