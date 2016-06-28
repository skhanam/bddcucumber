package com.quidco.app.cucumber;

import com.quidco.app.utility.Driver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions( tags="@QP-888-Fake-exact-matches",
        plugin= {"pretty","html:target/cucumber", "json:target/cucumber.json"},
        monochrome = true,
        glue = { "com.quidco.app.pages", "com.quidco.app.page_sd",
                "com.quidco.app.helper","com.quidco.app.cucumber",
                 "com.quidco.app.page","com.quidco.app.utility"},
        features={"src/test/resources/testFeature"}
        //,@QP-888-Fake-exact-matches

)

public class Runner extends Driver {

    @BeforeClass
    public static void setUp() throws IOException {
        System.out.println("Starting testing");
        Driver.driver("chrome");
        Driver.driver.manage().window().maximize();

    }

    @AfterClass
    public static void tearDown(){
    System.out.println("Quiting browser");
    Driver.driver.quit();
}


}
