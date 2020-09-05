package poms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseDriver;

public class TablePOM extends BasePOM {

    public TablePOM() {
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


    WebElement myElement;

    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {
            case "loginButton":
                myElement = loginButton;
                break;
            case "gotItButton":
                myElement = gotItButton;
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
        }
        waitAndSendKeys(myElement,value);
    }


}
