package com.quidco.app.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
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
    @FindBy(xpath = "//a[@href='/facebook-auth/?sign_in_redirect_path=%2F']")
    public static List<WebElement> signInWithFacebookBtns;
    @FindBy(css = ".panel .alert-text")
    public static WebElement alertMessage;
    @FindBy(css = ".panel div.pull-right>a")
    public static WebElement joinNowBtn;


}
