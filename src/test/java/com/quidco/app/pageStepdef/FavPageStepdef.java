package com.quidco.app.pageStepdef;

import com.quidco.app.pages.FavPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

import java.util.List;

/**
 * Created by amohindroo on 02/03/17.
 */
public class FavPageStepdef extends BaseStepdef {

    @Then("^I should see below merchants added under favourites$")
    public void I_should_see_below_merchants_added_under_favourites(List<String> merchantNames) {

        for (String s : merchantNames) {
            waitForPresenceOfElement(By.xpath("//div[@role=\"button\"]/div[@class=\"icon-primary-expand-bg\"]/../..//p/a[text()=\"" + s + "\"]"));
        }
    }

    @And("^There are no existing favourite retailers$")
    public void there_are_no_existing_favourite_retailers() {
        homePage.moveToFavouriteIcon();
        ;
        FavPage favPage = homePage.click_manage_favs();
        favPage.removeAllRetailersAsFav();
    }

}
