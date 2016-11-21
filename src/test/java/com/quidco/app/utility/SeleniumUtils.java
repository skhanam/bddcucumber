package com.quidco.app.utility;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by ashishmohindroo on 11/10/16.
 */
public abstract  class SeleniumUtils {
    public static WebDriverWait wait;
    public static WebDriver driver = null;
    public static JavascriptExecutor executor ;
    public void waitForElementDisplay(final WebElement element) {

        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public boolean isElementVisible(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        } catch (TimeoutException e) {
        }
        return false;
    }

    public void check_checkbox_by_js(String id){
        executor.executeScript("return $(\"#arguments[0]\").prop(\"checked\", true);",id);
    }

    public void uncheck_checkbox_by_js(String id){
        executor.executeScript("$(\"#arguments[0]\").prop(\"checked\", true);",id);
    }
}
