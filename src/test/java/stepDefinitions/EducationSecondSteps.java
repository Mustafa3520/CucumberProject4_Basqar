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
import poms.NavPOM;
import poms.TablePOM;
import poms.TablePOMSecond;
import utils.BaseDriver;

public class EducationSecondSteps {

    WebDriver driver;
    TablePOMSecond table = new TablePOMSecond();
    NavPOM nav=new NavPOM();


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
//        table.findElementAndClickFunction("gotItButton");
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
        nav.findElementAndClickFunction("educationNav");
        nav.findElementAndClickFunction("eduSetupButton");


    }

    @When("^User create \"([^\"]*)\" with code \"([^\"]*)\"$")
    public void userCreateASubjectCategoryAs(String category, String code)  {
        table.findElementAndClickFunction("AddButton");
        table.findElementAndSendKeysFunction("NameInput",category);
        table.findElementAndSendKeysFunction("CodeInput",code);
        table.findElementAndClickFunction("SaveButton");
    }

    @Then("^Success message should be displayed$")
    public void successMessageShouldBeDisplayed() {
    table.findElementAndVerifyElementContainText("SuccessfullyMessage","successfully");
    }

    @When("^User create \"([^\"]*)\" with code \"([^\"]*)\" and choose \"([^\"]*)\" as a category$")
    public void userCreateASubjectAsAndChooseMySubjectCatAsACategory(String subjectName, String code,String category) {
        table.findElementAndClickFunction("AddButton");
        table.findElementAndSendKeysFunction("NameInput",subjectName);
        table.findElementAndSendKeysFunction("CodeInput",code);
        table.findElementAndClickFunction("subjectCatInSubject");
        table.clickOnElementInTheDropdown(category);
        table.findElementAndClickFunction("SaveButton");


    }

    @Then("^Error message should be displayed$")
    public void errorMessageShouldBeDisplayed() {
        table.findElementAndVerifyElementContainText("ErrorMessage","Error");
    }

    @When("^User delete \"([^\"]*)\"$")
    public void userDelete(String categoryName) {
        table.editAndDeleteFunction(categoryName,"delete");
        table.findElementAndClickFunction("yesButton");
    }

    @And("^Navigate to Subject Category$")
    public void navigateToSubjectCategory() {
        nav.findElementAndClickFunction("subjectCategory");
    }

    @And("^Navigate to Subject$")
    public void navigateToSubject() {
        nav.findElementAndClickFunction("subject");
    }

}
