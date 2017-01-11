package com.quidco.app.pageStepdef;

import com.quidco.app.utility.JavaUtils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
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
        loginPage = landingPage.clickSignInOnNavigationBar();

    }

    @When("^I click on the signin link$")
    public void i_click_on_the_signin_link() {

        loginPage = landingPage.clickSignInOnNavigationBar();
    }

    @Given("^I am an existing ([^\"]*) user$")
    public void i_am_an_existing_user(String userType) {
        switch (userType) {
            case "normal":
                landingPage.setUsername("quidco.tester@gmail.com");
                landingPage.setPassword("quidcotester@3");
                break;
            case "premium":
                landingPage.setUsername("quidco.tester+premium@gmail.com");
                landingPage.setPassword("quidcotester@01");
                break;
            case "facebook":
                landingPage.setUsername("quidco.tester@gmail.com");
                landingPage.setPassword("quidcotester@01");
                break;
            case "paypal":
                landingPage.setUsername("adsfsd@adfasf.com");
                landingPage.setPassword("lkjjlkl");
                break;
        }
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

    @Given("^I am logged in ([^\"]*) user$")
    public void i_am_logged_in_user(String userType) {
        i_am_an_existing_user(userType);
        landingPage.IamloggedinUser();
    }

    @And("I click quidco compare")
    public void i_click_quidco_compare() {
        quidcoComparePage = landingPage.clickQuidcoCompare();
    }

    @When("^I click Join Quidco now$")
    public void i_click_join_quidco_btn() {
        signupPage = landingPage.click_join_quidco_now_btn();

    }
    @When("^I click category ([^\"]*)$")
    public void i_click_category(String categoryName)  {
        landingPage.clickCategory(categoryName);

    }
    @Then("^I should see correct label on the page$")
    public void i_should_see_correct_label_on_the_page() {
        landingPage.verify_category_label();
    }

    @Then("^I should see some retailers listed$")
    public void i_should_see_some_retailers_listed() throws Exception {
        landingPage.check_if_retailers_listed();
    }

}



