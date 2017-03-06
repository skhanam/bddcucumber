package com.quidco.app.pageStepdef;

import com.quidco.app.pages.DiscoverPage;
import com.quidco.app.utility.JavaUtils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by ashishmohindroo on 11/8/16.
 */
public class DiscoverPageStepdef extends BaseStepdef {

    @When("^I click random retailer on discover page$")
    public void i_click_random_retailer_on_discover_page(){
        discoverPage.click_random_retailer();
    }
    @Then("^User lands on the correct page$")
    public void user_lands_on_the_correct_page(){
        discoverPage.verify_correct_landing_page();
    }


}



