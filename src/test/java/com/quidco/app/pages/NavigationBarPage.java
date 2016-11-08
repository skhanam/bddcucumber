package com.quidco.app.pages;

import org.openqa.selenium.support.PageFactory;

/**
 * Created by ashishmohindroo on 11/8/16.
 */
public class NavigationBarPage extends BasePage{
    public static FirstNavigationBarPage firstNavigationBarPage = null;
    public static SecondNavigationBarPage secondNavigationBarPage = null;
    public NavigationBarPage(){
        System.out.println("In Navigation Bar Page constructor");
        firstNavigationBarPage = PageFactory.initElements(driver,FirstNavigationBarPage.class);
        secondNavigationBarPage = PageFactory.initElements(driver,SecondNavigationBarPage.class);

    }


}
