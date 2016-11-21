package com.quidco.app.pages;

import com.quidco.app.pageObjects.SignupPageObject;
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
        signupPageObject.email.sendKeys(username);
        signupPageObject.password.sendKeys(password);
        setTermsCheckbox();
    }

    public void setTermsCheckbox(){
        check_checkbox_by_js("agree_to_terms_join");
    }
    public void unsetTermsCheckbox(){
        uncheck_checkbox_by_js("agree_to_terms_join");
    }


    public void click_join_in(){
        signupPageObject.join_btn.click();
    }
}
