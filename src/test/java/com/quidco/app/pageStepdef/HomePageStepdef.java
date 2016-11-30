package com.quidco.app.pageStepdef;

import com.quidco.app.pageObjects.HomePageObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

/**
 * Created by thadeus on 11/04/16.
 */
public class HomePageStepdef extends BaseStepdef{


    @Then("^I click signOut$")
    public void i_click_signOut() {
        notificationsPage = homePage.clickAvatar();
        logoutPage = notificationsPage.clickSignOutLink();
    }
    @Then("^I am logged out$")
    public void i_am_logged_out() {
        logoutPage.verifySignOutMessage();
    }

    @And("^I am logged in$")
    public void i_am_logged_in(){
        homePage.waitForElementDisplay(HomePageObject.avatarIcon);
        Assert.assertTrue(homePage.isAvatarVisible());
    }
    @And("^I see wrong credentials message$")
    public void i_see_wrong_credentials_message(){
        loginPage.checkWrongCredentialsMessage();
    }

}
