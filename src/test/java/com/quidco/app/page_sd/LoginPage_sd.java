package com.quidco.app.page_sd;

import com.quidco.app.pages.HomePage;
import com.quidco.app.pages.LoginPage;
import com.quidco.app.utility.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by thadeus on 11/04/16.
 */
public class LoginPage_sd {
    HomePage homepage = new HomePage();
    LoginPage login = PageFactory.initElements(Driver.driver, LoginPage.class);
    @Given("^I go to \"([^\"]*)\"$")
    public void i_go_to(String arg1) throws Throwable {
        homepage.navigateToHomePage(arg1);
    }

    @When("^I click on the login link$")
    public void i_click_on_the_login_link() throws Throwable {
        login.clickOnLoginLink();
    }

    @When("^I enter my username and password$")
    public void i_enter_my_username_and_password() throws Throwable {
        login.enterUsernameAndPassWord();
    }
    @Then("^I should be logged in$")
    public void i_should_be_logged_in() throws Throwable {
        login.validateUserLoggedIn();


    }
}
