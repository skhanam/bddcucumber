package com.quidco.app.pages;

import com.quidco.app.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by thadeus on 31/05/16.
 */
public class FakeExactMatch extends Driver{

    @FindBy(css = "#store-q1search")
    private WebElement searchfield;
    @FindBy(css = ".search-top-retailer")
    private WebElement searchResult;
    @FindBy(xpath = "//*[@id='search-results-top-retailer-container']/div[1]/div/h3/a")
    private WebElement merchantName;

    @FindBy(css = ".rate")
    private WebElement topRatevalue;
    @FindBy(css =".name-container.clearfix>h1")
    private WebElement merchantPage;
    @FindBy(xpath = "//*[@id='retailer-info']/div[1]/div[1]/h1")
    private WebElement merchantPages;
    @FindBy(css = ".cashback-bubble.lead3>p")
    private WebElement visitRecorded;
    @FindBy(css = ".btn.btn-block.btn-primary.btn-lg.btn-cashback.modal-visit")
    private WebElement getCashBack;
    @FindBy(css = ".col-xs-9.col-sm-9.col-md-9")
     private WebElement earnUpTo;

    String merchnatResult =".touch-link.mixpanel-search-merchant-link:contains('%s')";



    public void validateFakeUserExactMatch(String f_search){
        waitForElementDisplay(searchResult);
       List<WebElement> merchant = driver.findElements(By.cssSelector(String.format(merchnatResult,f_search)));
        merchant.contains(f_search);


    }
    public void clickOnFakedSearchResult(){
        waitForElementDisplay(searchResult);
        merchantName.click();
    }

    public void validateUserOnMerchantPage(String m_page){
        waitForElementDisplay(earnUpTo);
        earnUpTo.getText().contains(m_page);

    }
    public void clickOnVisitRetailerToGetCashBack(){
        getCashBack.click();
    }

    public void validateVisitYourVisitRecordedPopup(){
        waitForElementDisplay(getCashBack);

    }

}
