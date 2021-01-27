package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class CandidateSkillsAndQualificationsAddQualificationPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public CandidateSkillsAndQualificationsAddQualificationPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver, 10);
    }

    By btnSkillsAndQualification= By.xpath("//li[@ng-click=\"  vm.selectedTab = 'candidateSkills'\"]");

    By btnAdd = By.xpath("");

    By txtInstitution_menu= By.name("institution");

    By txtDegree_menu= By.name("degree");

    By txtLevel_menu= By.xpath("//div[@ng-model='vm.education.level']");

    By txtCourseSubject_menu= By.name("courseSubject");

    By txtCompletionDate = By.xpath("");



    @FindBy(xpath = "//button[@data-ng-disabled='!vm.canSave()']")
    @CacheLookup
    WebElement btnSaves;

    //##################################Actions#######################################################

    public void clickBtnSkillsAndQualification(){
        ldriver.findElement(btnAdd).click();
    }

    public void clickBtnAdd(){
        ldriver.findElement(btnSkillsAndQualification).click();
    }


    public void setTxtQualification_menu(String vendor_menu) throws Exception {
        Thread.sleep(3000);

        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);

        ldriver.findElement(txtInstitution_menu).click();

    }

    public void clickQualification_menuitem_firstOption() {
        //Wait until the list of options is present

        //wait.until(ExpectedConditions.presenceOfElementLocated(txtJobTitle_menuitem));
        //Initialize the Actions class
        Actions actions = new Actions(ldriver);
        //Execute the actions
        actions .pause(500) // 500ms or 0.5s
                .sendKeys(Keys.ARROW_DOWN)
                .pause(500) // 500ms or 0.5s
                .sendKeys(Keys.ENTER)
                .pause(500) // 500ms or 0.5s
                .perform();

        clickQualification_menuitem();
    }
    public void clickQualification_menuitem() {
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        //WebElement element = waiting.until(ExpectedConditions.visibilityOfElementLocated(txtOrganisation_menuitem));
        //element.click();
        //ldriver.findElement(txtJobTitle_menuitem);
        List<By> locators = new ArrayList<>();
        //locators.add(txtJobTitle_menuitem);
        //locators.add(By.cssSelector("div.someClass"));
        // add all your locators to the List<>

        for (By locator : locators)
        {
            List<WebElement> elements = ldriver.findElements(locator);

            if (elements.size() > 0)
            {
                elements.get(0).click();
                break;
            }
        }


    }


    public void setTxtDegree_menu(String vendor_menu) throws Exception {
        Thread.sleep(3000);

        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);

        ldriver.findElement(txtInstitution_menu).click();

    }

    public void clickDegree_menuitem_firstOption() {
        //Wait until the list of options is present

        //wait.until(ExpectedConditions.presenceOfElementLocated(txtJobTitle_menuitem));
        //Initialize the Actions class
        Actions actions = new Actions(ldriver);
        //Execute the actions
        actions .pause(500) // 500ms or 0.5s
                .sendKeys(Keys.ARROW_DOWN)
                .pause(500) // 500ms or 0.5s
                .sendKeys(Keys.ENTER)
                .pause(500) // 500ms or 0.5s
                .perform();

        clickDegree_menuitem();
    }
    public void clickDegree_menuitem() {
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        //WebElement element = waiting.until(ExpectedConditions.visibilityOfElementLocated(txtOrganisation_menuitem));
        //element.click();
        //ldriver.findElement(txtJobTitle_menuitem);
        List<By> locators = new ArrayList<>();
        //locators.add(txtJobTitle_menuitem);
        //locators.add(By.cssSelector("div.someClass"));
        // add all your locators to the List<>

        for (By locator : locators)
        {
            List<WebElement> elements = ldriver.findElements(locator);

            if (elements.size() > 0)
            {
                elements.get(0).click();
                break;
            }
        }


    }




}
