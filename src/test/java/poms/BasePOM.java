package poms;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.BaseDriver;

import java.util.List;

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
    public void waitAndClick(By locator) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        driver.findElement(locator).click();
    }


    public void waitAndSendKeys(By locator, String text) {
        WebElement webElement = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
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
    public boolean verifyElementsContain(By locator, String text) {
        List<WebElement> elements = driver.findElements(locator);
        for (WebElement element : elements) {
            if(element.getText().contains(text)) {
                return true;
            }
        }
        return false;
    }


    public void ElementContainsText(WebElement element, String myText){

        wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertTrue(element.getText().contains(myText));
    }
}
