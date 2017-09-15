package com.quidco.app.pageStepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

/**
 * Created by thadeus on 11/04/16.
 */
public class LoginPageStepdef extends BaseStepdef {

    @When("^I enter my username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void i_enter_my_credentials(String username, String password) {
        loginPage.enterUsernameAndPassWord(username+System.currentTimeMillis()+"@gmail.com", password);
    }


    @And("^I click signIn$")
    public void clickSignInBtn() {
        homePage = loginPage.clickSignInBtn();
    }

    @When("^I enter valid credentials$")
    public void i_enter_valid_credentials() {
        loginPage.enterValidUsernameAndPassword(landingPage.getUsername(),landingPage.getPassword());
    }

    @When("^I enter facebook valid credentials$")
    public void i_enter_facebook_valid_credentials() {
        facebookLoginPage.enterUsernameAndPassword(landingPage.getUsername(), landingPage.getPassword());
    }

    @When("^I enter paypal valid credentials$")
    public void i_enter_paypal_valid_credentials() {
        paypalLoginPage.enterUsernameAndPassword(landingPage.getUsername(), landingPage.getPassword());
    }

    @When("^I enter facebook invalid credentials as \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_facebook_invalid_credentials(String uname, String pwd) {
        facebookLoginPage.enterUsernameAndPassword(uname, pwd);
    }

    @When("^I enter invalid credentials as \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_valid_credentials(String uname, String pwd) {
        i_enter_my_credentials(uname, pwd);
    }


    @And("^I click login for facebook$")
    public void i_click_login_for_facebook() {
        homePage = facebookLoginPage.clickLogin();
    }

    @And("^I click login for paypal")
    public void i_click_login_for_paypal() {
        homePage = paypalLoginPage.clickLogin();
    }

    @And("^I click join for free")
    public void i_click_join_in() {
        signupPage = loginPage.clickJoinIn();
    }

    @And("^I click sign in with facebook$")
    public void i_click_sign_in_with_facebook() {
        String temp = driver.getCurrentUrl();
        driver.navigate().to("https://facebook.com");
        driver.manage().deleteAllCookies();
        driver.navigate().to(temp);
        facebookLoginPage = loginPage.clickSignInWithFacebook();

    }
}
