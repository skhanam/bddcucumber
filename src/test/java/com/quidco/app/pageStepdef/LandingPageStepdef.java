package com.quidco.app.pageStepdef;

import com.quidco.app.utility.JavaUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

/**
 * Created by ashishmohindroo on 11/8/16.
 */
public class LandingPageStepdef extends BaseStepdef {


    @Given("^I am on the landing page$")
    public void i_am_on_the_landing_page() {
        landingPage.navigateToLandingPage();
    }

    @Given("^I am on the home page$")
    public void i_am_on_the_home_page() {
        landingPage.navigateToLandingPage();
        landingPage.clickSignInOnNavigationBar();

    }

    @When("^I click on the signin link$")
    public void i_click_on_the_signin_link() {

        loginPage = landingPage.clickSignInOnNavigationBar();
    }

    @Given("^I am an existing normal user$")
    public void i_am_an_existing_normal_user() {
        landingPage.setUsername("quidco.tester@gmail.com");
        landingPage.setPassword("quidcotester@3");
    }

    @Given("^I am an existing premium user$")
    public void i_am_an_existing_premium_user() {
        landingPage.setUsername("quidco.tester+premium@gmail.com");
        landingPage.setPassword("quidcotester@01");
    }

    @Given("^I am a new normal user$")
    public void i_am_a_new_user() {

        landingPage.setUsername(JavaUtils.getTestEmail());
        landingPage.setPassword("quidcotester@01");
        landingPage.setUserSubscription("normal");
    }

    @Given("^I am a new premium user$")
    public void i_am_a_new_premium_user() {
        landingPage.setUsername(JavaUtils.getTestEmail());
        landingPage.setPassword("quidcotester@01");
        landingPage.setUserSubscription("premium");
    }
    @Given("^I am an existing facebook user$")
    public void i_am_an_existing_facebook_user() {
        landingPage.setUsername("quidco.tester+fb@gmail.com");
        landingPage.setPassword("quidcotester@01");
    }



}



