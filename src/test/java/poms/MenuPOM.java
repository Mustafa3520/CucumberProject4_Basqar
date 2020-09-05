package poms;

import org.openqa.selenium.By;

public class MenuPOM extends BasePOM {

    public By setupMenuLocator = By.xpath("//span[text()='Setup']");
    public By setup2MenuLocator = By.xpath("(//span[text()='Setup'])[2]");
    public By parametersMenuLocator = By.xpath("//span[text()='Parameters']");
    public By countriesMenuLocator = By.xpath("//span[text()='Countries']");
    public By citiesMenuLocator = By.xpath("//span[text()='Cities']");

}
