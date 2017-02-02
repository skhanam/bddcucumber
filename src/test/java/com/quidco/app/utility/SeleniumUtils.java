package com.quidco.app.utility;

import com.google.common.base.Function;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by ashishmohindroo on 11/10/16.
 */
public abstract class SeleniumUtils {
    public static WebDriverWait wait;
    public static Wait flwait;
    public static WebDriver driver = null;
    public static JavascriptExecutor executor;
    public static Actions actions;


    public WebElement waitForElementDisplay(final WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public List<WebElement> waitForAllElements(final List<WebElement> elements) {
        return wait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }

    public WebElement waitForPresenceOfElement(By by ){
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
    public boolean isListNotEmpty(final List<WebElement> elments) {
        if (elments == null)
            return false;
        return elments.size() != 0 ? true : false;
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

    public void check_checkbox_by_js(final String css_selector) {
        executor.executeScript("$(arguments[0]).get(0).checked = true;", css_selector);
    }

    public void uncheck_checkbox_by_js(final String css_selector) {
        executor.executeScript("$(arguments[0]).get(0).checked = false;", css_selector);
    }

    public void scrollElementIntoView(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void scrollElementIntoViewatBottom(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", element);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void scrollElementIntoMiddle(WebElement element) {
        String scrollElementIntoMiddle = "var viewPortHeight=Math.max(document.documentElement.clientHeight,window.innerHeight||0)," +
                "elementTop=arguments[0].getBoundingClientRect().top;window.scrollBy(0,elementTop-viewPortHeight/2);";
        ((JavascriptExecutor) driver).executeScript(scrollElementIntoMiddle, element);
    }

    public String switchToPopWindow() {
        String parentWindowHandler = driver.getWindowHandle();
        String subWindowHandler = null;

        Set<String> handles = driver.getWindowHandles();
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()) {
            subWindowHandler = iterator.next();
        }
        driver.switchTo().window(subWindowHandler);
        return parentWindowHandler;
    }

    public void switchBackToParentWindow(String subWindowHandler) {
        driver.switchTo().window(subWindowHandler);
    }

    public void validateText(WebElement e, String textToAssert) {
        Assert.assertThat(e.getText(), CoreMatchers.containsString(textToAssert));
    }

    public void preciseWaitForElement(WebElement e) {
        flwait.until(new Function() {
            @Override
            public Object apply(Object o) {
                return e;
            }
        });

    }

    public List<WebElement> preciseWaitForElements(List<WebElement> elements) {

        return (List<WebElement>)flwait.until(new Function() {
            @Override
            public Object apply(Object o) {
                return elements;
            }
        });
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void executeJS(String jsCode) {
        ((JavascriptExecutor) driver).executeScript(jsCode);
    }

}
