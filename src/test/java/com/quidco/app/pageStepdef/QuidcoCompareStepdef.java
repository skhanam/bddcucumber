package com.quidco.app.pageStepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.util.List;

/**
 * Created by ashishmohindroo on 12/19/16.
 */
public class QuidcoCompareStepdef extends BaseStepdef {
    @Then("I should see tabs: ([^\"]*)")
    public void i_should_see_tabs(List<String> tabOptions) {
        quidcoComparePage.AreTabsDisplayed(tabOptions);
    }

    @And("^I click ([^\"]*) tab$")
    public void i_click_tab(String tabName){
        quidcoComparePage.setTabName(tabName);
        quidcoComparePage.i_click_tab();
    }
    @Then("^I should see relevant content on the page$")
    public void i_should_see_relevant_content_on_the_page(){
        quidcoComparePage.verify_content_for_tab();
    }

    @Then("^I should see (\\d+) FAQs$")
    public void i_should_see_FAQs(int numberOfFAQs)  {
        quidcoComparePage.checkNumberOfFAQs(numberOfFAQs);

    }

    @Then("^I can see relevant information about each FAQ$")
    public void i_can_see_relevant_information_about_each_FAQ()  {
        quidcoComparePage.validateFAQContent();
    }


}
