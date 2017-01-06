package com.quidco.app.pageStepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;

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
    public void i_click_tab(String tabName) {
        quidcoComparePage.setTabName(tabName);
        quidcoComparePage.i_click_tab();
    }

    @Then("^I should see relevant content on the page$")
    public void i_should_see_relevant_content_on_the_page() {
        quidcoComparePage.verify_content_for_tab();
    }

    @Then("^I should see (\\d+) FAQs$")
    public void i_should_see_FAQs(int numberOfFAQs) {
        quidcoComparePage.checkNumberOfFAQs(numberOfFAQs);

    }

    @Then("^I can see relevant information about each FAQ$")
    public void i_can_see_relevant_information_about_each_FAQ() {
        quidcoComparePage.validateFAQContent();
    }

    @Then("^I can see the following grid comparison options:$")
    public void i_can_see_the_following_insurance_options(List<String> options) {
        quidcoComparePage.verifyGridOptions(options);
    }


    @When("^I Get a quote for ([^\"]*)$")
    public void i_Get_a_quote_for_service(String serviceOption) {

        quidcoComparePage.clickGetaQuote(serviceOption);
    }

    @Then("^I should see list of broadband options$")
    public void i_should_see_list_of_broadband_options() {
        quidcoComparePage.checkBroadbandList();
    }

    @When("^I click ([^\"]*) icon$")
    public void i_click_category_icon(String categoryIcon) {
        quidcoComparePage.clickIconCategoryUnderHowitWorksTab(categoryIcon);
    }

    @Then("^I can see appropriate category options available$")
    public void i_can_see_appropriate_category_options_available() {
        quidcoComparePage.checkCategoryOptionsVisible();
    }
}
