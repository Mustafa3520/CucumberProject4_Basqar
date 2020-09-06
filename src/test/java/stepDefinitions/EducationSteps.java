package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import poms.BasePOM;
import poms.EducationPOM;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class EducationSteps extends BasePOM {
    EducationPOM edu =new EducationPOM();


    @Given("^I navigate to \"([^\"]*)\" screen$")
    public void i_navigate_to_screen(String screen)  {
        waitAndClick(edu.menuEducation);
        waitAndClick(edu.menuSetup);
        switch (screen){
            case "Subject Categories":
                waitAndClick(edu.subjectCategories);
                break;
            case "Subjects":
                waitAndClick(edu.subjects);
                break;
        }

    }

    @When("^I create a Subject Category$")
    public void i_create_a_Category(DataTable table) {
        waitAndClick(edu.plus);
        List<String> nameAndCode = table.asList(String.class);
        waitAndSendKeys(edu.nameInput,nameAndCode.get(0));
        waitAndSendKeys(edu.codeInput,nameAndCode.get(1));
        waitAndClick(edu.saveButton);


    }

    @Then("^Verify the \"([^\"]*)\" message$")
    public void verify_the(String message) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(edu.alertWindow));
        Assert.assertTrue(verifyElementsContain(edu.alertWindow,message));
    }
    @When("^I create a Subject$")
    public void i_create_a_Subject(DataTable table)  {
        waitAndClick(edu.plus);
        Map<String, String> codeName = table.asMap(String.class, String.class);
        List<WebElement> listOfColorOptions = edu.listOfColorOptions;
        List<WebElement> listOfSelectOptions = edu.listOfSelectOptions;
        waitAndSendKeys(edu.nameInput,codeName.get("name"));
        waitAndSendKeys(edu.codeInput,codeName.get("code"));
        waitAndClick(edu.categoryDrop);
        int a=0;
        for (WebElement name : listOfSelectOptions) {
            if (name.getText().equalsIgnoreCase("International Politics")){
                waitAndClick(listOfSelectOptions.get(a));
            }
            a++;
        }

        waitAndClick(edu.colorDrop);
        waitAndClick(listOfColorOptions.get(new Random().nextInt(listOfColorOptions.size())));
        waitAndClick(edu.saveButton);


    }
    @When("^I delete \"([^\"]*)\"$")
    public void i_delete_category(String arg1) throws InterruptedException {
        edu.searchFor(arg1);
        waitAndClick(edu.trashButton);
        waitAndClick(edu.yesButton);

    }


    @And("^Go Back to Study Categories$")
    public void goBackToStudyCategories() {
        waitAndClick(edu.subjectCategories);
    }
}
