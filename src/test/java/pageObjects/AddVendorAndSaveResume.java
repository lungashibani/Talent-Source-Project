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

public class AddVendorAndSaveResume {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public AddVendorAndSaveResume(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver, 10);
    }

    By btnSave = By.xpath("//button[@ng-click='vm.save()']");

    By txtVendor_menu= By.xpath("//div[@ng-model='returnObj.Vendor']");

    By txtSource_menu= By.xpath("//div[@ng-model='returnObj.Source']");


    @FindBy(xpath = "//button[@data-ng-disabled='!vm.canSave()']")
    @CacheLookup
    WebElement btnSaves;

//####################################################ACTIONS################################################

    public void click(WebElement element) {
        //https://code.google.com/p/selenium/issues/detail?id=2766 (fix)
        while(true){
            try{
                element.click();
                break;
            }catch (Throwable e){
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }

    public void click(String css) {
        //https://code.google.com/p/selenium/issues/detail?id=2766 (fix)
        while(true){
            try{
                ldriver.findElement(btnSave).click();
                break;
            }catch (Throwable e){
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }
    //###################################################

    public void setTxtVendor_menu(String vendor_menu) throws Exception {
        Thread.sleep(3000);

        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);

        ldriver.findElement(txtVendor_menu).click();

    }

    public void clickVendor_menuitem_firstOption() {
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

        clickVendor_menuitem();
    }
    public void clickVendor_menuitem() {
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



    public void setTxtSource_menu(String source_menu) throws Exception {
        Thread.sleep(3000);

        new WebDriverWait(ldriver, 20).until(ExpectedConditions.elementToBeClickable(txtSource_menu)).click();
        //ldriver.findElement(txtJobTitle_menu).sendKeys(organisation);
    }

    public void clickSource_menuitem_firstOption() {
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

        clickSource_menuitem();
    }
    public void clickSource_menuitem() {
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





    public void clickBtnSave(){
        btnSaves.click();
    }
}
