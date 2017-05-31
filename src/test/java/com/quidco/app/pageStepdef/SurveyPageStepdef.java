package com.quidco.app.pageStepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by laxmimaddali on 5/30/17.
 */
public class SurveyPageStepdef extends BaseStepdef{

    @When("^I click on Opinions option on header$")
     public void i_click_Opinions_option_on_header(){
      surveyPage1.clickOnOpinions();
    }

    @Then("^I should navigate to Survey page$")
    public void i_should_navigate_to_survey_page(){
        surveyPage1.validateSurveyPage();
    }

    @And("^I click on update profile option$")
    public void i_click_on_update_profile_options(){
        surveyPage1.clickOnUpdateProfileOption();
    }
    @And("^I navigate to update profile page$")
    public void i_navigate_to_update_profile_page(){
        surveyPage1.validateProfilePage();
    }
}
