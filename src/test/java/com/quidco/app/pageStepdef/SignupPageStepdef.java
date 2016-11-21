package com.quidco.app.pageStepdef;

import cucumber.api.java.en.When;

/**
 * Created by amohindroo on 18/11/16.
 */
public class SignupPageStepdef extends BaseStepdef {


    @When("^I enter all the mandatory fields$")
    public void i_enter_all_the_mandatory_fields() {
        signupPage.fill_in_mandatory_details();
        signupPage.click_join_in();
    }

}
