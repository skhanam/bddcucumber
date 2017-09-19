package com.quidco.app.pages;

/**
 * Created by yusufmohammed on 14/09/17.
 */


import com.quidco.app.pageObjects.QuidcoCompareFaqPageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.List;


public class QuidcoCompareFaqPage extends BasePage {

    public static QuidcoCompareFaqPageObject quidcoCompareFaqObject = PageFactory.initElements(driver, QuidcoCompareFaqPageObject.class);
    private static QuidcoCompareFaqPage quidcoCompareFaqPage = new QuidcoCompareFaqPage();
    private String tabName;
    private int numberOfFaqs;
    private String category;

    private QuidcoCompareFaqPage() {
    }

    public static QuidcoCompareFaqPage getInstance() {
        return quidcoCompareFaqPage;
    }

    public String getFaqTabName() {
        return tabName;
    }

    public void setFaqTabName(String tabName) {
        this.tabName = tabName;
    }

    public int getNumberOfFFaqs() {
        return numberOfFaqs;
    }

    public void setNumberOfFFaqs(int numberOfFaqs) {
        this.numberOfFaqs = numberOfFaqs;
    }

//    public String getCategory() {
//        return category;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }

    public void areTabsFDisplayed(List<String> options) {
        scrollElementIntoView(driver.findElement(By.xpath(String.format(quidcoCompareFaqObject.quidcoCompareFaqTabs, options.get(0)))));
        for (String option : options) {
            waitForElementDisplay(driver.findElement(By.xpath(String.format(quidcoCompareFaqObject.quidcoCompareFaqTabs, option))));
        }
    }

    public QuidcoCompareFaqPage i_click_faqtab() {
        WebElement tab = waitForElementDisplay(driver.findElement(By.xpath(String.format(quidcoCompareFaqObject.quidcoCompareFaqTabs, this.getFaqTabName()))));
        tab.click();
        return this;
    }

    public void verify_content_for_tab() {
        switch (this.getFaqTabName()) {
            case QuidcoCompareFaqPageObject.HOWITWORKS:
                waitForElementDisplay(driver.findElement(By.xpath(String.format(quidcoCompareFaqObject.quidcoCompareFaqTabs, tabName))));
                scrollElementIntoMiddle(quidcoCompareFaqObject.chooseCompareCarousel);
                quidcoCompareFaqObject.chooseCompareCarousel.click();
                validateText(QuidcoCompareFaqPageObject.chooseCompareTitle, quidcoCompareFaqObject.chooseCompareTitleText);
                sleep(1000);
                scrollElementIntoMiddle(quidcoCompareFaqObject.moneyCashbackCaraousel);
                quidcoCompareFaqObject.moneyCashbackCaraousel.click();
                validateText(QuidcoCompareFaqPageObject.moneyCashbackTitle, quidcoCompareFaqObject.moneyCashbackTitleText);
                sleep(1000);
                scrollElementIntoMiddle(quidcoCompareFaqObject.getPaidCaraousel);
                quidcoCompareFaqObject.getPaidCaraousel.click();
                validateText(QuidcoCompareFaqPageObject.getPaidTitle, quidcoCompareFaqObject.getPaidTitleText);
                break;
            default:
                System.out.println("Looks like tab not present");
        }
    }

    public void checkNumberOfFAQs(int numberOfFAQs) {
        setNumberOfFFaqs(numberOfFAQs);
        System.out.println("****** Here i am  setNumberOfFFaqs(numberOfFAQs)  :"+ numberOfFAQs);
        Assert.assertEquals(Integer.valueOf(quidcoCompareFaqObject.faqTitles.size()), Integer.valueOf(numberOfFAQs));
    }

    public void validateFAQContent() {
        Iterator plusIterator = quidcoCompareFaqObject.plusSignsForFAQs.iterator();
        Iterator answerIterator = quidcoCompareFaqObject.faqAnswers.iterator();

        while (plusIterator.hasNext() && answerIterator.hasNext()) {
            WebElement e = (WebElement) plusIterator.next();
            scrollElementIntoViewatBottom(e);
            waitForElementDisplay(e);
            e.click();
            waitForElementDisplay((WebElement) answerIterator.next());
            e.click();
        }
    }

    public void verifyGridOptions(List<String> gridOptions) {
        for (String optionName : gridOptions) {
            waitForElementDisplay(driver.findElement(By.xpath(String.format(quidcoCompareFaqObject.compareGridOptionsFaq, optionName))));
        }
    }

//    public void clickGetaQuote(String gridOption) {
//        setCategory(gridOption);
//        waitForElementDisplay(driver.findElement(By.xpath(String.format(quidcoCompareFaqObject.getaQuoteBtn, gridOption))));
//        scrollElementIntoMiddle(driver.findElement(By.xpath(String.format(quidcoCompareFaqObject.getaQuoteBtn, gridOption))));
//        driver.findElement(By.xpath(String.format(quidcoCompareFaqObject.getaQuoteBtn, gridOption))).click();
//
//    }

//    public void checkBroadbandList() {
//        driver.switchTo().frame("quidco_compare");
//        preciseWaitForElement(quidcoCompareFaqObject.broadbandPackagesList.get(0));
//        if (getCategory().equalsIgnoreCase("Home Broadband") || getCategory().equalsIgnoreCase("Office Broadband"))
//            Assert.assertTrue(quidcoCompareFaqObject.broadbandPackagesList.size() > 0);
//        driver.switchTo().defaultContent();
//    }

//    public QuidcoCompareFaqPage clickIconCategoryUnderHowitWorksTab(String categoryName) {
//        setCategory(categoryName);
//        WebElement categoryIcon = driver.findElement(By.xpath(String.format(QuidcoCompareFaqPageObject.categoryIcon, categoryName)));
//        scrollElementIntoMiddle(categoryIcon);
//        waitForElementDisplay(categoryIcon);
//        categoryIcon.click();
//        return this;
//    }

//    public void checkCategoryOptionsVisible() {
//        switch (getCategory()) {
//            case QuidcoCompareFaqPageObject.INSURANCE:
//                for (String insurance : quidcoCompareFaqObject.insuranceTypes) {
//                    waitForElementDisplay(driver.findElement(By.xpath(String.format(quidcoCompareFaqObject.insuranceTypesLocator, insurance))));
//                }
//                break;
//            case QuidcoCompareFaqPageObject.ENERGY:
//                for (String energyType : quidcoCompareFaqObject.energyTypes) {
//                    waitForElementDisplay(driver.findElement(By.xpath(String.format(quidcoCompareFaqObject.energyTypesLocator, energyType))));
//                }
//                break;
//            case QuidcoCompareFaqPageObject.BROADBAND:
//                for (String broadbandType : quidcoCompareFaqObject.broadbandTypes) {
//                    waitForElementDisplay(driver.findElement(By.xpath(String.format(quidcoCompareFaqObject.broadbandTypesLocator, broadbandType))));
//                }
//
//        }
//
//    }
}