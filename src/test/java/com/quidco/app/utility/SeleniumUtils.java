package com.quidco.app.utility;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by ashishmohindroo on 11/10/16.
 */
public abstract  class SeleniumUtils {
    public static WebDriverWait wait;
    public static WebDriver driver = null;
    public static JavascriptExecutor executor ;
    public WebElement waitForElementDisplay(final WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public boolean isElementVisible(final WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public void check_checkbox_by_js(final String css_selector){
        executor.executeScript("$(arguments[0]).get(0).checked = true;",css_selector);
    }
    public void uncheck_checkbox_by_js(final String css_selector){
        executor.executeScript("$(arguments[0]).get(0).checked = false;",css_selector);
    }
    public void scrollElementIntoView(WebElement element){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",element);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String switchToPopWindow(){
        String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
        String subWindowHandler = null;

        Set<String> handles = driver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()){
            subWindowHandler = iterator.next();
        }
        driver.switchTo().window(subWindowHandler);
        return parentWindowHandler;
    }

    public void switchBackToParentWindow(String subWindowHandler){
        driver.switchTo().window(subWindowHandler);
    }

}
