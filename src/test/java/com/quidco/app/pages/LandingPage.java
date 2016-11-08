package com.quidco.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by ashishmohindroo on 11/8/16.
 */
public class LandingPage extends NavigationBarPage {

    @FindBy(css = ".user")
    private WebElement avatarIcon;


  public NotificationsPage clickUserAvatarIcon(){
      avatarIcon.click();
      return PageFactory.initElements(driver,NotificationsPage.class);
  }

}
