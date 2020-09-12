package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterSuite;
import utils.BaseDriver;

@CucumberOptions(
        plugin = {"html:target/cucumber-report"},
        features = {"src/test/java/featuresFiles/educationSecond.feature",
                    "src/test/java/featuresFiles/HR.feature"},
        glue = {"stepDefinitions"},
        dryRun = false
)
public class Education2Runner extends AbstractTestNGCucumberTests {
    @AfterSuite
    public void quitDriver(){
        BaseDriver.quitDriver();
    }
}
