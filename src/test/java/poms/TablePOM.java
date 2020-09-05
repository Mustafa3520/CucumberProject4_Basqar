package poms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class TablePOM extends BasePOM {

    public TablePOM() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "ms-text-field[placeholder='GENERAL.FIELD.NAME'] > input")
    public WebElement nameSearchElement;
    @FindBy(tagName = "ms-search-button")
    public WebElement searchButtonElement;
    @FindBy(css = "ms-browse-table tbody > tr")
    public List<WebElement> rowElement;
    public By deleteButtonLocator = By.cssSelector("ms-delete-button > button");
    @FindBy(css = "mat-dialog-actions button[type='submit']")
    public WebElement dialogSubmitButtonElement;

    @FindBy(css = "[data-icon=\"plus\"]")
    public WebElement createButtonElement;
    @FindBy(css = "ms-edit-button > button")
    public WebElement editButtonElement;
    @FindBy(css = "[formcontrolname=\"name\"] > input")
    public WebElement nameInputElement;
    @FindBy(tagName = "ms-save-button")
    public WebElement saveButtonElement;


    public void searchFor(String citizenshipName) {
        waitAndSendKeys(nameSearchElement, citizenshipName);
        waitAndClick(searchButtonElement);
        waitForProgressBar();
    }

    public void deleteFirstElementFromTable() {
        List<WebElement> elements = rowElement;
        elements.get(0).findElement(deleteButtonLocator).click();
        waitAndClick(dialogSubmitButtonElement);
    }

    public void deleteAllElementsFromTable() {
        List<WebElement> elements = rowElement;
        int numberOfElements = elements.size();
        while (numberOfElements > 0) {
            deleteFirstElementFromTable();
            wait.until(ExpectedConditions.numberOfElementsToBeLessThan(rowLocator, numberOfElements));
            numberOfElements = driver.findElements(rowLocator).size();
        }

    }
}
