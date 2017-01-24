package com.quidco.app.helper;

/**
 * Created by ashishmohindroo on 1/24/17.
 */
public class CheckoutDetails {
    public ShippingDetails shippingDetails;
    public CardDetails cardDetails;
    public BillingDetails billingDetails;

    public CheckoutDetails(){
        shippingDetails = new ShippingDetails();
        cardDetails = new CardDetails();
        billingDetails = new BillingDetails();
    }

    public class ShippingDetails {

        ShippingDetails(){
            addressFullName = "Quidco Tester";
            addressLine1 = "Great Eastern Street";
            addressCity = "London";
            addressPostCode = "EC2A3JL";
            shippingTelephoneNumber = "075573939393";
        }
        private String addressFullName;
        private String addressLine1;
        private String addressLine2;
        private String addressCity;
        private String addressPostCode;
        private String shippingTelephoneNumber;

        public String getAddressFullName() {
            return addressFullName;
        }

        public void setAddressFullName(String addressFullName) {
            this.addressFullName = addressFullName;
        }

        public String getAddressLine1() {
            return addressLine1;
        }

        public void setAddressLine1(String addressLine1) {
            this.addressLine1 = addressLine1;
        }

        public String getAddressLine2() {
            return addressLine2;
        }

        public void setAddressLine2(String addressLine2) {
            this.addressLine2 = addressLine2;
        }

        public String getAddressCity() {
            return addressCity;
        }

        public void setAddressCity(String addressCity) {
            this.addressCity = addressCity;
        }

        public String getAddressPostCode() {
            return addressPostCode;
        }

        public void setAddressPostCode(String addressPostCode) {
            this.addressPostCode = addressPostCode;
        }

        public String getShippingTelephoneNumber() {
            return shippingTelephoneNumber;
        }

        public void setShippingTelephoneNumber(String shippingTelephoneNumber) {
            this.shippingTelephoneNumber = shippingTelephoneNumber;
        }
    }

    public class CardDetails {
        private String cardName;
        private String cardNumber;
        private String expiryMonth;
        private String expiryYear;
        private String cvc;

        CardDetails(){
            cardName = "Quidco Tester";
            cardNumber = "4242424242424242";
            expiryMonth = "05";
            expiryYear = "2019";
            cvc = "516";
        }

        public String getCardName() {
            return cardName;
        }

        public void setCardName(String cardName) {
            this.cardName = cardName;
        }

        public String getCardNumber() {
            return cardNumber;
        }

        public void setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
        }

        public String getExpiryMonth() {
            return expiryMonth;
        }

        public void setExpiryMonth(String expiryMonth) {
            this.expiryMonth = expiryMonth;
        }

        public String getExpiryYear() {
            return expiryYear;
        }

        public void setExpiryYear(String expiryYear) {
            this.expiryYear = expiryYear;
        }

        public String getCvc() {
            return cvc;
        }

        public void setCvc(String cvc) {
            this.cvc = cvc;
        }
    }

    public class BillingDetails {
        private String billingAddressLine1;
        private String billingAddressLine2;
        private String billingCity;
        private String billingPostcode;

        BillingDetails(){
            billingAddressLine1 = "Great Eastern Street";
            billingCity = "London";
            billingPostcode = "EC2A3JL";

        }

        public String getBillingAddressLine1() {
            return billingAddressLine1;
        }

        public void setBillingAddressLine1(String billingAddressLine1) {
            this.billingAddressLine1 = billingAddressLine1;
        }

        public String getBillingAddressLine2() {
            return billingAddressLine2;
        }

        public void setBillingAddressLine2(String billingAddressLine2) {
            this.billingAddressLine2 = billingAddressLine2;
        }

        public String getBillingCity() {
            return billingCity;
        }

        public void setBillingCity(String billingCity) {
            this.billingCity = billingCity;
        }

        public String getBillingPostcode() {
            return billingPostcode;
        }

        public void setBillingPostcode(String billingPostcode) {
            this.billingPostcode = billingPostcode;
        }
    }
}