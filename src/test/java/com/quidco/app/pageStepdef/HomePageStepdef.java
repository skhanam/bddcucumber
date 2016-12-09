package com.quidco.app.pageStepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

/**
 * Created by thadeus on 11/04/16.
 */
public class HomePageStepdef extends BaseStepdef {


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
    public void i_am_logged_in() {
        waitForElementDisplay(homePage.homePageObject.avatarIcon);
        Assert.assertTrue(homePage.isAvatarVisible());
    }

    @And("^I see wrong credentials message$")
    public void i_see_wrong_credentials_message() {
        loginPage.checkWrongCredentialsMessage();
    }

    @And("^I see wrong credentials message for facebook$")
    public void i_see_wrong_credentials_message_for_facebook() {
        loginPage.checkWrongCredentialsMessageForFacebook();
    }

    @When("^I am on avatar$")
    public void i_am_on_avatar() {
        homePage.moveToAvatarIcon();
    }

    @Then("^I should see drop down with options:$")
    public void i_should_see_drop_down_with_options(List<String> options){
        homePage.verifyDropDownOptions(options);
   }
   @And("^I click ([^\"]*) dropdown option$")
    public void i_click_dropdown_option(String option){
        i_am_on_avatar();
       notificationsPage = homePage.click_dropdown_option(option);
   }
    @When("^I search for \"([^\"]*)\"$")
    public void i_search_for(String arg1) {

    }

    @Then("^I should see list of retailers and similar retailers$")
    public void i_should_see_list_of_retailers_and_similar_retailers() {

    }

}
