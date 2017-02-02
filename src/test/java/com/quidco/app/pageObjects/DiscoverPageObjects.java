package com.quidco.app.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by ashishmohindroo on 11/11/16.
 */
public class DiscoverPageObjects {

    public String retailer = "div.merchant-rates div.container img[title='%s']";

    @FindBy(css = ".quidco-merchant-rate")
    public List<WebElement> merchantDivs;

    public String merchantBtnLoc = ".merchant_btn";
    public String merchantNameLoc = ".merchant_url";


    public String retailerHeaderTitle = ".retailer-description-summary>h1";

    public String retailerHeaderTitleText = "%s offers & cashback";

}
