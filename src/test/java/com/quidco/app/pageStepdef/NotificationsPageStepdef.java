package com.quidco.app.pageStepdef;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

/**
 * Created by amohindroo on 05/12/16.
 */
public class NotificationsPageStepdef extends BaseStepdef {
    @Then("^I should see title on Account Summary Tab:$")
    public void i_should_see_title_on_account_summary_tab(List<String> eNames) {
        notificationsPage.validateTitleOnAccountSummaryPage(eNames);
    }

    @Then("^I should see link on Account Summary Tab:$")
    public void i_should_see_link_on_account_summary_tab(List<String> eNames) {

        notificationsPage.validateLinksOnAccountSummaryPage(eNames);
    }

    @Then("^I should see button on Account Summary Tab:$")
    public void i_should_see_button_on_account_summary_tab(List<String> eNames) {
        notificationsPage.validateButtonsOnAccountSummaryPage(eNames);
    }

    @When("I click on \"([^\"]*)\" tab on account summary page")
    public void i_click_on_tab_on_account_summary_page(String tabName) {
        notificationsPage.clickTab(tabName);
    }

    @Then("I should see \"([^\"]*)\" on the \"([^\"]*)\"")
    public void i_should_see_title_on_the_appropriate_tab_on_summary_page(String title, String tabName) {

        notificationsPage.validateTitleOnAppropriateTab(title, tabName);

    }
}


