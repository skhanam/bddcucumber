package com.quidco.app.pages;

import com.quidco.app.helper.Constants;
import com.quidco.app.pageObjects.LandingPageObject;
import com.quidco.app.utility.JavaUtils;
import org.apache.bcel.generic.LAND;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.quidco.app.pageStepdef.BaseStepdef.homePage;
import static com.quidco.app.pageStepdef.BaseStepdef.landingPage;
import static com.quidco.app.pageStepdef.BaseStepdef.loginPage;

/**
 * Created by ashishmohindroo on 11/8/16.
 */
public class LandingPage extends BasePage {

            public static LandingPageObject landingPageObject = PageFactory.initElements(driver, LandingPageObject.class);
            public static String categoryTitle;
            private static LandingPage  landingPage = new LandingPage();

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
                if (isElementVisible(landingPageObject.exploreBtn)) {
                    landingPageObject.exploreBtn.click();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }

            public LoginPage navigateToSignInPage() {
                driver.get(quidcoAppUrl + "/sign-in/");
                if (isElementVisible(landingPageObject.exploreBtn)) {
                    landingPageObject.exploreBtn.click();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                return LoginPage.getInstance();
            }


            public LoginPage clickSignInOnNavigationBar() {
                waitForElementDisplay(landingPageObject.signInLink);
                landingPageObject.signInLink.click();
                return LoginPage.getInstance();
            }

            public void iamloggedinUser() {

                loginPage = navigateToSignInPage();
                homePage = loginPage.enterUsernameAndPassWord(landingPage.getUsername(), landingPage.getPassword()).clickSignInBtn();
                waitForElementDisplay(homePage.homePageObject.homeCategory);
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

            public void showmore(){
                LandingPageObject.showMore.click();
            }

  /*
        This method is written so that it goe sto Show more drop down
        traverses to all sub categories available there.
        @s.khanam
        @params none
        returns @landingPage
     */
    public LandingPage clickCategory(){
                List<WebElement> links = driver.findElements(By.cssSelector(".category"));
                int linkCount=links.size();
                String[] texts=new String[linkCount];
                int t=0;
                for (WebElement text:links){
                    texts[t]=text.getText();
                    System.out.println(texts[t]);
                    t++;
                }
                for (String clicks:texts) {
                    if(!(clicks.isEmpty())) {
                        driver.findElement(By.linkText(clicks)).click();

                        if (driver.getTitle().equals("notWorkingUrlTitle")) {
                            System.out.println("\"" + t + "\""
                                    + " is not working.");
                        } else {
                            System.out.println("\"" + t + "\""
                                    + " is working.");
                        }
                        landingPage.showmore();
                    }

                }
                return LandingPage.getInstance();
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


            public DiscoverPage navigateToDiscoverPage() {
                driver.navigate().to(Constants.discoverPageURL);
                return DiscoverPage.getInstance();
            }
}


