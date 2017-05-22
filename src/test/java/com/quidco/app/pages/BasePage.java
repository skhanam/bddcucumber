package com.quidco.app.pages;

import com.quidco.app.helper.Constants;
import com.quidco.app.utility.PropertyReader;
import com.quidco.app.utility.SeleniumUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * Created by ashishmohindroo on 11/8/16.
 */
public abstract class BasePage extends SeleniumUtils {

    public static Logger logger = Logger.getLogger(BasePage.class.getName());
    public static Properties properties = PropertyReader.getPropertyReader();
    public static String os = System.getProperty("os.name");
    public static String quidcoAppUrl;
    public static String browserType;
    public static String user_subscription;
    protected static String username;
    private static String password = "quidcoqatest";


    public BasePage() {
        quidcoAppUrl = properties.getProperty("URL");
    }

    public static WebDriver getDriverInstance() throws IOException {
        browserType = properties.getProperty("BROWSER");
        DesiredCapabilities dc = null;
        switch (browserType) {
            case "Firefox":
            case "firefox":
                dc = DesiredCapabilities.firefox();
                switch (os) {
                    case "Mac OS X":
                        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + Constants.firefoxMacdriver);
                        break;
                    case "LINUX":
                        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + Constants.firefoxLinuxdriver);
                        break;
                    case "WINDOWS":
                        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + Constants.firefoxWindowsdriver);
                        break;
                    default:
                        System.out.println("NO OS FOUND!!!");
                }
                driver = new FirefoxDriver(dc);
                break;
            case "Chrome":
            case "chrome":
                dc = DesiredCapabilities.chrome();
                switch (os) {
                    case "Mac OS X":
                        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + Constants.chromeMacdriver);
                        break;
                    case "LINUX":
                        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + Constants.chromeLinuxdriver);
                        break;
                    case "WINDOWS":
                        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + Constants.chromeWindowsdriver);
                        break;
                }
                driver = new ChromeDriver(dc);
                driver.manage().window().setPosition(new Point(0, 0));
                driver.manage().window().setSize(new Dimension(1004, 748));

        }
        wait = new WebDriverWait(driver, 10);
        flwait = new FluentWait(driver).pollingEvery(5, TimeUnit.SECONDS).withTimeout(15, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
        executor = (JavascriptExecutor) driver;
        actions = new Actions(driver);
        return driver;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String uname) {

        username = uname;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String pwd) {

        password = pwd;
    }

    public String getUserSubscription() {

        return user_subscription;
    }

    public void setUserSubscription(String user_subs) {

        user_subscription = user_subs;
    }
}
