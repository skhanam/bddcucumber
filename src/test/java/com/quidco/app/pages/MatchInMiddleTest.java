package com.quidco.app.pages;

import com.quidco.app.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by thadeus on 27/04/16.
 */
public class MatchInMiddleTest extends Driver {


    @FindBy(css = "#store-q1search")
    private WebElement searchfield;
    @FindBy(css = ".touch-link.mixpanel-search-merchant-link")
    private WebElement middleMatchResults;


    public void enterSearchTerm(String searchTerm){
        waitForElementDisplay(searchfield);
        searchfield.clear();
        searchfield.sendKeys(searchTerm);
    }

    public void validateResultsFromMiddleMatchSearch(){
        List<String> numList= new ArrayList<String>();
        List<WebElement> middleSearch =driver.findElements(By.cssSelector(".touch-link.mixpanel-search-merchant-link"));

        for(WebElement num:middleSearch{
            numList.add(num.getText());
            assertEquals(numList,middleSearch);
        }


    }
}
