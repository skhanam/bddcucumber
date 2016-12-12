package com.quidco.app.pages;

import com.quidco.app.pageObjects.LandingPageObject;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import static com.quidco.app.pageStepdef.BaseStepdef.homePage;
import static com.quidco.app.pageStepdef.BaseStepdef.loginPage;

/**
 * Created by ashishmohindroo on 11/8/16.
 */
public class LandingPage extends BasePage {

    private static LandingPage landingPage = new LandingPage();

    public static LandingPageObject landingPageObject = PageFactory.initElements(driver, LandingPageObject.class);
    ;

    private LandingPage() {
    }

    public static LandingPage getInstance() {
        return landingPage;
    }

    public void navigateToLandingPage() {
        driver.get(QuidcoAppUrl);
    }

    public LoginPage clickSignInOnNavigationBar() {
        waitForElementDisplay(landingPageObject.signInLink);
        landingPageObject.signInLink.click();
        return LoginPage.getInstance();
    }

    public void IamloggedinUser() {

        navigateToLandingPage();
        loginPage = clickSignInOnNavigationBar();
        homePage = loginPage.enterUsernameAndPassWord(landingPage.getUsername(), landingPage.getPassword()).clickSignInBtn();
        waitForElementDisplay(homePage.homePageObject.avatarIcon);
    }
    public QuidcoComparePage clickQuidcoCompare(){
        waitForElementDisplay(landingPageObject.waysToEarn_dropdown);
        actions.moveToElement(landingPageObject.waysToEarn_dropdown).build().perform();
        waitForElementDisplay(landingPageObject.quidcoCompareLink);
        landingPageObject.quidcoCompareLink.click();
        return QuidcoComparePage.getInstance();
    }
}


