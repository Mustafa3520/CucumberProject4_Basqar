package stepDefinitions;



import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import poms.HumanResourcePOM;

import java.util.List;
import java.util.Map;

    public class _03_SalaryModifiers {

        HumanResourcePOM humanResourcePage = new HumanResourcePOM();


        @When("^Create \"([^\"]*)\" Salary Modifiers$")
        public void create_Salary_Modifiers(String text1) {
            humanResourcePage.waitAndClick(humanResourcePage.plusElementSalaryModifiers);
            humanResourcePage.waitAndSendKeys(humanResourcePage.inputNameElementSalaryTypes, text1);
            humanResourcePage.waitAndSendKeys(humanResourcePage.userTypeElemment, "Manager");
            humanResourcePage.waitAndClick(humanResourcePage.saveButtonSalaryElemment);

        }


        @Then("^Edit \"([^\"]*)\" Salary Modifiers$")
        public void edit_Salary_Modifiers(String arg1) {

        }

        @Then("^Delete Salary Modifiers$")
        public void delete_Salary_Modifiers() {
            humanResourcePage.waitAndClick(humanResourcePage.deleteElementSalary);
            humanResourcePage.waitAndClick(humanResourcePage.submitButton);


        }


        @When("^I create salary Modifiers following fields$")
        public void iCreateSalaryModifiersFollowingFields(DataTable ModifiersElements) {
            humanResourcePage.waitAndClick(humanResourcePage.plusElementSalaryModifiers);

            Map<String, String> modifiers = ModifiersElements.asMap(String.class, String.class);
            humanResourcePage.waitAndSendKeys(humanResourcePage.description, modifiers.get("Description"));
            humanResourcePage.waitAndSendKeys(humanResourcePage.variable, modifiers.get("Variable "));
            humanResourcePage.waitAndSendKeys(humanResourcePage.modifierType, modifiers.get("Addition "));
            humanResourcePage.waitAndSendKeys(humanResourcePage.integrationCode, modifiers.get("439 "));
            humanResourcePage.waitAndSendKeys(humanResourcePage.valueType, modifiers.get(" Fixed Value "));
            humanResourcePage.waitAndSendKeys(humanResourcePage.priority, modifiers.get("1"));
            humanResourcePage.waitAndSendKeys(humanResourcePage.amount, modifiers.get("30"));

        }


    }


