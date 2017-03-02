package com.quidco.app.pages;

import com.quidco.app.helper.Constants;
import com.quidco.app.pageObjects.LandingPageObject;
import com.quidco.app.utility.JavaUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static com.quidco.app.pageStepdef.BaseStepdef.homePage;
import static com.quidco.app.pageStepdef.BaseStepdef.loginPage;

/**
 * Created by ashishmohindroo on 11/8/16.
 */
public class LandingPage extends BasePage {

    public static LandingPageObject landingPageObject = PageFactory.initElements(driver, LandingPageObject.class);
    public static String categoryTitle;
    private static LandingPage landingPage = new LandingPage();

    private LandingPage() {
    }

    public static String getCategoryTitle() {
        return categoryTitle;
    }

    public static void setCategoryTitle(String categoryTitle) {
        LandingPage.categoryTitle = categoryTitle;
    }

    public static LandingPage getInstance() {
        return landingPage;
    }

    public void navigateToLandingPage() {
        driver.get(quidcoAppUrl);
    }

    public LoginPage clickSignInOnNavigationBar() {
        waitForElementDisplay(landingPageObject.signInLink);
        landingPageObject.signInLink.click();
        return LoginPage.getInstance();
    }

    public void iamloggedinUser() {

        navigateToLandingPage();
        loginPage = clickSignInOnNavigationBar();
        homePage = loginPage.enterUsernameAndPassWord(landingPage.getUsername(), landingPage.getPassword()).clickSignInBtn();
        waitForElementDisplay(homePage.homePageObject.avatarIcon);
    }

    public QuidcoComparePage clickQuidcoCompare() {
        waitForElementDisplay(landingPageObject.waysToEarn_dropdown);
        actions.moveToElement(landingPageObject.waysToEarn_dropdown).build().perform();
        waitForElementDisplay(landingPageObject.quidcoCompareLink);
        landingPageObject.quidcoCompareLink.click();
        return QuidcoComparePage.getInstance();
    }

    public SignupPage click_join_quidco_now_btn() {
        waitForElementDisplay(LandingPageObject.join_quidco_btn);
        LandingPageObject.join_quidco_btn.click();
        return SignupPage.getInstance();
    }

    public void clickCategory(String categoryName) {
        setCategoryTitle(categoryName);
        WebElement categoryLink = driver.findElement(By.xpath(String.format(landingPageObject.categoryLink, categoryName)));
        scrollElementIntoMiddle(categoryLink);
        waitForElementDisplay(categoryLink);
        categoryLink.click();
    }

    public DiscoverPage navigateToDiscoverPage() {
        driver.navigate().to(Constants.discoverPageURL);
        return DiscoverPage.getInstance();
    }

    public void verify_category_label() {
        Assert.assertEquals(getCategoryTitle(), landingPageObject.categoryLabel.getText().trim());
    }

    public void check_if_retailers_listed() throws Exception {
        String retailersFound = JavaUtils.getSubstringWithPattern("[0-9]+", landingPageObject.numberOfRetailersFoundLabel.getText().trim());
        int retailersNumber = Integer.parseInt(retailersFound);
        System.out.println("Number of retailers are : " + retailersFound);
        Assert.assertFalse(retailersNumber == 0);
    }
}


