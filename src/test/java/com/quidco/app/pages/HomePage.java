package com.quidco.app.pages;

import com.quidco.app.utility.Driver;

/**
 * Created by thadeus on 11/04/16.
 */
public class HomePage extends Driver {
    public void navigateToHomePage(String url){
        driver.get(url);
        System.out.println(driver.getTitle());
    }
}
