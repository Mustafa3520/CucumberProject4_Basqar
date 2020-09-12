package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import poms.NavPOM;
import poms.TablePOM;
import poms.TablePOMSecond;
import utils.BaseDriver;

public class HRSteps {

    TablePOMSecond table = new TablePOMSecond();
    NavPOM nav=new NavPOM();

    @And("^Navigate to Human Resources page$")
    public void navigateToHumanResourcesPage() {
    nav.findElementAndClickFunction("humanResources");
    nav.findElementAndClickFunction("hrSetupButton");

    }

    @When("^User create a position as \"([^\"]*)\" with code \"([^\"]*)\"$")
    public void userCreateAPositionAsWithCode(String name, String code) {
        table.findElementAndClickFunction("AddButton");
        table.findElementAndSendKeysFunction("NameInput",name);
        table.findElementAndSendKeysFunction("shortNameInput",code);
        table.findElementAndClickFunction("SaveButton");

    }


    @When("^User create \"([^\"]*)\"$")
    public void userCreateAPositionSalaryAs(String positionSalaryName) {
        table.findElementAndClickFunction("gotItButton");
        table.findElementAndClickFunction("AddButton");
        table.findElementAndSendKeysFunction("positionSalaryName",positionSalaryName);
        table.findElementAndClickFunction("SaveButton");
    }

    @When("^User edit the position salary of \"([^\"]*)\" to \"([^\"]*)\"$")
    public void userEditThePositionSalaryTo(String oldPositionSalaryName, String newPositionSalaryName)  {
        table.editAndDeleteFunction(oldPositionSalaryName,"edit");
        table.findElementAndSendKeysFunction("positionSalaryName", newPositionSalaryName);
        table.findElementAndClickFunction("SaveButton");
}

    @When("^User edit \"([^\"]*)\" to \"([^\"]*)\"$")
    public void userEditTo(String oldName, String newName)  {
        table.editAndDeleteFunction(oldName, "edit");
        table.findElementAndSendKeysFunction("NameInput", newName);
        table.findElementAndClickFunction("SaveButton");

    }

    @And("^Navigate to Position Salary$")
    public void navigateToPositionSalary() {
        nav.findElementAndClickFunction("positionSalary");
    }

    @And("^Navigate to Position$")
    public void navigateToPosition() {
        nav.findElementAndClickFunction("positions");
    }

    @And("^Add data in it$")
    public void addDataInIt() throws InterruptedException {
        table.findElementAndClickFunction("positionButton");
        Thread.sleep(2000);
        table.findElementAndClickFunction("plusIcon");
        table.findElementAndSendKeysFunction("experienceRange", "0-3");
        table.findElementAndClickFunction("From");
        table.findElementAndClickFunction("september6th");
        table.findElementAndSendKeysFunction("salaryName","100000");
        table.findElementAndClickFunction("currency");
        table.findElementAndClickFunction("usd");
        table.findElementAndClickFunction("addInSalary");
        table.findElementAndClickFunction("SaveButton");
    }
}
