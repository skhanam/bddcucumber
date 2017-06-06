package com.quidco.app.pageStepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.quidco.app.pageStepdef.BaseStepdef.postcodepage1;

/**
 * Created by laxmimaddali on 6/6/17.
 */
public class FindByPostcodeStepdef extends BaseStepdef{


    @When("^I click on high street option on header$")
    public void i_click_on_high_street_option_on_header(){
        postcodepage1.clickOnHighStreet();
    }
    @And("^I should navigate to highstreet$")
    public void i_should_navigate_to_highstreet(){
        postcodepage1.clickOnHighStreet();
    }
    @And("^I click on Find near by offers option$")
    public void i_click_on_Find_near_by_offers_option(){
        postcodepage1.clickOnFindNearByOption();
    }


    @And("^I enter postcode as ([^\"]*)$")
    public void i_enter_postcode(String postcode){
        postcodepage1.enterPostcode(postcode);

    }
    @And("^I click on find offers button$")
    public void i_click_on_find_offers_button(){
        postcodepage1.clickonFindOffersButton();
    }
    @Then("^I should see list of retailers$")
    public void i_should_see_list_of_retailers(){
            postcodepage1.validateListofRetailers();
    }

}
