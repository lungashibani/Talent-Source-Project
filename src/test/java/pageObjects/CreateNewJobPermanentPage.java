package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;


public class CreateNewJobPermanentPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public CreateNewJobPermanentPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver, 10);
    }

    By btnNewJob = By.xpath("//a[@type='button']");

//    @FindBy(xpath = "//a[@type='button']")
//    @CacheLookup
//    WebElement btnNewJob;

    @FindBy(xpath = "//div[@class='col-lg-12 margin-bottom15']//a[1]")
    @CacheLookup
    WebElement btnPermanentJob;



    @FindBy(xpath = "//i[@class='far fa-plus-square ng-scope']")
    @CacheLookup
    WebElement btnOverview;

    By txtJobTitle_menu = By.xpath("//div[@ng-model='vm.job.JobName']");

    //By txtOrganisation_menuitem = By.xpath("//*[@value='Second']");
    By txtJobTitle_menuitem = By.className("MuiAutocomplete-popper");




    //By btnJobType = By.cssSelector(".ng-binding[value='4']");








    By txtCostCode_menu = By.xpath("//div[@ng-model='vm.job.CostCode']");

    By txtCorporateStructure_menu = By.xpath("//div[@ng-model='vm.job.CorporateStructure']");

    By txtSkillBand_menu= By.xpath("//div[@ng-model='vm.job.SkillBand']");

    By txtSkillDetail_menu= By.xpath("//div[@ng-model='vm.job.SkillDetail']");

    By txtReason_menu= By.xpath("//div[@ng-model='vm.job.JobReason']");

    By txtLocation_menu= By.xpath("//div[@ng-model='vm.job.JobLocation']");

    By txtChooseContact_menu= By.xpath("//div[@ng-model='vm.job.RSStaff']");


    By txtPayCode_menu= By.xpath("//div[@ng-model='vm.job.PayCode']");


    @FindBy(xpath = "//input[@ng-model='vm.job.PayMinimum']")
    @CacheLookup
    WebElement txtMinimumPay;

    @FindBy(xpath = "//input[@ng-model='vm.job.PayMaximum']")
    @CacheLookup
    WebElement txtMaximumPay;

    By txtJobReqValue = By.xpath("//input[@ng-model='vm.job.JobReqValue']");

    By txtLineManager_menu= By.xpath("//input[@style='width: 564px;']");





    //#######################################ACTIONS#############################################

    public void clickBtnNewJob()throws Exception {
        Thread.sleep(3000);
        WebElement ele = ldriver.findElement(btnNewJob);
        ele.click();
    }

    public void clickBtnPermanentJob() {
        btnPermanentJob.click();
    }

//    public void clickBtnOverview() {
//        btnOverview.click();
//    }


//    public void setTxtJobTitle(String firstName) {
//        txtJobTitle.clear();
//        txtJobTitle.sendKeys(firstName);
//    }

    public void setTxtJobTitle_menu(String organisation) throws Exception {
        Thread.sleep(3000);

        new WebDriverWait(ldriver, 20).until(ExpectedConditions.elementToBeClickable(txtJobTitle_menu)).click();
        //ldriver.findElement(txtJobTitle_menu).sendKeys(organisation);
    }

    public void clickJobTitle_menuitem_firstOption() {
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

        clickJobTitle_menuitem();
    }
    public void clickJobTitle_menuitem() {
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





    //    public void clickBtnJobType() throws Exception{
//
//        new WebDriverWait(ldriver, 20);
//        ldriver.findElement(btnJobType).click();
//
//        //btnJobType.click();
//    }
    public void clickJobType_menuitem() {
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        By btnJobType_menuitem = By.xpath("//div[@class='radio ng-scope']//label//input[@value='6']");
        ldriver.findElement(btnJobType_menuitem);
        JavascriptExecutor executor = (JavascriptExecutor)ldriver;
        executor.executeScript(String.valueOf(btnJobType_menuitem));
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













    public void setTxtCostCode_menu(String costCode_menu) throws Exception {
        Thread.sleep(3000);

        new WebDriverWait(ldriver, 20).until(ExpectedConditions.elementToBeClickable(txtCostCode_menu)).click();
        //ldriver.findElement(txtJobTitle_menu).sendKeys(organisation);
    }

    public void clickCostCode_menuitem_firstOption() {
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

        clickCostCode_menuitem();
    }
    public void clickCostCode_menuitem() {
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




    public void setTxtCorporateStructure_menu(String costCode_menu) throws Exception {
        Thread.sleep(3000);

        new WebDriverWait(ldriver, 20).until(ExpectedConditions.elementToBeClickable(txtCorporateStructure_menu)).click();
        //ldriver.findElement(txtJobTitle_menu).sendKeys(organisation);
    }

    public void clickCorporateStructure_menuitem_firstOption() {
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

        clickCorporateStructure_menuitem();
    }
    public void clickCorporateStructure_menuitem() {
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





    public void setTxtSkillBand_menu(String costCode_menu) throws Exception {
        Thread.sleep(3000);

        new WebDriverWait(ldriver, 20).until(ExpectedConditions.elementToBeClickable(txtSkillBand_menu)).click();
        //ldriver.findElement(txtJobTitle_menu).sendKeys(organisation);
    }

    public void clickSkillBand_menuitem_firstOption() {
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

        clickSkillBand_menuitem();
    }
    public void clickSkillBand_menuitem() {
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



    public void setTxtSkillDetail_menu(String costCode_menu) throws Exception {
        Thread.sleep(3000);

        new WebDriverWait(ldriver, 20).until(ExpectedConditions.elementToBeClickable(txtSkillDetail_menu)).click();
        //ldriver.findElement(txtJobTitle_menu).sendKeys(organisation);
    }

    public void clickSkillDetail_menuitem_firstOption() {
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

        clickSkillDetail_menuitem();
    }
    public void clickSkillDetail_menuitem() {
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


    public void setTxtReason_menu(String costCode_menu) throws Exception {
        Thread.sleep(3000);

        new WebDriverWait(ldriver, 20).until(ExpectedConditions.elementToBeClickable(txtReason_menu)).click();
        //ldriver.findElement(txtJobTitle_menu).sendKeys(organisation);
    }

    public void clickReason_menuitem_firstOption() {
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

        clickReason_menuitem();
    }
    public void clickReason_menuitem() {
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



    public void setTxtLocation_menu(String costCode_menu) throws Exception {
        Thread.sleep(3000);

        new WebDriverWait(ldriver, 20).until(ExpectedConditions.elementToBeClickable(txtLocation_menu)).click();
        //ldriver.findElement(txtJobTitle_menu).sendKeys(organisation);
    }

    public void clickLocation_menuitem_firstOption() {
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

        clickCostCode_menuitem();
    }
    public void clickLocation_menuitem() {
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


    public void setTxtChooseContact_menu(String costCode_menu) throws Exception {
        Thread.sleep(3000);

        new WebDriverWait(ldriver, 20).until(ExpectedConditions.elementToBeClickable(txtChooseContact_menu)).click();
        //ldriver.findElement(txtJobTitle_menu).sendKeys(organisation);
    }

    public void clickChooseContact_menuitem_firstOption() {
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

        clickCostCode_menuitem();
    }
    public void clickChooseContact_menuitem() {
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

    public void setTxtPayCode_menu(String costCode_menu) throws Exception {
        Thread.sleep(3000);

        new WebDriverWait(ldriver, 20).until(ExpectedConditions.elementToBeClickable(txtPayCode_menu)).click();
        //ldriver.findElement(txtJobTitle_menu).sendKeys(organisation);
    }

    public void clickPayCode_menuitem_firstOption() {
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

        clickCostCode_menuitem();
    }
    public void clickPayCode_menuitem() {
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

    public void setTxtMinimumPay(String minPay) {
        txtMinimumPay.clear();
        txtMinimumPay.sendKeys(minPay);
    }

    public void setTxtMaximumPay(String maxPay) {
        txtMaximumPay.clear();
        txtMaximumPay.sendKeys(maxPay);
    }

    public void setTxtJobReqValue(String reqValue) {
        ldriver.findElement(txtJobReqValue).clear();
        ldriver.findElement(txtJobReqValue).sendKeys(reqValue);
    }





    public void setTxtLineManager_menu(String costCode_menu) throws Exception {
        Thread.sleep(3000);

        ldriver.findElement(txtLineManager_menu).sendKeys(costCode_menu);
        //new WebDriverWait(ldriver, 20).until(ExpectedConditions.elementToBeClickable(txtLineManager_menu)).click();
        //ldriver.findElement(txtJobTitle_menu).sendKeys(organisation);
    }

    public void clickLineManager_menuitem_firstOption() {
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

        clickCostCode_menuitem();
    }
    public void clickLineManager_menuitem() {
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
