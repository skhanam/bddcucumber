package com.quidco.app.pageStepdef;

import cucumber.api.java.en.And;

/**
 * Created by ashishmohindroo on 4/12/17.
 */
public class QuidcoOpinionStepdef extends BaseStepdef {

    @And("^I click profile button$")
    public void i_complete_my_profile() {
        quidcoOpinionsPage = quidcoOpinionsPage.clickToProfileBtn();

    }

    @And("^I fill the form to complete my profile$")
    public void fill_form() throws InterruptedException {
        quidcoOpinionsPage.fillInform();
    }

}
