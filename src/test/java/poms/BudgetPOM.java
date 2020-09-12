package poms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseDriver;

import java.util.List;

public class BudgetPOM extends BasePOM {

    public WebElement budgetElements;

    BasePOM page= new BasePOM();

    public BudgetPOM(){
        PageFactory.initElements(BaseDriver.getDriver(),this); }

    @FindBy(xpath = "//span[text()='Budget']" )
    private WebElement menuBudget;

    @FindBy(xpath = "(//span[text()='Setup'])[6]" )
    private WebElement menuSetup;

    @FindBy(xpath = "//span[text()='Budget Groups']" )
    private WebElement budgetGroups;

    @FindBy(xpath = "//input[@name='description']" )
    private WebElement description;

    @FindBy(xpath = "//input[@data-placeholder='Budget Info Entering Start Date']" )
    private WebElement startDate;

    @FindBy(xpath = "//input[@data-placeholder='Budget Info Entering End Date']" )
    private WebElement endDate;

    @FindBy(css = "[formcontrolname='comment']" )
    private WebElement commentBox;

    @FindBy(css = "svg[data-icon='plus']" )
    private WebElement plusSign;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement SuccessfullyMessage;

    @FindBy(xpath = "//div[contains(text(),'Error')]")
    private WebElement ErrorMessage;

    @FindBy(css = "ms-save-button" )
    private WebElement saveButton;

    @FindBy(linkText = "Got it!")
    private WebElement gotItButton;

    @FindBy(xpath = "//div[text()=1]")
    private WebElement september1st;

    @FindBy(xpath = "//div[text()=5]")
    private WebElement september5th;

    @FindBy(xpath = "//ms-edit-button/button")
    private WebElement editButton;

    @FindBy(css = "ms-delete-button>button")
    private WebElement deleteButton;

    @FindBy(xpath = "//input[@placeholder=\"Description\"]")
    private WebElement searchInput;

    @FindBy(css = "ms-search-button")
    private WebElement searchButton;

    @FindBy(css = ".mat-dialog-actions .mat-button-wrapper")
    private WebElement yesButton;

    @FindBy(xpath = "//span[text()='Cost Centers']" )
    private WebElement menuBudgetCostCenter;

    @FindBy(xpath = "//div[@role='tab']" )
    private WebElement costCenterSegment;

    @FindBy(css = "[formcontrolname='name']" )
    private WebElement nameInput;

    @FindBy(css = "[class='mat-form-field ng-tns-c147-195 mat-primary mat-form-field-type-ms-text-field mat-form-field-appearance-legacy mat-form-field-can-float mat-form-field-has-label mat-form-field-hide-placeholder ng-pristine ng-invalid mat-form-field-invalid ng-touched']" )
    private WebElement code;

    @FindBy(css = "[aria-label='Type']" )
    private WebElement type;

    @FindBy(xpath = "//span[text()=' Personal ']")
    private WebElement personal;

    @FindBy(css = "[aria-autocomplete='list']" )
    private WebElement prefixes;

    @FindBy(xpath = "//span[text()=' 2.1 | Персонал ']")
    private WebElement personalInKhazakAlpahbet;

    public void searchFor(String name) {
        page.waitAndSendKeys(searchInput,name);
        page.waitAndClick(searchButton);
        page.waitForProgressBar();
    }

    public void findElementAndClick (String element) {
        switch (element){
            case "gotItButton":
                budgetElements = gotItButton;
                break;
            case "menuBudget":
                budgetElements = menuBudget;
            break;
            case "menuSetup":
                budgetElements = menuSetup;
                break;
            case "budgetGroups":
                budgetElements = budgetGroups;
                break;
            case "startDate":
                budgetElements = startDate;
                break;
            case "endDate":
                budgetElements = endDate;
                break;
            case "plusSign":
                budgetElements = plusSign;
                break;
            case "saveButton":
                budgetElements = saveButton;
                break;
            case "september1st":
                budgetElements = september1st;
                break;
            case "september5th":
                budgetElements = september5th;
                break;
            case "editButton":
                budgetElements = editButton;
                break;
            case "deleteButton":
                budgetElements = deleteButton;
                break;
            case "yesButton":
                budgetElements = yesButton;
                break;
            case "menuBudgetCostCenter":
                budgetElements = menuBudgetCostCenter;
                break;
            case "type":
                budgetElements = type;
                break;
            case "personal":
                budgetElements = personal;
                break;
            case "prefixes":
                budgetElements = prefixes;
                break;
            case "personalInKhazakAlpahbet":
                budgetElements = personalInKhazakAlpahbet;
                break;
            case "costCenterSegment":
                budgetElements = costCenterSegment;
                break;





        }
        waitAndClick(budgetElements);

    }

    public void findElementAndSendKeys (String element, String value) {

        switch (element){
            case "menuBudget":
                budgetElements = menuBudget;
                break;
            case "description":
                budgetElements = description;
                break;
            case "startDate":
                budgetElements = startDate;
                break;
            case "endDate":
                budgetElements = endDate;
                break;
            case "commentBox":
                budgetElements = commentBox;
                break;
            case "nameInput":
                budgetElements = nameInput;
                break;
            case "code":
                budgetElements = code;
                break;


        }
        waitAndSendKeys(budgetElements, value);

    }

    public void findElementAndVerifyElementContainText(String element, String WhichText) {

        switch (element) {
            case "SuccessfullyMessage":
                budgetElements = SuccessfullyMessage;
                break;
            case "ErrorMessage":
                budgetElements = ErrorMessage;
                break;
        }
        ElementContainsText(budgetElements, WhichText);
    }

}
