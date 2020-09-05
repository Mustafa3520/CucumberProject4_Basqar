package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import poms.MenuPOM;
import poms.TablePOM;
import utils.BaseDriver;

import java.sql.ClientInfoStatus;
import java.util.List;

public class part3_1steps {

    MenuPOM menu = new MenuPOM();
    TablePOM table = new TablePOM();
    private WebDriver driver;

    @Given("^I navigate to basqar$")
    public void i_navigate_to_basqar() {
        driver = BaseDriver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://test.basqar.techno.study/");
    }

    @When("^I try to login using username and password$")
    public void i_enter_username_and_password() {
        driver.findElement(By.cssSelector("[formcontrolname=\"username\"]")).sendKeys("daulet2030@gmail.com");
        driver.findElement(By.cssSelector("[formcontrolname=\"password\"]")).sendKeys("TechnoStudy123@");
        driver.findElement(By.cssSelector("[aria-label=\"LOGIN\"]")).click();
    }

    @Then("^I am logged in$")
    public void i_am_logged_in() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("img.avatar")));
    }


    @Given("^I navigate to \"([^\"]*)\" screen$")
    public void i_navigate_to_country_screen(String screenName) {

        menu.waitAndClick(menu.setupMenuLocator);
        menu.waitAndClick(menu.parametersMenuLocator);
        switch (screenName) {
            case "country":
                menu.waitAndClick(menu.countriesMenuLocator);
                break;
            case "city":
                menu.waitAndClick(menu.citiesMenuLocator);
                break;
            default:
                Assert.fail(screenName + " menu is not implement!");
        }
    }
    @Given("^I navigate to new \"([^\"]*)\" screen$")
    public void i_navigate_to_new_screen(String arg1){
        menu.waitAndClick(menu.setupMenuLocator);
        menu.waitAndClick(menu.parametersMenuLocator);
        menu.waitAndClick(menu.citiesMenuLocator);
    }

    @And("^\"([^\"]*)\" entity doesn't exist in table$")
    public void entityDoesNotExist(String entityName) {
        table.searchFor(entityName);
        table.deleteAllElementsFromTable();
    }

    @When("^I create \"([^\"]*)\" country$")
    public void i_create_country(String countryName) {
        table.waitAndClick(table.createButtonElement);
        table.waitAndSendKeys(table.nameInputElement, countryName);
        table.waitAndClick(table.saveButtonElement);
    }

    @Then("^I delete \"([^\"]*)\" country$")
    public void iDeleteCountry(String countryName) throws Throwable {
        table.searchFor(countryName);
        table.waitAndClick(table.deleteButtonLocator);
        table.waitAndClick(table.dialogSubmitButtonElement);
    }

    @When("^I create \"([^\"]*)\" city of \"([^\"]*)\"$")
    public void i_create_city(String cityName, String countryName) {
        table.waitAndClick(table.createButtonElement);
        driver.findElement(By.xpath("//div[@class=\"mat-select-trigger ng-tns-c210-73\"]")).click();
        List<WebElement> countries = driver.findElements(By.className("mat-option-text"));
        for (WebElement country : countries) {
            if(country.getText().equalsIgnoreCase(countryName)){
                country.click();
                break;

            }
            WebElement cityNameInput = driver.findElement(By.xpath("//div[@class=\"mat-form-field-infix ng-tns-c147-102\"]"));
            table.waitAndSendKeys(cityNameInput,cityName);
        }
    }

    @Then("^I delete \"([^\"]*)\" city$")
    public void i_delete_city(String cityName) {
        table.searchFor(cityName);
        table.waitAndClick(table.deleteButtonLocator);
        table.waitAndClick(table.dialogSubmitButtonElement);

    }
}

