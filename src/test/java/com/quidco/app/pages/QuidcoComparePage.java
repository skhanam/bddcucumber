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

    public String getTabName() {
        return tabName;
    }

    public void setTabName(String tabName) {
        this.tabName = tabName;
    }

    private String tabName;

    public int getNumberOfFaqs() {
        return numberOfFaqs;
    }

    public void setNumberOfFaqs(int numberOfFaqs) {
        this.numberOfFaqs = numberOfFaqs;
    }

    private int numberOfFaqs;

    private static QuidcoComparePage quidcoComparePage = new QuidcoComparePage();

    public static QuidcoComparePageObject quidcoCompareObject = PageFactory.initElements(driver, QuidcoComparePageObject.class);

    private QuidcoComparePage() {
    }

    public static QuidcoComparePage getInstance() {
        return quidcoComparePage;
    }

    public void AreTabsDisplayed(List<String> options) {
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
                quidcoCompareObject.chooseCompareCarousel.click();
                validateText(QuidcoComparePageObject.chooseCompareTitle, quidcoCompareObject.chooseCompareTitleText);
                sleep(1000);
                quidcoCompareObject.moneyCashbackCaraousel.click();
                validateText(QuidcoComparePageObject.moneyCashbackTitle, quidcoCompareObject.moneyCashbackTitleText);
                sleep(1000);
                quidcoCompareObject.getPaidCaraousel.click();
                validateText(QuidcoComparePageObject.getPaidTitle, quidcoCompareObject.getPaidTitleText);
                break;
        }
    }

    public void checkNumberOfFAQs(int numberOfFAQs) {
        setNumberOfFaqs(numberOfFAQs);
        Assert.assertEquals(new Integer(quidcoCompareObject.faqTitles.size()), new Integer(numberOfFAQs));
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
}
