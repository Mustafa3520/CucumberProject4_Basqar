package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import poms.CountryPOM;
import poms.MenuPOM;
import utils.BaseDriver;

import java.util.List;

public class CountryAndCitySteps extends BaseDriver {

    MenuPOM menu = new MenuPOM();
    CountryPOM countryPOM = new CountryPOM();
    private WebDriver driver=BaseDriver.getDriver();

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
    public void i_navigate_to_new_screen(String screenName) throws InterruptedException {
        Thread.sleep(2000);
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

    @And("^\"([^\"]*)\" entity doesn't exist in table$")
    public void entityDoesNotExist(String entityName) {
        countryPOM.searchFor(entityName);
        countryPOM.deleteAllElementsFromTable();
    }

    @When("^I create \"([^\"]*)\" country$")
    public void i_create_country(String countryName) {
        countryPOM.waitAndClick(countryPOM.createButtonElement);
        countryPOM.waitAndSendKeys(countryPOM.nameInputElement, countryName);
        countryPOM.waitAndClick(countryPOM.saveButtonElement);
    }

    @Then("^I delete \"([^\"]*)\" country$")
    public void iDeleteCountry(String countryName) throws Throwable {
        countryPOM.searchFor(countryName);
        countryPOM.waitAndClick(countryPOM.deleteButtonLocator);
        countryPOM.waitAndClick(countryPOM.dialogSubmitButtonElement);
    }

    @When("^I create \"([^\"]*)\" city of \"([^\"]*)\"$")
    public void i_create_city(String cityName, String countryName) throws InterruptedException {
        countryPOM.waitAndClick(countryPOM.createButtonElement);
        Thread.sleep(4000);
        //
        driver.findElement(By.xpath("(//ms-dialog//mat-select)[1]")).click();
        List<WebElement> countries = driver.findElements(By.className("mat-option-text"));
        int a = 0;
        for (WebElement country : countries) {
            if(country.getText().equalsIgnoreCase(countryName)){
                countries.get(a).click();
                break;
            }
            a++;
        }

        Thread.sleep(2000);
        WebElement cityNameInput = driver.findElement(By.cssSelector("[formcontrolname=\"name\"]>input"));
        countryPOM.waitAndSendKeys(cityNameInput,cityName);
        countryPOM.waitAndClick(countryPOM.saveButtonElement);

    }

    @Then("^I delete \"([^\"]*)\" city$")
    public void i_delete_city(String cityName) throws InterruptedException {
        Thread.sleep(2000);
        countryPOM.searchFor(cityName);
        countryPOM.waitAndClick(countryPOM.deleteButtonLocator);
        countryPOM.waitAndClick(countryPOM.dialogSubmitButtonElement);

    }
}