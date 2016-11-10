package com.quidco.app.pageStepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

/**
 * Created by thadeus on 11/04/16.
 */
public class HomePageStepdef extends BaseStepdef{


    @Given("^I am on \"([^\"]*)\"$")
    public void i_am_on(String arg1)  {
        landingPage.navigateToHomePage(arg1);
    }

    @When("^I click on the signin link$")
    public void i_click_on_the_signin_link()  {
        loginPage =   landingPage.clickSignInOnNavigationBar();
    }
    @And("^I have a \"([^\"]*)\" login$")
    public void i_have_valid_invalid_login(String status){
        homePage.verifyAvatarVisible(status);
    }



}
