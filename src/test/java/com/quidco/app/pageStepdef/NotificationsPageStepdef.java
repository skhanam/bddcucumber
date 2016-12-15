package com.quidco.app.pageStepdef;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

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

        switch (tabName) {
            case "Activity":
                waitForElementDisplay(driver.findElement(By.xpath("//*[@id=\"left_nav\"]/ul/li[1]/a[contains(text(),'" + title + "')]")));
                break;
            case "Payments":
                waitForElementDisplay(driver.findElement(By.xpath("//div[@id='payments_page']//div[contains(@class,'price-header')]/h1[contains(text(),'" + title + "')]")));
                break;
            case "Refer Quidco":
                waitForElementDisplay(driver.findElement(By.xpath("//*[@id=\"page-content\"]/div[5]/div/div[3]/div/h2[contains(text(),'" + title + "')]")));
                break;
            case "My reviews":
                waitForElementDisplay(driver.findElement(By.xpath("//*[@id=\"page-content\"]/div[5]/div/div[1]/div/h1[contains(text(),'" + title + "')]")));
                break;
            case "Settings":
                waitForElementDisplay(driver.findElement(By.xpath("//*[@id=\"page-content\"]/div[4]/div/div[2]/h1[contains(text(),'" + title + "')]")));
                break;
        }
    }
}


