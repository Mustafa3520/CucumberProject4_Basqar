package poms;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class HumanResourcePOM extends  BasePOM{
        public HumanResourcePOM() {
            PageFactory.initElements(driver, this);
        }

        @FindBy(xpath = "//span[text()='Human Resources']")
        public WebElement humanResourceElement;

        @FindBy(xpath = "(//span[text()='Setup'])[3]")
        public WebElement setUpElementHuman;

        /////////////////////////////////////////////////////////////////////
        @FindBy(xpath = "//span[text()='Salary Types']")
        public WebElement salaryTypesElement;

        // @FindBy(xpath = "//ms-add-button[contains(@tooltip,'FIELD.ADD')]//button")
        public WebElement plusElementSalaryTypes;

        @FindBy(xpath = "//input[@id=\"ms-text-field-0\"]")
        public WebElement inputNameElementSalaryTypes;

        @FindBy(xpath = "//input[@placeholder=\"User Type\"]")
        public WebElement userTypeElemment;

        @FindBy(xpath = "//span[text()='Save']")
        public WebElement saveButtonSalaryElemment;


        @FindBy(xpath = "//ms-edit-button")
        public WebElement editElementSalary;

        @FindBy(xpath = "//button[@color=\"warn\"]")
        public WebElement deleteElementSalary;


        @FindBy(xpath = "//button[@type=\"submit\"]")
        public WebElement submitButton;
///////////////////////////////////////////////////////////////////////////////////////


        @FindBy(xpath = "//span[text()='Salary Modifiers']")
        public WebElement salaryModifiersElement;

        @FindBy(css = "[class*='mat-focus-indicator mat-tooltip-trigger mat-button mat-icon-button mat-button-base ng-star-inserted']")
        public WebElement plusElementSalaryModifiers;


        @FindBy(xpath = "//input[@data-placeholder=\"Description\"]")
        public WebElement description;

        @FindBy(xpath = "//input[@formcontrolname=\"variable\"]")
        public WebElement variable;

        @FindBy(xpath = "//span[text()='Addition']")
        public WebElement modifierType;

        @FindBy(xpath = "//input[@data-placeholder=\"Integration Code\"]")

        public WebElement integrationCode;

        @FindBy(xpath = "//span[text()='Fixed Value']")
        public WebElement valueType;

        @FindBy(xpath = "//input[@data-placeholder=\"Priority\"]")
        public WebElement priority;

        @FindBy(xpath = "//input[@data-placeholder=\"Amount\"]")
        public WebElement amount;

        @FindBy(xpath = "//span[text()=\"Save\"]")
        public WebElement saveButtonModifier;

        @FindBy(xpath = "//span[text()=\"Delete\"]")
        public WebElement deleteButtonModifier;

        @FindBy(xpath = "//span[text()=\" Yes \"]")
        public WebElement yesButtonModifier;

        //
        @FindBy(xpath = "//*[text()='Salary Constants'")
        public WebElement salaryConstantsButton;
    }


