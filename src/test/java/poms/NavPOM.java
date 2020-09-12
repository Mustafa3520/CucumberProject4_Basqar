package poms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseDriver;

public class NavPOM extends BasePOM {
    public NavPOM() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Education']")
    private WebElement educationNav;
    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    private WebElement eduSetupButton;
    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement hrSetupButton;
    @FindBy(xpath = "//span[text()='Subject Categories']")
    private WebElement subjectCategory;
    @FindBy(xpath = "(//span[text()='Subjects'])[1]")
    private WebElement subject;
    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResources;
    @FindBy(xpath = "//span[text()='Positions']")
    private WebElement positions;
    @FindBy(xpath = "//span[text()='Position Salary']")
    private WebElement positionSalary;


    WebElement myElement;

    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {
            case "educationNav":
                myElement = educationNav;
                break;
            case "eduSetupButton":
                myElement = eduSetupButton;
                break;
            case "subjectCategory":
                myElement = subjectCategory;
                break;
            case "humanResources":
                myElement = humanResources;
                break;
            case "hrSetupButton":
                myElement = hrSetupButton;
                break;
            case "subject":
                myElement = subject;
                break;
            case "positions":
                myElement = positions;
                break;
            case "positionSalary":
                myElement = positionSalary;
                break;
        }
        waitAndClick(myElement);
    }
}
