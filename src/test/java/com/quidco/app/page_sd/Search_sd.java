package com.quidco.app.page_sd;

import com.quidco.app.pages.LoginPage;
import com.quidco.app.pages.SearchMs;
import com.quidco.app.utility.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by thadeus on 26/04/16.
 */

public class Search_sd {
    LoginPage login = PageFactory.initElements(Driver.driver, LoginPage.class);
    SearchMs search = PageFactory.initElements(Driver.driver,SearchMs.class);

    @Given("^I enter a search term with an ampersand\"([^\"]*)\" on the rest url$")
    public void i_enter_a_search_term_with_an_ampersand_on_the_rest_url(String arg1) throws Throwable {
        search.enterSearchTerm(arg1);
    }

    @Then("^I should get back a merchant that matches exactly\"([^\"]*)\"and rate\"([^\"]*)\"my search term$")
    public void i_should_get_back_a_merchant_that_matches_exactly_and_rate_my_search_term(String arg1, String arg2) throws Throwable {
        search.validateTopSearchResultsDisplayed(arg1, arg2);
    }

    @Then("^I should find a merchant similar \"([^\"]*)\" result to my searchTerm$")
    public void i_should_find_a_merchant_similar_result_to_my_searchTerm(String arg1) throws Throwable {
     search.validateSimilarSearchResultsDisplayed(arg1);
    }


}
