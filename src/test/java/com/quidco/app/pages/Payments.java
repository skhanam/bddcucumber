package com.quidco.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by thadeus on 11/04/16.
 */
public class Payments extends BasePage {

    String paymentLink = ".dropdown-item.payments>p>a:contains(%s)";
    @FindBy(css = ".how-much.hidden-xs>p")
    private WebElement paymentMethod;
    @FindBy(css = "#user-avatar")
    private WebElement controlPanel;
    @FindBy(css = ".dropdown-item.payments>p>a")
    private WebElement paymentsLink;
    @FindBy(css = ".blue-text")
    private WebElement accountBalanceOnPayment;

    public void clickAndGoToPaymentsPage() {
        waitForElementDisplay(controlPanel);

//      builder.click(controlPanel).build().perform();
//        builder.moveToElement(paymentsLink).
//                click().
//                build().
//                perform();

    }

    public void validatePaymentPage() {
        waitForElementDisplay(accountBalanceOnPayment);
        accountBalanceOnPayment.isDisplayed();
    }
}
