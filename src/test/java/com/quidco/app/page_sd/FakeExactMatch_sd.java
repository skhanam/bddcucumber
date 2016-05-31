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



}
