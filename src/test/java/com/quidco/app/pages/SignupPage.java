package com.quidco.app.pages;

import com.quidco.app.pageObjects.SignupPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by amohindroo on 18/11/16.
 */
public class SignupPage extends BasePage {

    SignupPageObject signupPageObject = PageFactory.initElements(driver,SignupPageObject.class);

    public void fill_in_mandatory_details(){
        waitForElementDisplay(signupPageObject.firstname);
        signupPageObject.firstname.sendKeys("Quidco");
        signupPageObject.surname.sendKeys("Tester");
        signupPageObject.email.sendKeys(getUsername());
        signupPageObject.password.sendKeys(getPassword());
        toggleTermsCheckbox();
    }

    public void toggleTermsCheckbox(){
        check_checkbox_by_js("#agree_to_terms_join");
    }


    public void click_join_in(){
        signupPageObject.join_btn.click();
    }
}
