package com.quidco.app.pageStepdef;

import com.quidco.app.pages.*;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ashishmohindroo on 11/8/16.
 */
public class BaseStepdef {

    public static HomePage homePage = PageFactory.initElements(BasePage.driver,HomePage.class);
    public static LoginPage loginPage;
    public static LandingPage landingPage;
    public static NotificationsPage notificationsPage;
    public static LogoutPage logoutPage;
}
