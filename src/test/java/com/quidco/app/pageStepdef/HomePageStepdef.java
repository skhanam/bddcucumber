package com.quidco.app.pageStepdef;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by thadeus on 11/04/16.
 */
public class HomePageStepdef extends BaseStepdef{


    @Given("^I am on \"([^\"]*)\"$")
    public void i_am_on(String arg1)  {
        homePage.navigateToHomePage(arg1);
    }

    @When("^I click on the signin link$")
    public void i_click_on_the_signin_link()  {
        loginPage =   homePage.clickSignInOnNavigationBar();
    }

    @Then("^I am logged in$")
    public void i_am_logged_in() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
