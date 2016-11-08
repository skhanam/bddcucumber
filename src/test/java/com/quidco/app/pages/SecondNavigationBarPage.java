package com.quidco.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by ashishmohindroo on 11/8/16.
 */
public class SecondNavigationBarPage extends BasePage{

    @FindBy(css = ".user")
    private WebElement avatarIcon;

    public void clickAvatar(){
        avatarIcon.click();
    }
}
