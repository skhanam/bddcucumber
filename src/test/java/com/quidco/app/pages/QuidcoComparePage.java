package com.quidco.app.pages;


/**
 * Created by ashishmohindroo on 12/12/16.
 */

import com.quidco.app.pageObjects.QuidcoComparePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by ashishmohindroo on 12/12/16.
 */
public class QuidcoComparePage extends BasePage {

    private static QuidcoComparePage quidcoComparePage = new QuidcoComparePage();

    public static QuidcoComparePageObject quidcoCompareObject = PageFactory.initElements(driver, QuidcoComparePageObject.class);

    private QuidcoComparePage() {
    }

    public static QuidcoComparePage getInstance() {
        return quidcoComparePage;
    }

    public void AreTabsDisplayed(List<String>  options){
        scrollElementIntoView(driver.findElement(By.xpath("//div[@class=\"proposition__nav\"]//ul[contains(@class,\"nav-tabs\")]//li/a[text()=\""+options.get(0)+"\"]")));
        for(String option: options){
            waitForElementDisplay(driver.findElement(By.xpath("//div[@class=\"proposition__nav\"]//ul[contains(@class,\"nav-tabs\")]//li/a[text()=\""+option+"\"]")));
        }
    }

}
