package com.quidco.app.utility;

import com.quidco.app.helper.SizzleSelector;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


/**
 * Created by Thadeus on 11/04/2016.
 */

/**
 * Customised {@link ChromeDriver} which has been extended and customized in order to exclusively use sizzle.js
 * for all Selenium CSS selectors.
 */
public class QuidcoChromeDriver extends ChromeDriver{

    /**
     * Sizzle CSS Selector implementation
     */
    private final SizzleSelector sizzleSelector;

    /**
     * Driver constructor
     *
     * @param desiredCapabilities to be passed into the standard ChromeDriver
     */
    public QuidcoChromeDriver(Capabilities desiredCapabilities) {
        super(desiredCapabilities);
        sizzleSelector = new SizzleSelector(this);
    }

    @Override
    public WebElement findElementByCssSelector(String using) {
        return sizzleSelector.findElementBySizzleCss(using);
    }

    @Override
    public List<WebElement> findElementsByCssSelector(String using) {
        return sizzleSelector.findElementsBySizzleCss(using);
    }

}
