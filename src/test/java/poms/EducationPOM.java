package poms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseDriver;
import java.util.List;

    public class EducationPOM extends BaseDriver {
        BasePOM page= new BasePOM();
        public EducationPOM(){
            PageFactory.initElements(BaseDriver.getDriver(),this);
        }
        public By menuEducation= By.xpath("//span[text()='Education']");
        public By menuSetup=By.xpath("(//span[text()='Setup'])[5]");
        public By subjectCategories=By.xpath("//span[text()='Subject Categories']");
        public By subjects=By.xpath("//span[text()='Subjects']");
        public By searchInput=By.cssSelector("ms-text-field[placeholder='GENERAL.FIELD.NAME']>input");
        public By searchButton=By.cssSelector("ms-search-button");
        public By trashButton=By.cssSelector("ms-delete-button > button");
        public By yesButton=By.cssSelector(".mat-dialog-actions .mat-button-wrapper");
        public  By alertWindow=By.cssSelector("div[role='alertdialog']");
        public By plus=By.cssSelector("svg[data-icon='plus']");
        public By nameInput=By.cssSelector("[formcontrolname=\"name\"] > input");
        public By codeInput=By.cssSelector(" [formcontrolname=\"code\"] > input");
        public By saveButton=By.cssSelector("ms-save-button");
        public By categoryDrop=By.cssSelector("[formgroupname=\"subjectCategory\"]");
        @FindBy(css = ".mat-select-panel mat-option")
        public List<WebElement> listOfSelectOptions;
        @FindBy(css = "mat-option[role='option']")
        public  List<WebElement> listOfColorOptions;
        public By colorDrop=By.cssSelector("[formcontrolname='value']");

        public void searchFor(String subject)  {
            page.waitAndSendKeys(searchInput,subject);
            page.waitAndClick(searchButton);
            page.waitForProgressBar();
        }


    }


