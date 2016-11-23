package com.quidco.app.cucumber;


import com.quidco.app.pages.BasePage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

/**
 * Created by Thadeus on 11/04/2017.
 */
public class Hooks extends BasePage {


    @BeforeClass
    public void beforeClass(){
        setCookieforVpn();

    }
    @Before
    public void beforeScenario(Scenario scenario) throws Exception {
//        driver.get(QuidcoAppUrl+"/access_beta.php");

    }

    public void embedScreenshot(Scenario scenario) {
        try {
            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        }
    }

    @After
    public void afterScenario(Scenario scenario) {
        embedScreenshot(scenario);
    }


}
