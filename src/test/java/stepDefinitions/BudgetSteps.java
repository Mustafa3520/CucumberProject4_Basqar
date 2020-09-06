package stepDefinitions;

import cucumber.api.java.en.*;
import poms.BasePOM;
import poms.BudgetPOM;


public class BudgetSteps extends BasePOM {
    BudgetPOM budget =new BudgetPOM();

    @Given("^I navigate to Budget Groups screen$")
    public void i_navigate_to_Budget_Groups_screen()  {
        budget.findElementAndClick("gotItButton");
        budget.findElementAndClick("menuBudget");
        budget.findElementAndClick("menuSetup");
        budget.findElementAndClick("budgetGroups");
    }

    @Given("^I navigate to Budget Groups screen to edit$")
    public void iNavigateToBudgetGroupsScreenToEdit() {
        budget.findElementAndClick("menuBudget");
        budget.findElementAndClick("menuSetup");
        budget.findElementAndClick("budgetGroups");
    }

    @When("^I create a Budget Groups name as \"([^\"]*)\"$")
    public void i_create_a_Budget_Groups_name_as(String name)  {
        budget.findElementAndClick("plusSign");
        budget.findElementAndSendKeys("description", name );

    }

    @And("^I add a start date as the choosen date$")
    public void iAddAStartDateAsTheChoosenDate() {
        budget.findElementAndClick("startDate");
        budget.findElementAndClick("september1st");
    }

    @And("^I add a finish date as the choosen date$")
    public void iAddAFinishDateAsTheChoosenDate() {
        budget.findElementAndClick("endDate");
        budget.findElementAndClick("september5th");
    }

    @And("^I add a comment as a \"([^\"]*)\"$")
    public void iAddACommentAsA(String comment)  {
        budget.findElementAndSendKeys("commentBox", comment);
    }

    @And("^I click the save Button$")
    public void iClickTheSaveButton() {
        budget.findElementAndClick("saveButton");
    }

    @Then("^Verify the \"([^\"]*)\" message$")
    public void verify_the_message(String message)  {
        budget.findElementAndVerifyElementContainText("SuccessfullyMessage", message);
    }

    @When("^I edit the Total Expenses Budget Group name to \"([^\"]*)\"$")
    public void iEditTheTotalExpensesBudgetGroupNameTo(String newName)  {
        budget.findElementAndClick("editButton");
        budget.findElementAndSendKeys("description", newName );
    }

    @And("^I edit a comment as a \"([^\"]*)\"$")
    public void iEditACommentAsA(String newComment)  {
        budget.findElementAndSendKeys("commentBox", newComment);
    }

    @When("^I delete the Budget Group with name \"([^\"]*)\"$")
    public void iDeleteTheBudgetGroupWithName(String name)  {
        budget.searchFor(name);
        budget.findElementAndClick("deleteButton");
        budget.findElementAndClick("yesButton");
    }

}
