package com.quidco.app.pages;


/**
 * Created by ashishmohindroo on 12/12/16.
 */

import com.quidco.app.helper.Constants;
import com.quidco.app.pageObjects.QuidcoComparePageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

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

    private static QuidcoComparePage quidcoComparePage = new QuidcoComparePage();

    public static QuidcoComparePageObject quidcoCompareObject = PageFactory.initElements(driver, QuidcoComparePageObject.class);
    private QuidcoComparePage() {
    }

    public static QuidcoComparePage getInstance() {
        return quidcoComparePage;
    }

    public void AreTabsDisplayed(List<String>  options){
        scrollElementIntoView(driver.findElement(By.xpath(String.format(QuidcoComparePageObject.quidcoCompareTabs,options.get(0)))));
        for(String option: options){
            waitForElementDisplay(driver.findElement(By.xpath(String.format(QuidcoComparePageObject.quidcoCompareTabs,option))));
        }
    }

    public QuidcoComparePage i_click_tab(){
       WebElement tab = waitForElementDisplay(driver.findElement(By.xpath(String.format(QuidcoComparePageObject.quidcoCompareTabs,this.getTabName()))));
        tab.click();
        return this;
    }
    public void verify_content_for_tab()
    {
        switch (this.getTabName()){
            case QuidcoComparePageObject.HOWITWORKS:
                waitForElementDisplay(driver.findElement(By.xpath(String.format(QuidcoComparePageObject.HOWITWORKS,tabName))));
                QuidcoComparePageObject.chooseCompareCarousel.click();
                waitForElementDisplay(QuidcoComparePageObject.moneyCashbackCaraousel);
                QuidcoComparePageObject.moneyCashbackCaraousel.click();
                waitForElementDisplay(QuidcoComparePageObject.getPaidCaraousel);
                QuidcoComparePageObject.getPaidCaraousel.click();
                break;

        }
    }

}
