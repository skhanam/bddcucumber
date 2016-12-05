package com.quidco.app.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by ashishmohindroo on 11/11/16.
 */
public class LoginPageObjects {

    @FindBy(id = "username")
    public static WebElement usernameInput;
    @FindBy(id = "password")
    public static WebElement passwordInput;
    @FindBy(id = "continue")
    public static WebElement continueBtn;
    @FindBy(xpath = "//*[@id=\"sign-in-page-form\"]/div/div[1]/div[3]/input")
    public static WebElement signInBtn;
    @FindBy(css = "#page-content .form-group-facebook")
    public static WebElement signInWithFacebookBtn;
    @FindBy(css = ".panel .alert-text")
    public static WebElement alertMessage;
    @FindBy(xpath = "//span[.='Log in as Quidco Tester']")
    public static WebElement alertMessageForFacebook;
    @FindBy(css = ".panel div.pull-right>a")
    public static WebElement joinNowBtn;

}
