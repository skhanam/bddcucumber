package com.quidco.app.pageStepdef;

import com.quidco.app.pages.*;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ashishmohindroo on 11/8/16.
 */
public class BaseStepdef {

    public static LandingPage landingPage = PageFactory.initElements(BasePage.driver,LandingPage.class);
    public static HomePage homePage;
    public static LoginPage loginPage;
    public static NotificationsPage notificationsPage;
    public static LogoutPage logoutPage;
}
