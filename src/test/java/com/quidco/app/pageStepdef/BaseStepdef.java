package com.quidco.app.pageStepdef;

import com.quidco.app.pages.BasePage;
import com.quidco.app.pages.HomePage;
import com.quidco.app.pages.LandingPage;
import com.quidco.app.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ashishmohindroo on 11/8/16.
 */
public class BaseStepdef {

    public static HomePage homePage = PageFactory.initElements(BasePage.driver,HomePage.class);
    public static LoginPage loginPage;
    public static LandingPage landingPage;
}
