package com.quidco.app.utility;

import com.quidco.app.helper.SizzleSelector;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.List;

/**
 * Created by Thadeus on 11/04/2016.
 */

public class QuidcoInternetExplorerDriver extends InternetExplorerDriver {
    /**
     * Sizzle CSS Selector implementation
     */
    private final SizzleSelector sizzleSelector;

    /**
     * Driver constructor
     *
     * @param desiredCapabilities to be passed into the standard InternetExplorerDriver
     */
    public QuidcoInternetExplorerDriver(Capabilities desiredCapabilities) {
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
