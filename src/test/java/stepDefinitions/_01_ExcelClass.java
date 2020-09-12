package stepDefinitions;

import cucumber.api.PendingException;
import utils.BaseDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import poms.ReportsPOM;

    public class _01_ExcelClass {

        ReportsPOM reportsPage = new ReportsPOM();

        @Given("^I navigate to excel template screen$")
        public void i_navigate_to_excel_template_screen() {

            reportsPage.waitAndClick(reportsPage.createReportsElement);
            reportsPage.waitAndClick(reportsPage.setUpElementExcel);
            reportsPage.waitAndClick(reportsPage.excelTemplateElement);
        }

        @When("^Create \"([^\"]*)\" excel template$")
        public void createExcelTemplate(String text1) {
            reportsPage.waitAndClick(reportsPage.plusElementExcel);
            reportsPage.waitAndSendKeys(reportsPage.inputNameElementexcel, text1);
            reportsPage.waitAndSendKeys(reportsPage.periodcountElemment,"2");
            reportsPage.waitAndClick(reportsPage.saveButtonExcellemment);
            reportsPage.waitAndSendKeys(reportsPage.rowButtonExcellemment, "2");
            reportsPage.waitAndSendKeys(reportsPage.columnButtonExcellemment, "2");
            reportsPage.waitAndClick(reportsPage.saveButtonExcellemment);
        }


        @Then("^Edit \"([^\"]*)\" excel template$")
        public void editExcelTemplate(String text2) {
            reportsPage.waitAndSendKeys(reportsPage.inputNameElementexcel, text2);
            reportsPage.waitAndSendKeys(reportsPage.periodcountElemment,"3");
            reportsPage.waitAndClick(reportsPage.saveButtonExcellemment);
            reportsPage.waitAndSendKeys(reportsPage.rowButtonExcellemment, "3");
            reportsPage.waitAndSendKeys(reportsPage.columnButtonExcellemment, "3");
            reportsPage.waitAndClick(reportsPage.saveButtonExcellemment);
        }

        @Then("^Delete excel template$")
        public void delete_excel_template() {
            reportsPage.waitAndClick(reportsPage.deleteButtonlemment);
            reportsPage.waitAndClick(reportsPage.submitButton);

        }



    }


