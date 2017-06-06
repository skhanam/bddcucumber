package com.quidco.app.pageStepdef;

import com.quidco.app.pages.*;
import com.quidco.app.utility.SeleniumUtils;

/**
 * Created by ashishmohindroo on 11/8/16.
 */
public class BaseStepdef extends SeleniumUtils {

    public static LandingPage landingPage = LandingPage.getInstance();
    public static HomePage homePage;
    public static LoginPage loginPage;
    public static DiscoverPage discoverPage;
    public static FacebookLoginPage facebookLoginPage;
    public static PaypalLoginPage paypalLoginPage;
    public static NotificationsPage notificationsPage;
    public static LogoutPage logoutPage;
    public static SignupPage signupPage;
    public static OnboardingPage onboardingPage;
    public static QuidcoComparePage quidcoComparePage;
    public static SearchResultsPage searchResultsPage;
    public static SurveyPage surveyPage1 = SurveyPage.getInstance();
    public static FindByPostcodePage postcodepage1 = FindByPostcodePage.getInstance();

}
