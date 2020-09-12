package poms;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class ReportsPOM extends BasePOM {
        public ReportsPOM() {
            PageFactory.initElements(driver, this);
        }

        @FindBy(xpath = "(//span[text()='Reports'])[3]")
        public WebElement createReportsElement;

        @FindBy(xpath = "(//span[text()='Setup'])[7]")
        public WebElement setUpElementExcel;

        @FindBy(xpath = "//span[text()='Excel Template']")
        public WebElement excelTemplateElement;

        @FindBy(xpath = "//ms-add-button[contains(@tooltip,'FIELD.ADD')]//button")
        public WebElement plusElementExcel;

        @FindBy(xpath = "(//input[@type=\"text\"])[2]")
        public WebElement inputNameElementexcel;

        @FindBy(xpath = "//input[@data-placeholder=\"Period Count\"]")
        public WebElement periodcountElemment;

        @FindBy(xpath = "//span[text()='Save']")
        public WebElement saveButtonExcellemment;


        @FindBy(xpath = "//input[@data-placeholder=\"Row Size\"]")
        public WebElement rowButtonExcellemment;


        @FindBy(xpath = "//input[@data-placeholder=Column Size]")
        public WebElement columnButtonExcellemment;

        @FindBy(xpath = "//ms-edit-button")
        public WebElement editElementExcel;

        @FindBy(css = "[class='svg-inline--fa fa-trash-alt fa-w-14']")
        public WebElement deleteButtonlemment;


        @FindBy(xpath = "//button[@type=\"submit\"]")
        public WebElement submitButton;




    }






