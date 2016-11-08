package com.quidco.app.cucumber;

import com.quidco.app.pages.BasePage;
import com.quidco.app.utility.Driver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions( tags="@login-logout",
        plugin= {"pretty","html:target/cucumber", "json:target/cucumber.json"},
        monochrome = true,
        glue = { "com.quidco.app.pages", "com.quidco.app.pageStepdef",
                "com.quidco.app.helper","com.quidco.app.cucumber",
                 "com.quidco.app.page","com.quidco.app.utility"},
        features={"src/test/resources/testFeature"}
        //,@QP-888-Fake-exact-matches

)

public class Runner extends BasePage {

    @BeforeClass
    public static void setUp() throws IOException {
        System.out.println("Starting testing");
        driver = getDriverInstance("chrome");
        driver.manage().window().maximize();

    }

    @AfterClass
    public static void tearDown(){
    System.out.println("Quiting browser");
    driver.quit();
}


}
