package com.quidco.app.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by ashishmohindroo on 11/10/16.
 */
public class LandingPageObject {
    @FindBy(css = ".nav>.signin>a.link")
    public static WebElement signInLink;

    @FindBy(css = ".signed-out")
    public static List<WebElement> frontPageSignInLinks;
}
