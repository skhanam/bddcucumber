package com.quidco.app.pages;


/**
 * Created by ashishmohindroo on 12/12/16.
 */

import com.quidco.app.pageObjects.QuidcoComparePageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.List;

/**
 * Created by ashishmohindroo on 12/12/16.
 */
public class QuidcoComparePage extends BasePage {

    public static QuidcoComparePageObject quidcoCompareObject = PageFactory.initElements(driver, QuidcoComparePageObject.class);
    private static QuidcoComparePage quidcoComparePage = new QuidcoComparePage();
    private String tabName;
    private int numberOfFaqs;
    private String category;

    private QuidcoComparePage() {
    }

    public static QuidcoComparePage getInstance() {
        return quidcoComparePage;
    }

    public String getTabName() {
        return tabName;
    }

    public void setTabName(String tabName) {
        this.tabName = tabName;
    }

    public int getNumberOfFaqs() {
        return numberOfFaqs;
    }

    public void setNumberOfFaqs(int numberOfFaqs) {
        this.numberOfFaqs = numberOfFaqs;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void areTabsDisplayed(List<String> options) {
        scrollElementIntoView(driver.findElement(By.xpath(String.format(quidcoCompareObject.quidcoCompareTabs, options.get(0)))));
        for (String option : options) {
            waitForElementDisplay(driver.findElement(By.xpath(String.format(quidcoCompareObject.quidcoCompareTabs, option))));
        }
    }

    public QuidcoComparePage i_click_tab() {
        WebElement tab = waitForElementDisplay(driver.findElement(By.xpath(String.format(quidcoCompareObject.quidcoCompareTabs, this.getTabName()))));
        tab.click();
        return this;
    }

    public void verify_content_for_tab() {
        switch (this.getTabName()) {
            case QuidcoComparePageObject.HOWITWORKS:
                waitForElementDisplay(driver.findElement(By.xpath(String.format(quidcoCompareObject.quidcoCompareTabs, tabName))));
                scrollElementIntoMiddle(quidcoCompareObject.chooseCompareCarousel);
                quidcoCompareObject.chooseCompareCarousel.click();
                validateText(QuidcoComparePageObject.chooseCompareTitle, quidcoCompareObject.chooseCompareTitleText);
                sleep(1000);
                scrollElementIntoMiddle(quidcoCompareObject.moneyCashbackCaraousel);
                quidcoCompareObject.moneyCashbackCaraousel.click();
                validateText(QuidcoComparePageObject.moneyCashbackTitle, quidcoCompareObject.moneyCashbackTitleText);
                sleep(1000);
                scrollElementIntoMiddle(quidcoCompareObject.getPaidCaraousel);
                quidcoCompareObject.getPaidCaraousel.click();
                validateText(QuidcoComparePageObject.getPaidTitle, quidcoCompareObject.getPaidTitleText);
                break;
            default:
                System.out.println("Looks like tab not present");
        }
    }

    public void checkNumberOfFAQs(int numberOfFAQs) {
        setNumberOfFaqs(numberOfFAQs);
        Assert.assertEquals(Integer.valueOf(quidcoCompareObject.faqTitles.size()), Integer.valueOf(numberOfFAQs));
    }

    public void validateFAQContent() {
        Iterator plusIterator = quidcoCompareObject.plusSignsForFAQs.iterator();
        Iterator answerIterator = quidcoCompareObject.faqAnswers.iterator();

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
            waitForElementDisplay(driver.findElement(By.xpath(String.format(quidcoCompareObject.compareGridOptions, optionName))));
        }
    }

    public void clickGetaQuote(String gridOption) {
        setCategory(gridOption);
        waitForElementDisplay(driver.findElement(By.xpath(String.format(quidcoCompareObject.getaQuoteBtn, gridOption))));
        scrollElementIntoMiddle(driver.findElement(By.xpath(String.format(quidcoCompareObject.getaQuoteBtn, gridOption))));
        driver.findElement(By.xpath(String.format(quidcoCompareObject.getaQuoteBtn, gridOption))).click();

    }

    public void checkBroadbandList() {
        driver.switchTo().frame("quidco_compare");
        preciseWaitForElement(quidcoCompareObject.broadbandPackagesList.get(0));
        //if (getCategory().equalsIgnoreCase("home broadband") || getCategory().equalsIgnoreCase("broadband"))
        if (getCategory().equalsIgnoreCase("Home Broadband") || getCategory().equalsIgnoreCase("Office Broadband") || getCategory().equalsIgnoreCase("Mobile Broadband"))
            //Assert.assertEquals("true", quidcoCompareObject.broadband_cb.getAttribute("checked"));
        Assert.assertTrue(quidcoCompareObject.broadbandPackagesList.size() > 0);
        driver.switchTo().defaultContent();
    }

    public QuidcoComparePage clickIconCategoryUnderHowitWorksTab(String categoryName) {
        setCategory(categoryName);
        WebElement categoryIcon = driver.findElement(By.xpath(String.format(QuidcoComparePageObject.categoryIcon, categoryName)));
        scrollElementIntoMiddle(categoryIcon);
        waitForElementDisplay(categoryIcon);
        categoryIcon.click();
        return this;
    }

    public void checkCategoryOptionsVisible() {
        switch (getCategory()) {
            case QuidcoComparePageObject.INSURANCE:
                for (String insurance : quidcoCompareObject.insuranceTypes) {
                    waitForElementDisplay(driver.findElement(By.xpath(String.format(quidcoCompareObject.insuranceTypesLocator, insurance))));
                }
                break;
            case QuidcoComparePageObject.ENERGY:
                for (String energyType : quidcoCompareObject.energyTypes) {
                    waitForElementDisplay(driver.findElement(By.xpath(String.format(quidcoCompareObject.energyTypesLocator, energyType))));
                }
                break;
            case QuidcoComparePageObject.BROADBAND:
                for (String broadbandType : quidcoCompareObject.broadbandTypes) {
                    waitForElementDisplay(driver.findElement(By.xpath(String.format(quidcoCompareObject.broadbandTypesLocator, broadbandType))));
                }

        }

    }
}
