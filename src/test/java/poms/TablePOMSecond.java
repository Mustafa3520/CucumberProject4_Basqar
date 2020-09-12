package poms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseDriver;

import java.util.ArrayList;
import java.util.List;

public class TablePOMSecond extends BasePOM {

    public TablePOMSecond() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(id = "mat-input-0")
    private WebElement emailInput;

    @FindBy(id = "mat-input-1")
    private WebElement passwordInput;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(linkText = "Got it!")
    private WebElement gotItButton;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement AddButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement NameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='title']/input")
    private WebElement positionSalaryName;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    private WebElement shortNameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    private WebElement CodeInput;

    @FindBy(css = "ms-save-button>button")
    private WebElement SaveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement SuccessfullyMessage;

    @FindBy(css = "[formgroupname=\"subjectCategory\"]")
    private WebElement subjectCatInSubject;

    @FindBy(xpath = "//span[@class='mat-option-text']")
    private List<WebElement> categoryList;

    @FindBy(xpath = "//div[contains(text(),'Error')]")
    private WebElement ErrorMessage;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement yesButton;

    @FindBy(css = "ms-delete-button>button")
    private List<WebElement> deleteButtonList;

    @FindBy(xpath = "//ms-edit-button/button")
    private List<WebElement> editButtonList;

    @FindBy(xpath = "//table/tbody/tr/td[2]")
    private List<WebElement> nameList;

    @FindBy(css = "input[data-placeholder='Name']")
    private WebElement searchInput;

    @FindBy(css = "ms-search-button")
    private WebElement searchButton;

    @FindBy(css = "ms-standard-button[tooltip='POSITIONS.BUTTON.POSITION_SALARY']")
    private WebElement positionButton;

    @FindBy(xpath = "//input[@formcontrolname='name']")
    private WebElement experienceRange;

    @FindBy(css = "[data-placeholder='From']")
    private WebElement From;

    @FindBy(css = "[aria-label='September 6, 2020']")
    private WebElement september6th;

    @FindBy(css = "[data-placeholder='Salary']")
    private WebElement salaryName;

    @FindBy(css = "[data-icon='plus']")
    private WebElement plusIcon;

    @FindBy(xpath = "//span[text()='Currency']")
    private WebElement currency;

    @FindBy(xpath = "//span[text()=' USD ']")
    private WebElement usd;

    @FindBy(xpath = "//span[text()=' Add ']")
    private WebElement addInSalary;

    WebElement myElement;

    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {
            case "loginButton":
                myElement = loginButton;
                break;
            case "gotItButton":
                myElement = gotItButton;
                break;
            case "AddButton":
                myElement = AddButton;
                break;
            case "SaveButton":
                myElement = SaveButton;
                break;
            case "subjectCatInSubject":
                myElement = subjectCatInSubject;
                break;
            case "yesButton":
                myElement = yesButton;
                break;
            case "positionButton":
                myElement = positionButton;
                break;
            case "From":
                myElement = From;
                break;
            case "september6th":
                myElement = september6th;
                break;
            case "currency":
                myElement = currency;
                break;
            case "usd":
                myElement = usd;
                break;
            case "addInSalary":
                myElement = addInSalary;
                break;
            case "plusIcon":
                myElement = plusIcon;
                break;


        }
        waitAndClick(myElement);
    }

    public void findElementAndSendKeysFunction(String ElementName, String value) {

        switch (ElementName) {
            case "emailInput":
                myElement = emailInput;
                break;
            case "passwordInput":
                myElement = passwordInput;
                break;
            case "NameInput":
                myElement = NameInput;
                break;
            case "shortNameInput":
                myElement = shortNameInput;
                break;
            case "CodeInput":
                myElement = CodeInput;
                break;
            case "experienceRange":
                myElement = experienceRange;
                break;
            case "positionSalaryName":
                myElement = positionSalaryName;
                break;
            case "salaryName":
                myElement = salaryName;
                break;


        }
        waitAndSendKeys(myElement, value);
    }

    public void findElementAndVerifyElementContainText(String elementName, String WhichText) {

        switch (elementName) {
            case "SuccessfullyMessage":
                myElement = SuccessfullyMessage;
                break;
            case "ErrorMessage":
                myElement = ErrorMessage;
                break;
        }
        ElementContainsText(myElement, WhichText);
    }

    public void clickOnElementInTheDropdown(String whichOption) {

        for (int i = 0; i < categoryList.size(); i++) {

            if (categoryList.get(i).getText().contains(whichOption)) {

                categoryList.get(i).click();
                break;
            }
        }
    }

    public void editAndDeleteFunction(String name , String editOrDelete){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<WebElement> whichList = new ArrayList<>();
        if(editOrDelete.equalsIgnoreCase("edit")){
            whichList=editButtonList;
        }else{
            whichList=deleteButtonList;
        }
        for(int i =0; i<nameList.size() ;i++){
            if(nameList.get(i).getText().equals(name)){
                waitAndClick(whichList.get(i));
            }
        }
    }
}
