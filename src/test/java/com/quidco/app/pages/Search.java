package com.quidco.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by thadeus on 11/04/16.
 */
public class Search extends BasePage {

    String Results = ".mixpanel-search-merchant-link:contains('%s')";
    @FindBy(css = "#store-q1search")
    private WebElement searchfield;
    @FindBy(xpath = "//*[@id='search-results-top-retailer-container']/div[1]/div/h3/a")
    private WebElement topSearchResults;
    @FindBy(css = ".rate")
    private WebElement topRatevalue;
    @FindBy(css = ".touch-link.mixpanel-search-merchant-link")
    private WebElement seaerchResults;
    @FindBy(css = "#search-results-similar-retailers-container>h2")
    private WebElement similarSearchTerms;

    public void enterSearchTerm(String searchTerm) {
        waitForElementDisplay(searchfield);
        searchfield.clear();
        searchfield.sendKeys(searchTerm);

    }

    public void validateTopSearchResultsDisplayed(String top_result) {
        waitForElementDisplay(topSearchResults);
        List<WebElement> topMerchantResult = driver.findElements(By.cssSelector(String.format(Results, top_result)));
        for (WebElement topmerchant : topMerchantResult) {
            assertTrue(topmerchant.getText().contains(top_result));
        }

    }

    public void validateSearchResultRates(String rate_value) {
        topRatevalue.getAttribute(rate_value);
        List<WebElement> topRate = driver.findElements(By.cssSelector(".rate"));
        for (WebElement rate : topRate) {
            Integer.parseInt(rate.getAttribute(rate_value));
            assertTrue(rate.getText().contains(rate_value));
        }
    }

    public void validateSimilarSearchResultsDisplayed(String s_merchant) {
        waitForElementDisplay(similarSearchTerms);
        List<WebElement> similarResult = driver.findElements(By.cssSelector(String.format(Results, s_merchant)));

        for (WebElement similar : similarResult) {
            assertTrue(similar.getText().contains(s_merchant));
        }
    }


}
