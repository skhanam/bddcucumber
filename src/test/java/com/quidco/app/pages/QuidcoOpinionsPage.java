package com.quidco.app.pages;

import com.quidco.app.pageObjects.QuidcoOpinionsPageObject;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by ashishmohindroo on 4/12/17.
 */
public class QuidcoOpinionsPage extends BasePage {


    public static QuidcoOpinionsPageObject quidcoOpinionsObject = PageFactory.initElements(driver, QuidcoOpinionsPageObject.class);
    private static QuidcoOpinionsPage quidcoOpinionsPage = new QuidcoOpinionsPage();

    private QuidcoOpinionsPage() {
    }

    public static QuidcoOpinionsPage getInstance() {
        return quidcoOpinionsPage;
    }

    public void fillInform() throws InterruptedException {
        HashMap<String, List<HashMap<String, Select>>> questionMap = new HashMap<>();

        List<HashMap<String, Select>> householdQuestionsList = new ArrayList<HashMap<String, Select>>();

        Select liveInhouseholdSelect = new Select(quidcoOpinionsObject.questions.get(0));
        HashMap<String, Select> liveinhouseholdMap = new HashMap<>();
        liveinhouseholdMap.put("liveinhousehold", liveInhouseholdSelect);

        Select haveChildren = new Select(quidcoOpinionsObject.questions.get(1));
        HashMap<String, Select> haveChildrenMap = new HashMap<>();
        haveChildrenMap.put("haveChildren", haveChildren);

        Select maritalStatus = new Select(quidcoOpinionsObject.questions.get(2));
        HashMap<String, Select> maritalStatusMap = new HashMap<>();
        maritalStatusMap.put("maritalStatus", maritalStatus);

        Select accSituation = new Select(quidcoOpinionsObject.questions.get(3));
        HashMap<String, Select> accSituationMap = new HashMap<>();
        accSituationMap.put("accSituationMap", accSituation);

        Select PIBeforeTax = new Select(quidcoOpinionsObject.questions.get(4));
        HashMap<String, Select> PIBeforeTaxMap = new HashMap<>();
        PIBeforeTaxMap.put("PIBeforeTax", PIBeforeTax);

        Select currentIncome = new Select(quidcoOpinionsObject.questions.get(5));
        HashMap<String, Select> currentIncomeMap = new HashMap<>();
        currentIncomeMap.put("currentIncome", currentIncome);

        Select stockTrading = new Select(quidcoOpinionsObject.questions.get(5));
        HashMap<String, Select> stockTradingMap = new HashMap<>();
        stockTradingMap.put("stockTrading", stockTrading);


        householdQuestionsList.add(liveinhouseholdMap);
        householdQuestionsList.add(haveChildrenMap);
        householdQuestionsList.add(maritalStatusMap);


        questionMap.put("Household", householdQuestionsList);


        HashMap<String, Select> householdquestions = questionMap.get("Household").get(0);
        householdquestions.get("liveinhousehold").selectByVisibleText("1");
        householdquestions.get("haveChildren").selectByVisibleText("No");
        householdquestions.get("maritalStatus").selectByVisibleText("Single");


        Thread.sleep(10000);
    }

    public QuidcoOpinionsPage clickToProfileBtn() {
        quidcoOpinionsObject.profileBtn.click();
        return QuidcoOpinionsPage.getInstance();
    }
}
