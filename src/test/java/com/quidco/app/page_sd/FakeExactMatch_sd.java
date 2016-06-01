package com.quidco.app.page_sd;

import com.quidco.app.pages.FakeExactMatch;
import com.quidco.app.utility.Driver;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by thadeus on 31/05/16.
 */
public class FakeExactMatch_sd {
FakeExactMatch fakeExactMatch = PageFactory.initElements(Driver.driver,FakeExactMatch.class);

    @Then("^I should get back a merchant that matches exactly\"([^\"]*)\" my search term$")
    public void i_should_get_back_a_merchant_that_matches_exactly_my_search_term(String arg1) throws Throwable {
        fakeExactMatch.validateFakeUserExactMatch(arg1);

    }
    @Then("^I click on the merchant matched$")
    public void i_click_on_the_merchant_matched() throws Throwable {
        fakeExactMatch.clickOnFakedSearchResult();
    }

    @Then("^I  should be on merchant page\"([^\"]*)\"$")
    public void i_should_be_on_merchant_page(String arg1) throws Throwable {
        fakeExactMatch.validateUserOnMerchantPage(arg1);
    }

    @Then("^click on visit retailer and get cashback link$")
    public void click_on_visit_retailer_and_get_cashback_link() throws Throwable {
        fakeExactMatch.clickOnVisitRetailerToGetCashBack();
    }



}
