package com.quidco.app.pages;

import com.quidco.app.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by thadeus on 11/04/16.
 */
public class SearchMs extends Driver {

 @FindBy(css = "#store-q1search")
    private WebElement searchfield;
    @FindBy(xpath = "//*[@id='search-results-top-retailer-container']/div[1]/div/h3/a")
    private WebElement topSearchResults;
    @FindBy(css = ".touch-link.mixpanel-search-merchant-link")
    private WebElement seaerchResults;
    @FindBy(css = "#search-results-similar-retailers-container>h2")
    private WebElement similarSearchTerms;


    public void enterSearchTerm(String searchTerm){
        waitForElementDisplay(searchfield);
        searchfield.sendKeys(searchTerm);

    }
    public void validateTopSearchResultsDisplayed(String top_result) {
        waitForElementDisplay(topSearchResults);
        System.out.println(topSearchResults.getAttribute(top_result));

    }

    public void validateSimilarSearchResultsDisplayed(){
        waitForElementDisplay(similarSearchTerms);
        similarSearchTerms.isDisplayed();
        System.out.println(similarSearchTerms.getText());

    }

}
