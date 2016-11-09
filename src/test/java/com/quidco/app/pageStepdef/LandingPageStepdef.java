package com.quidco.app.pageStepdef;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ashishmohindroo on 11/8/16.
 */
public class LandingPageStepdef extends BaseStepdef {

    @Then("^I click signOut$")
    public void i_click_signOut() {
        notificationsPage = landingPage.secondNavigationBarPage.clickAvatar();
        logoutPage = notificationsPage.clickSignOutLink();
    }
    @Then("^I am logged in$")
    public void i_am_logged_in(){
        landingPage.secondNavigationBarPage.verifyAvatarVisible();
    }

    @Then("^I am logged out$")
    public void i_am_logged_out() {
        logoutPage.verifySignOutMessage();
    }

}
