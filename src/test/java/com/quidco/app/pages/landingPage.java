package com.quidco.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by thadeus on 19/04/16.
 */
public class landingPage {

    @FindBy(css = ".touch-link.mixpanel-search-merchant-link")
    private WebElement searchResults;
}
