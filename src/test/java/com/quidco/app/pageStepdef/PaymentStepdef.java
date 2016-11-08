package com.quidco.app.pageStepdef;

import com.quidco.app.pages.Payments;
import com.quidco.app.utility.Driver;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by thadeus on 11/04/16.
 */
public class PaymentStepdef {
Payments pay = PageFactory.initElements(Driver.driver,Payments.class);

    @Then("^I click on the payment link$")
    public void i_click_on_the_payment_link() throws Throwable {
        pay.clickAndGoToPaymentsPage();
    }

    @Then("^I should be on the payments page$")
    public void i_should_be_on_the_payments_page() throws Throwable {
        pay.validatePaymentPage();

    }


}
