package com.quidco.app.pages;

import com.quidco.app.helper.Constants;
import com.quidco.app.pageObjects.HomePageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

/**
 * Created by thadeus on 11/04/16.
 */
public class HomePage extends BasePage {

    private static HomePage homePage = new HomePage();

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    private String searchTerm;


    private HomePage() {
    }

    public static HomePage getInstance() {
        return homePage;
    }

    public static HomePageObject homePageObject = PageFactory.initElements(driver, HomePageObject.class);


    public NotificationsPage clickAvatar() {
        homePageObject.avatarIcon.click();
        return NotificationsPage.getInstance();
    }

    public boolean isAvatarVisible() {
        try {
            homePageObject.avatarIcon.isDisplayed();
            return true;
        } catch (NoSuchElementException nosuchElementException) {
            return false;
        }
    }

    public void moveToAvatarIcon() {
        Actions builder = new Actions(driver);
        builder.moveToElement(homePageObject.avatarIcon).build().perform();
    }

    public void verifyDropDownOptions(List<String> options) {
        for (String option : options) {
            switch (option) {
                case "Account Summary":
                case "Activity":
                case "Payments":
                    waitForElementDisplay(driver.findElement(By.xpath(String.format(HomePageObject.userDropdownOptions, option))));
                    break;
                case "Refer Quidco":
                case "My reviews":
                case "Settings":
                    waitForElementDisplay(driver.findElement(By.xpath(String.format(HomePageObject.userDropdownOptionsWithSingleLine, option))));
                    break;
            }
        }
    }

    public NotificationsPage click_dropdown_option(String option) {

        WebElement el = waitForElementDisplay(driver.findElement(By.xpath(String.format(HomePageObject.userDropdownOptions, option, option))));
        el.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return NotificationsPage.getInstance();
    }

    public SearchResultsPage searchFor(String searchTerm) {
        setSearchTerm(searchTerm);
        waitForElementDisplay(HomePageObject.searchInput);
        HomePageObject.searchInput.clear();
        HomePageObject.searchInput.sendKeys(searchTerm);
        return SearchResultsPage.getInstance();
    }

    public void verify_presence_of_search_results_for_products(int numProducts) {
        waitForElementDisplay(homePageObject.productsLabel);
        Assert.assertTrue(numProducts == homePageObject.products.size());
    }

    public void click_buy_now_for_indexed_product(String productNumber) throws InterruptedException {
        executeJS("var e = document.querySelectorAll('::shadow msm-component-search-product-product .btn')[" + (Constants.countMap.get(productNumber) - 1) + "]; e.click();");
        Thread.sleep(5000);
    }

    public void click_buy_now_on_product_description_page() throws InterruptedException {
        executeJS("var e = document.querySelectorAll('::shadow .product-title')[1]; e.click();");
    }

    public void enterShippingDetails() {
        homePageObject.addressFullName.sendKeys("Test Quidco");
        homePageObject.addressLine1.sendKeys("Dummy Address Line 1");
        homePageObject.addressLine2.sendKeys("Dummy Address Line 2");
        homePageObject.addressCity.sendKeys("London");
        homePageObject.addressPostcode.sendKeys("EC2A3JL");
        //homePageObject.phoneNumber.sendKeys("");
        homePageObject.cardName.sendKeys("Card Holder Name");
        homePageObject.cardNumber.sendKeys("4444333322221111");
        homePageObject.cardExpiryMonth.sendKeys("5");
        homePageObject.cardExpiryYear.sendKeys("17");
        homePageObject.cardCVC.sendKeys("516");
    }
    public void clickReviewOrSubmitOrder(){
        homePageObject.reviewOrSubmitOrderBtn.click();
    }
    public void verifyCheckoutSuccessfull(){
        wait.until(ExpectedConditions.visibilityOf(homePageObject.orderPlacedtitle));
    }


}


