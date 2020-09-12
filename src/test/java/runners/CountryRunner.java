package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterSuite;
import utils.BaseDriver;

@CucumberOptions(
        plugin = {"html:target/cucumber-report"},
        features = {"src/test/java/featuresFiles/CountryAndCity.feature"},
        glue = {"stepDefinitions"},
        dryRun = false
)




public class CountryRunner extends AbstractTestNGCucumberTests {
    @AfterSuite
    public void quitDriver(){
        BaseDriver.quitDriver();
}
}
