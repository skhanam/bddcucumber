package com.quidco.app.pageStepdef;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

/**
 * Created by ashishmohindroo on 11/8/16.
 */
public class LandingPageStepdef extends BaseStepdef {

    @Then("^I click signOut$")
    public void i_click_signOut(){
        landingPage.clickUserAvatarIcon();

    }

    @Then("^I am logged out$")
    public void i_am_logged_out(){
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
