package com.quidco.app.pageStepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

/**
 * Created by yusufmohammed on 14/09/17.
 */
public class QuidcoCompareFaqStepdef extends BaseStepdef {
    @Then("I should be able to see tabs: ([^\"]*)")
    public void i_should_be_able_to_see_tabs(List<String> tabOptions) {
        quidcoCompareFaqPage.areTabsFDisplayed(tabOptions);
    }

    @And("^I click ([^\"]*) faqtab$")
    public void i_click_faqtab(String tabName) {
        quidcoCompareFaqPage.setFaqTabName(tabName);
        quidcoCompareFaqPage.i_click_faqtab();
    }


    @Then("^I should see (\\d+) FAQsPresent$")
    public void i_should_see_FAQsPresent(int numberOfFAQs) {
        quidcoCompareFaqPage.checkNumberOfFAQs(numberOfFAQs);

    }

    @Then("^I can see relevant information about each FAQPage$")
    public void i_can_see_relevant_information_about_each_FAQPage() {
        quidcoCompareFaqPage.validateFAQContent();
    }

//@Then("^I can see the following grid comparison options:$")
//    public void i_can_see_the_following_insurance_options(List<String> options) {
//        quidcoCompareFaqPage.verifyGridOptions(options);
//    }

}
