package com.quidco.app.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by amohindroo on 18/11/16.
 */
public class SignupPageObject {

    @FindBy(id = "first_name_join")
    public static WebElement firstname;

    @FindBy(id = "last_name_join")
    public static WebElement surname;

    @FindBy(id = "new_email_join")
    public static WebElement email;

    @FindBy(id = "new_password_join")
    public static WebElement password;

    @FindBy(id = "join-quidco-submit-button")
    public static WebElement join_btn;
}
