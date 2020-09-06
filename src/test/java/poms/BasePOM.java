package poms;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.BaseDriver;

public class BasePOM {

    protected WebDriverWait wait;
    protected WebDriver driver;

    public By progressBarLocator = By.tagName("mat-progress-bar");

    public BasePOM() {
        driver = BaseDriver.getDriver();
        wait = new WebDriverWait(driver, 10);
    }

    public void waitAndClick(WebElement element) {
        WebElement webElement = wait.until(ExpectedConditions.visibilityOf(element));
        webElement.click();
    }

    public void waitAndSendKeys(WebElement element, String text) {
        WebElement webElement = wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.clear();
        webElement.sendKeys(text);
    }

    public void waitForProgressBar() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(progressBarLocator));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(progressBarLocator));
        } catch (TimeoutException e) {
            System.out.println("There's no progress bar continue");
        }
    }

    public void ElementContainsText(WebElement element, String myText){

        wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertTrue(element.getText().contains(myText));
    }
}
