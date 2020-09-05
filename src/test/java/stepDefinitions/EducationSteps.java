package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import poms.TablePOM;
import utils.BaseDriver;

public class EducationSteps {

    WebDriver driver;
    TablePOM table = new TablePOM();


    @Given("^Navigate to basqar$")
    public void navigate_to_basqar() {
        driver = BaseDriver.getDriver();

        driver.get("https://test.basqar.techno.study/");
        driver.manage().window().maximize();

    }

    @When("^Enter the username and password and click on login button$")
    public void enter_the_username_and_password_and_click_on_login_button() {
        table.findElementAndSendKeysFunction("emailInput", "daulet2030@gmail.com");
        table.findElementAndSendKeysFunction("passwordInput", "TechnoStudy123@");
        table.findElementAndClickFunction("loginButton");
        table.findElementAndClickFunction("gotItButton");
    }

    @Then("^User should login successfully$")
    public void user_should_login_successfully() {

        WebElement verifyLogin = driver.findElement(By.xpath("//span[text()='Dashboard']"));
        Assert.assertNotNull(verifyLogin);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @And("^Navigate to education page$")
    public void navigateToEducationPage() {
    }

    @When("^User create a subject category as \"([^\"]*)\"$")
    public void userCreateASubjectCategoryAs(String arg0)  {

    }

    @Then("^Success message should be displayed$")
    public void successMessageShouldBeDisplayed() {
    }

    @When("^User create a subject as \"([^\"]*)\" and choose MySubjectCat as a category$")
    public void userCreateASubjectAsAndChooseMySubjectCatAsACategory(String arg0) {

    }
}
