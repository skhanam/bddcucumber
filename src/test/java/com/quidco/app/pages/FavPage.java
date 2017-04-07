package com.quidco.app.pages;

import com.quidco.app.pageObjects.FavPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by amohindroo on 02/03/17.
 */
public class FavPage extends BasePage {

    private static FavPage favPage = new FavPage();
    protected FavPageObject favPageObject = PageFactory.initElements(driver, FavPageObject.class);

    private FavPage() {
    }

    public static FavPage getInstance() {
        return favPage;
    }

    public void removeAllRetailersAsFav() {
        List<WebElement> numOfRetailers = favPageObject.expandBtns;
        for (WebElement e : numOfRetailers) {
            e.click();
            waitForElementDisplay(favPageObject.removeBtn);
            scrollElementIntoMiddle(favPageObject.removeBtn);
            sleep(TimeUnit.SECONDS,1);
            scrollElementIntoMiddle(favPageObject.removeBtn);
            sleep(TimeUnit.SECONDS,1);
            favPageObject.removeBtn.click();
            flwait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(FavPageObject.removebtnFormat)));
            numOfRetailers = favPageObject.expandBtns;
        }


    }

    public void validateMerchantsUnderFavouritesBar() {

    }


}
