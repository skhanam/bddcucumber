package com.quidco.app.pageStepdef;

import com.quidco.app.pages.HomePage;
import com.quidco.app.pages.LoginPage;
import com.quidco.app.utility.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by thadeus on 11/04/16.
 */
public class LoginPageStepdef extends BaseStepdef {


    @When("^I enter my credentials$")
    public void i_enter_my_credentials() throws Throwable {
        loginPage.enterUsernameAndPassWord();
    }

    @And("^I click signIn$")
    public void clickSignInBtn() {
        landingPage = loginPage.clickSignInBtn();
    }


}
