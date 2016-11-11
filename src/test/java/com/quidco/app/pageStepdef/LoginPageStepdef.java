package com.quidco.app.pageStepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

/**
 * Created by thadeus on 11/04/16.
 */
public class LoginPageStepdef extends BaseStepdef {

    @When("^I enter my username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void i_enter_my_credentials(String username,String password) throws Throwable {
        loginPage.enterUsernameAndPassWord(username,password);
    }


    @And("^I click signIn$")
    public void clickSignInBtn() {
        homePage = loginPage.clickSignInBtn();
    }


}
