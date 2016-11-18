package com.quidco.app.pageStepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

/**
 * Created by ashishmohindroo on 11/8/16.
 */
public class LandingPageStepdef extends BaseStepdef {



    @Given("^I am on the landing page$")
    public void i_am_on_the_landing_page()  {
        landingPage.navigateToHomePage();
    }

    @When("^I click on the signin link$")
    public void i_click_on_the_signin_link()  {

        loginPage =   landingPage.clickSignInOnNavigationBar();
    }

    @Given("^I am an existing normal user$")
    public void i_am_an_existing_normal_user() {
            landingPage.username = "quidco.tester@gmail.com";
            landingPage.password = "quidcotester@02";
    }

    @Given("^I am an existing premium user$")
    public void i_am_an_existing_premium_user() {
            landingPage.username = "quidco.tester+premium@gmail.com";
            landingPage.password = "quidcotester@01";
    }



}
