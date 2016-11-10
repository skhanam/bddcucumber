package com.quidco.app.pageStepdef;

import cucumber.api.java.en.Then;

/**
 * Created by ashishmohindroo on 11/8/16.
 */
public class LandingPageStepdef extends BaseStepdef {

    @Then("^I click signOut$")
    public void i_click_signOut() {
        notificationsPage = homePage.clickAvatar();
        logoutPage = notificationsPage.clickSignOutLink();
    }
//    @Then("^I am logged in$")
//    public void i_am_logged_in(){
//        homePage.verifyAvatarVisible();
//    }

    @Then("^I am logged out$")
    public void i_am_logged_out() {
        logoutPage.verifySignOutMessage();
    }

}
