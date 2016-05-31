package com.quidco.app.page_sd;

import com.quidco.app.pages.HomePage;
import com.quidco.app.pages.LoginPage;
import com.quidco.app.pages.SearchMs;
import com.quidco.app.utility.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by thadeus on 26/04/16.
 */

public class Search_sd {
    HomePage homePage = new HomePage();
    LoginPage login = PageFactory.initElements(Driver.driver, LoginPage.class);
    SearchMs search = PageFactory.initElements(Driver.driver,SearchMs.class);

    @Given("^I am on \"([^\"]*)\"$")
    public void i_am_on(String arg1) throws Throwable {
        homePage.navigateToHomePage(arg1);
    }

    @When("^I click on the login link$")
    public void i_click_on_the_login_link() throws Throwable {
        login.clickOnLoginLink();

    }

    @When("^I enter my username and password$")
    public void i_enter_my_username_and_password() throws Throwable {
        login.enterUsernameAndPassWord();

    }

    @Given("^I enter a search term \"([^\"]*)\" in the search field$")
    public void i_enter_a_search_term_in_the_search_field(String arg1) throws Throwable {
        search.enterSearchTerm(arg1);

    }

}
