package com.quidco.app.pageStepdef;

import com.quidco.app.pages.FavPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

/**
 * Created by thadeus on 11/04/16.
 */
public class HomePageStepdef extends BaseStepdef {

    @Then("^I click signOut$")
    public void i_click_signOut() throws InterruptedException {
        notificationsPage = homePage.clickAvatar();
        logoutPage = notificationsPage.clickSignOutLink();
    }

    @Then("^I am logged out$")
    public void i_am_logged_out() {
        logoutPage.verifySignOutMessage();
    }

    @And("^I am logged in$")
    public void i_am_logged_in() {
        waitForElementDisplay(homePage.homePageObject.avatarIcon);
        Assert.assertTrue(homePage.isAvatarVisible());
    }

    @And("^I see wrong credentials message$")
    public void i_see_wrong_credentials_message() {
        loginPage.checkWrongCredentialsMessage();
    }

    @And("^I see wrong credentials message for facebook$")
    public void i_see_wrong_credentials_message_for_facebook() {
        loginPage.checkWrongCredentialsMessageForFacebook();
    }

    @When("^I am on avatar$")
    public void i_am_on_avatar() {
        homePage.moveToAvatarIcon();
    }

    @When("^I am on favourite icon$")
    public void i_am_on_favourite_icon() {
        homePage.moveToFavouriteIcon();
    }

    @When("^I click Manage Favourites option under menu$")
    public FavPage i_click_manage_favourites_option_under_menu() {
        return homePage.click_manage_favs();

    }

    @Then("^I should see drop down with options:$")
    public void i_should_see_drop_down_with_options(List<String> options) {
        homePage.verifyDropDownOptions(options);
    }

    @And("^I click ([^\"]*) dropdown option$")
    public void i_click_dropdown_option(String option) {
        i_am_on_avatar();
        notificationsPage = homePage.click_dropdown_option(option);
    }

    @When("^I search for \"([^\"]*)\"$")
    public void i_search_for(String searchTerm) {
        searchResultsPage = homePage.searchFor(searchTerm);
        searchResultsPage.setSearchTerm(searchTerm);
    }

    @And("^I should see ([0-9]+) search results for the product$")
    public void i_should_see_search_results_for_the_products(int numProducts){
        searchResultsPage.verify_presence_of_search_results_for_products(numProducts);
    }
    @Then("^I should see more products$")
    public void i_should_see_more_products(){
        searchResultsPage.verifyMoreProducts();
    }

    @When("^I click buy now for ([^\"]*) product displayed$")
    public void i_click_buy_now_for_products_displayed(String productNumber ) throws InterruptedException {
        searchResultsPage.clickBuyNowForProduct(productNumber);
    }

    @When("^I click buy now on product description page$")
    public void i_click_buy_now_on_product_description_page() throws InterruptedException {
        searchResultsPage.clickBuyNowOnProductDetailPage();
    }

    @And("^I enter the mandatory shipping & payment details$")
    public void i_enter_the_mandatory_shipping_payment_details() {
        homePage.enterShippingDetails(false);
    }

    @And("^I click review order$")
    public void i_click_review_order() {
        homePage.clickReviewOrSubmitOrder();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("^I Submit order$")
    public void i_submit_order() {
        homePage.clickReviewOrSubmitOrder();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("^my checkout is successfull$")
    public void my_checkout_is_successfull() {
        homePage.verifyCheckoutSuccessfull();
    }

    @And("^I add retailer to favourite$")
    public void i_add_retailer_to_favourites() throws InterruptedException {
        homePage.addToFavouriteBtn();
        homePage.verifyIfRetailerAddedToFavourite();
    }

    @And("^I remove retailer from favourite$")
    public void i_remove_retailer_from_favourites() {
        homePage.removeFromFavouriteBtn();
        homePage.verifyIfRetailerRemovedFromFavourite();
    }

    @Then("^I should see this retailer added under bookmarks$")
    public void i_should_see_this_retailer_under_bookmarks() {

        i_am_on_favourite_icon();
        homePage.checkIfRetailerAddedUnderBookmarks();
    }

    @Then("^I should not see this retailer under bookmarks$")
    public void i_should_not_see_this_retailer_under_bookmarks() {

        i_am_on_favourite_icon();
        homePage.checkIfRetailerRemovedUnderBookmarks();
    }

}
