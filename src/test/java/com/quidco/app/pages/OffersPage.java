package com.quidco.app.pages;

import com.quidco.app.pageObjects.OffersPageObject;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ashishmohindroo on 11/10/16.
 */
public class OffersPage extends BasePage {

    OffersPageObject offersPageObject = PageFactory.initElements(driver,OffersPageObject.class);

}
