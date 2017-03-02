package com.quidco.app.pageStepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by ashishmohindroo on 12/16/16.
 */
public class SearchResultsPageStepdef extends BaseStepdef {


    @Then("^I should see retailers for this product$")
    public void i_should_see_retailers_for_this_product() {
        searchResultsPage.verifyPresenceOfRetailers();
    }

    @Then("^I should see it as top retailer$")
    public void i_should_see_it_as_top_retailer() {
        searchResultsPage.validateRetailers();
    }

    @Then("^I should also see Similar retailers to the retailer$")
    public void i_should_also_see_similar_retailers_to_the_retailer() {
        searchResultsPage.validateSimilarRetailers();
    }

    @And("^I click close search$")
    public void close_search() {
        searchResultsPage.closeSearch();
    }

    @Then("^I click view more products$")
    public void i_click_view_more_products_btn() {
        searchResultsPage.clickViewMoreProducts();
    }

    @When("^I click the retailer on search results page$")
    public void i_click_retailer_on_search_results_page() {
        homePage = searchResultsPage.clickRetailer();
    }
}
