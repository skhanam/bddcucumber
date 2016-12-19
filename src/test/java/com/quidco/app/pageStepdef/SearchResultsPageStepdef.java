package com.quidco.app.pageStepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

/**
 * Created by ashishmohindroo on 12/16/16.
 */
public class SearchResultsPageStepdef extends BaseStepdef {


    @Then("^I should see it as top retailer$")
    public void i_should_see_it_as_top_retailer() {
        searchResultsPage.validateRetailers();
    }

    @Then("^I should also see Similar retailers to the retailer$")
    public void i_should_also_see_similar_retailers_to_the_retailer() {
        searchResultsPage.validateSimilarRetailers();
    }
    @And("^I click close search$")
    public void close_search(){
        searchResultsPage.closeSearch();
    }

}
