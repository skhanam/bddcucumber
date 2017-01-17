package com.quidco.app.cucumber;

import com.quidco.app.pages.BasePage;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.util.logging.Level;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@regression",
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
        monochrome = true,
        glue = {"com.quidco.app.pages", "com.quidco.app.pageStepdef",
                "com.quidco.app.helper", "com.quidco.app.cucumber",
                "com.quidco.app.page", "com.quidco.app.utility"},
        features = {"src/test/resources/features"}
)

public class RegressionRunner extends BasePage {

    @BeforeClass
    public static void setUp() throws IOException {
        logger.log(Level.INFO, "Starting Browser");
        driver = getDriverInstance();
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDown() {
        logger.log(Level.INFO, "Quiting Browser");
        driver.quit();
    }
}
