package com.quidco.app.pageStepdef;


import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

/**
 * Created by amohindroo on 05/12/16.
 */
public class NotificationsPageStepdef extends BaseStepdef {
    @Then("^I should see title on Account Summary Tab:$")
    public void i_should_see_title_on_account_summary_tab(List<String> eNames) {
        for (String name : eNames) {
            waitForElementDisplay(driver.findElement(By.xpath("//div[@class='account-notifications']" +
                    "/div[@class='container']//h4[contains(text(),'" + name + "')]")));
        }
    }
    @Then("^I should see link on Account Summary Tab:$")
    public void i_should_see_link_on_account_summary_tab(List<String> eNames) {
        for (String name : eNames) {
            waitForElementDisplay(driver.findElement(By.xpath("//div[@class='notification-annotation']//p/a[contains(text(),'"+name+"')]")));
        }
    }
    @Then("^I should see button on Account Summary Tab:$")
    public void i_should_see_button_on_account_summary_tab(List<String> eNames) {
        for (String name : eNames) {
            scrollElementIntoView(driver.findElement(By.xpath("//div[@class='notification-annotation']//a/button[contains(text(),'"+name+"')]")));
            waitForElementDisplay(driver.findElement(By.xpath(".//*[@id='page-content']/div[3]/div[2]/div/div[1]/p/a/button[contains(text(),'"+name+"')]")));

        }
    }

}
