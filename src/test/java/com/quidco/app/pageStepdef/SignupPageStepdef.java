package com.quidco.app.pageStepdef;

import cucumber.api.java.en.When;

/**
 * Created by amohindroo on 18/11/16.
 */
public class SignupPageStepdef extends BaseStepdef {


    @When("^I enter all the mandatory fields and sign up$")
    public void i_enter_all_the_mandatory_fields() {
        signupPage.fill_in_mandatory_details();
        onboardingPage = signupPage.click_join_in();
        onboardingPage.click_get_started();
        onboardingPage.select_account_type();
        onboardingPage.click_next_step();
        onboardingPage.skipStep();
        onboardingPage.skipStep();
        homePage = onboardingPage.click_finish();
    }



}
