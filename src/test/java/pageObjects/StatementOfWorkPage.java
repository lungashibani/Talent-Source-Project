package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class StatementOfWorkPage {
    public WebDriver ldriver;
    public WebDriverWait wait;


    public StatementOfWorkPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    @FindBy(xpath = "//div[@class='col-lg-12 margin-bottom15']//a[3]")
    @CacheLookup
    WebElement btnStatementOfWork;

    By txtShortJobSpec = By.xpath("//textarea[@ng-model='vm.job.ShortJobSpec']");

    By txtCurrency = By.xpath("//div[@ng-model='vm.job.Currency']");

    By txtProjectManager = By.xpath("//div[@ng-model='vm.job.ProjectManager']");




    By btnQuestionOne = By.xpath("");

    By btnQuestionTwo = By.xpath("");

    By btnQuestionThree = By.xpath("");

    By btnQuestionFour = By.xpath("");

    By btnQuestionFive = By.xpath("");

    By btnQuestionSix = By.xpath("");



    //########################################ACTIONS############################################
    public void clickBtnStatementOfWork(){
        btnStatementOfWork.click();
    }

    public void setTxtShortJobSpec(String text){
        ldriver.findElement(txtShortJobSpec).sendKeys(text);
    }


    public void setTxtCurrency_menu(String currency_menu) throws Exception {
        Thread.sleep(3000);

        new WebDriverWait(ldriver, 20).until(ExpectedConditions.elementToBeClickable(txtCurrency)).click();
        //ldriver.findElement(txtJobTitle_menu).sendKeys(organisation);
    }

    public void clickCurrency_menuitem_firstOption() {
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

        clickCurrency_menuitem();
    }
    public void clickCurrency_menuitem() {
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


    public void setTxtProjectManager_menu(String projectManager_menu) throws Exception {
        Thread.sleep(3000);

        new WebDriverWait(ldriver, 20).until(ExpectedConditions.elementToBeClickable(txtProjectManager)).click();
        //ldriver.findElement(txtJobTitle_menu).sendKeys(organisation);
    }

    public void clickProjectManager_menuitem_firstOption() {
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

        clickCurrency_menuitem();
    }
    public void clickProjectManager_menuitem() {
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
