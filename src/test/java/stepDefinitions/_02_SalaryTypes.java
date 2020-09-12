package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import poms.HumanResourcePOM;
import poms.ReportsPOM;

    public class _02_SalaryTypes {


        HumanResourcePOM humanResourcePage = new HumanResourcePOM();
        @Given("^I navigate to \"([^\"]*)\" screen in HR$")
        public void iNavigateToScreenInHR(String arg0)  {
            humanResourcePage.waitAndClick(humanResourcePage.humanResourceElement);
            humanResourcePage.waitAndClick(humanResourcePage.setUpElementHuman);
            switch (arg0){
                case "Salary Types":
                    humanResourcePage.waitAndClick(humanResourcePage.salaryTypesElement);
                    break;
                case "Salary Modifiers":
                    humanResourcePage.waitAndClick(humanResourcePage.salaryModifiersElement);
                    break;
                case "Salary Constants":
                    humanResourcePage.waitAndClick(humanResourcePage.salaryConstantsButton);
                    break;

            }
        }


        @When("^Create \"([^\"]*)\" Salary Types$")
        public void create_Salary_Types(String text1)  {
            humanResourcePage.waitAndClick(humanResourcePage.plusElementSalaryTypes);
            humanResourcePage.waitAndSendKeys(humanResourcePage. inputNameElementSalaryTypes, text1);
            humanResourcePage.waitAndSendKeys(humanResourcePage.userTypeElemment,"Manager");
            humanResourcePage.waitAndClick(humanResourcePage.saveButtonSalaryElemment);

        }

        @Then("^Edit \"([^\"]*)\" Salary Types$")
        public void editSalaryTypes(String text2) throws Throwable {
            humanResourcePage.waitAndClick(humanResourcePage.editElementSalary);
            humanResourcePage.waitAndSendKeys(humanResourcePage.inputNameElementSalaryTypes,text2);
            humanResourcePage.waitAndSendKeys(humanResourcePage.userTypeElemment,"Student");
            humanResourcePage.waitAndClick(humanResourcePage.saveButtonSalaryElemment);
        }


        @Then("^Delete Salary Types$")
        public void delete_Salary_Types()  {
            humanResourcePage.waitAndClick(humanResourcePage.deleteButtonModifier);
            humanResourcePage.waitAndClick(humanResourcePage.submitButton);
        }



    }
