package com.quidco.app.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by ashishmohindroo on 11/30/16.
 */
public class FacebookLoginPageObject {

    @FindBy(id = "email")
    public static WebElement emailInput;
    @FindBy(id = "pass")
    public static WebElement passwordInput;
    @FindBy(id = "loginbutton")
    public static WebElement loginBtn;

}
