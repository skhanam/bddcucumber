package com.quidco.app.pages;

import com.quidco.app.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by thadeus on 31/05/16.
 */
public class FakeExactMatch extends Driver{

    @FindBy(css = "#store-q1search")
    private WebElement searchfield;
    @FindBy(css = ".search-top-retailer")
    private WebElement searchResult;

    @FindBy(css = ".rate")
    private WebElement topRatevalue;

String merchnatResult =".touch-link.mixpanel-search-merchant-link:contains('%s')";


    public void validateFakeUserExactMatch(String f_search){
        waitForElementDisplay(searchResult);
       List<WebElement> merchant = driver.findElements(By.cssSelector(String.format(merchnatResult,f_search)));
        merchant.contains(f_search);


    }


}
