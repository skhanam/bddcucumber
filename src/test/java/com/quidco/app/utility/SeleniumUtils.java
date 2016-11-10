package com.quidco.app.utility;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by ashishmohindroo on 11/10/16.
 */
public abstract  class SeleniumUtils {
    public static WebDriverWait wait;
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
}
