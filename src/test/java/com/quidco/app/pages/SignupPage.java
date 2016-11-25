package com.quidco.app.pages;

import com.quidco.app.pageObjects.SignupPageObject;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by amohindroo on 18/11/16.
 */
public class SignupPage extends BasePage {

    private static SignupPage signupPage = new SignupPage();

    private SignupPage(){}

    public static SignupPage getInstance(){
        return signupPage;
    }
    protected SignupPageObject signupPageObject = PageFactory.initElements(driver,SignupPageObject.class);

    public SignupPage fill_in_mandatory_details(){
        waitForElementDisplay(signupPageObject.firstname);
        signupPageObject.firstname.sendKeys("Quidco");
        signupPageObject.surname.sendKeys("Tester");
        signupPageObject.email.sendKeys(getUsername());
        signupPageObject.password.sendKeys(getPassword());
        toggleTermsCheckbox();
        return this;
    }

    public SignupPage toggleTermsCheckbox(){
        check_checkbox_by_js("#agree_to_terms_join");
        return this;
    }


    public OnboardingPage click_join_in(){
        signupPageObject.join_btn.click();
        return OnboardingPage.getInstance();
    }
}
