package com.quidco.app.pages;

import com.quidco.app.helper.CheckoutDetails;
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

    public static HomePageObject homePageObject = PageFactory.initElements(driver, HomePageObject.class);
    private static HomePage homePage = new HomePage();
    public CheckoutDetails checkoutDetails;
    private String searchTerm;

    private HomePage() {
        checkoutDetails = new CheckoutDetails();
    }

    public static HomePage getInstance() {

        return homePage;
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

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

    public void moveToFavouriteIcon() {
        Actions builder = new Actions(driver);
        builder.moveToElement(homePageObject.favIcon).build().perform();
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
                default:
                    System.out.println("Looks like drop down not available");
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


    public void enterShippingDetails(boolean differentBillingAddress) {

        waitForElementDisplay(homePageObject.addressFullName);
        homePageObject.addressFullName.sendKeys(checkoutDetails.shippingDetails.getAddressFullName());
        homePageObject.addressLine1.sendKeys(checkoutDetails.shippingDetails.getAddressLine1());
//        homePageObject.addressLine2.sendKeys(checkoutDetails.shippingDetails.getAddressLine2());
        homePageObject.addressCity.sendKeys(checkoutDetails.shippingDetails.getAddressCity());
        homePageObject.addressPostcode.sendKeys(checkoutDetails.shippingDetails.getAddressPostCode());
        homePageObject.phoneNumber.sendKeys(checkoutDetails.shippingDetails.getShippingTelephoneNumber());
        homePageObject.cardName.sendKeys(checkoutDetails.cardDetails.getCardName());
        homePageObject.cardNumber.sendKeys(checkoutDetails.cardDetails.getCardNumber());
        homePageObject.cardExpiryMonth.sendKeys(checkoutDetails.cardDetails.getExpiryMonth());
        homePageObject.cardExpiryYear.sendKeys(checkoutDetails.cardDetails.getExpiryYear());
        homePageObject.cardCVC.sendKeys(checkoutDetails.cardDetails.getCvc());

        if (differentBillingAddress) {
            homePageObject.billingLine1.sendKeys(checkoutDetails.billingDetails.getBillingAddressLine1());
            homePageObject.billingLine2.sendKeys(checkoutDetails.billingDetails.getBillingAddressLine2());
            homePageObject.billingCity.sendKeys(checkoutDetails.billingDetails.getBillingCity());
            homePageObject.billingPostcode.sendKeys(checkoutDetails.billingDetails.getBillingPostcode());
        }
    }

    public void clickReviewOrSubmitOrder() {
        homePageObject.reviewOrSubmitOrderBtn.click();
    }

    public void verifyCheckoutSuccessfull() {
        wait.until(ExpectedConditions.visibilityOf(homePageObject.orderPlacedtitle));
    }

    public void addToFavouriteBtn() throws InterruptedException {
        Thread.sleep(1000);
        preciseWaitForElements(driver.findElements(By.cssSelector(".favourite-container")));
        Thread.sleep(1000);
        if (isElementPresent(By.cssSelector(homePageObject.removeFromFavBtn))) {
            driver.findElement(By.cssSelector(homePageObject.removeFromFavBtn)).click();
        }

        Thread.sleep(1000);
        WebElement e = waitForPresenceOfElement(By.cssSelector(homePageObject.addToFavBtn));
        e.click();
    }

    public void removeFromFavouriteBtn() {
        preciseWaitForElements(driver.findElements(By.cssSelector(homePageObject.favContainer)));
        if (isElementPresent(By.cssSelector(homePageObject.addToFavBtn))) {
            driver.findElement(By.cssSelector(homePageObject.addToFavBtn)).click();

        }
        WebElement e = waitForPresenceOfElement(By.cssSelector(homePageObject.removeFromFavBtn));
        e.click();
    }


    public void verifyIfRetailerAddedToFavourite() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitForPresenceOfElement(By.xpath(String.format(homePageObject.alertText)));
        Assert.assertEquals("Looks like the Retailer cannot be added as favourties for some reason", "Favourited " + getSearchTerm(), driver.findElement(By.xpath(String.format(homePageObject.alertText))).getText());
    }

    public void verifyIfRetailerRemovedFromFavourite() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("Looks like the Retailer cannot be removed from favourites for some reason", "Removed " + getSearchTerm() + " from Favourites", driver.findElement(By.xpath(String.format(homePageObject.alertText))).getText());
    }

    public void checkIfRetailerAddedUnderBookmarks() {
        Assert.assertTrue(isElementPresent(By.cssSelector(String.format(homePageObject.favDDItem, getSearchTerm()))));
    }

    public void checkIfRetailerRemovedUnderBookmarks() {
        Assert.assertFalse(isElementPresent(By.cssSelector(String.format(homePageObject.favDDItem, getSearchTerm()))));
    }

    public FavPage click_manage_favs() {
        WebElement option = waitForElementDisplay(homePageObject.manageFavouritesDropdown);
        option.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(homePageObject.favouritesHeaderTitle)));
        return FavPage.getInstance();
    }


}


