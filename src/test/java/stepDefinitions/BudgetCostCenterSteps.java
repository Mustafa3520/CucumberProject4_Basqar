package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import poms.BasePOM;
import poms.BudgetPOM;

public class BudgetCostCenterSteps extends BasePOM {

    BudgetPOM budgetCCenter = new BudgetPOM();

    @Given("^I navigate to Cost Center screen$")
    public void iNavigateToCostCenterScreen() {
        budgetCCenter.findElementAndClick("gotItButton");
        budgetCCenter.findElementAndClick("menuBudget");
        budgetCCenter.findElementAndClick("menuSetup");
        budgetCCenter.findElementAndClick("menuBudgetCostCenter");


    }

    @When("^I create a Cost Center name as \"([^\"]*)\"$")
    public void iCreateACostCenterNameAs(String enterName) {
        budgetCCenter.findElementAndClick("plusSign");
        budgetCCenter.findElementAndClick("costCenterSegment");
        budgetCCenter.findElementAndSendKeys("nameInput", enterName);

    }

    @And("^I add a code as the \"([^\"]*)\"$")
    public void iAddACodeAsThe(String myCode)  {
        budgetCCenter.findElementAndSendKeys("code",myCode );
    }

    @And("^I add Personal as a Type from dropdown menu$")
    public void iAddPersonalAsATypeFromDropdownMenu() {
        budgetCCenter.findElementAndClick("type");
        budgetCCenter.findElementAndClick("personal");
    }

    @And("^I choose first option as prefixes from dropdown menu$")
    public void iChooseFirstOptionAsPrefixesFromDropdownMenu() {
        budgetCCenter.findElementAndClick("prefixes");
        budgetCCenter.findElementAndClick("personalInKhazakAlpahbet");
    }

    @When("^I edit the Bank Cost Center name to \"([^\"]*)\"$")
    public void iEditTheBankCostCenterNameTo(String newName)  {
        budgetCCenter.findElementAndClick("editButton");
        budgetCCenter.findElementAndSendKeys("nameInput", newName);


    }

    @And("^I edit the mycode code to \"([^\"]*)\"$")
    public void iEditTheMycodeCodeTo(String myNewCode)  {
        budgetCCenter.findElementAndSendKeys("code",myNewCode );
    }


    @When("^I delete the Cost Center$")
    public void iDeleteTheCostCenter() {
        budgetCCenter.findElementAndClick("gotItButton");
        budgetCCenter.findElementAndClick("deleteButton");
    }
}
