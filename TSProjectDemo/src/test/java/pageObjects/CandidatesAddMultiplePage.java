package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import java.awt.*;
import java.awt.event.KeyEvent;

public class CandidatesAddMultiplePage {

    public WebDriver ldriver;

    public CandidatesAddMultiplePage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }


//    @FindBy(xpath = "//ul[@class='compact-tabs nav nav-tabs hidden-xs ']//li[2]")
//    @CacheLookup
//    WebElement addMultiple;

    By addMultiple =By.xpath("//li[@ng-click=\"vm.selectedTab = 'addMultiple'\"]");

    @FindBy(xpath = "//input[@name='firstName']")
    @CacheLookup
    WebElement txtFirstName;

    @FindBy(xpath = "//input[@name='lastName']")
    @CacheLookup
    WebElement txtLastName;

    @FindBy(xpath = "//div[@class='pull-left ng-isolate-scope']")
    @CacheLookup
    WebElement btnResume;


    @FindBy(xpath = "//button[@class='btn btn-primary']")
    @CacheLookup
    WebElement btnAdd;

    By btnSave = By.xpath("//span[@class='ng-isolate-scope']");


    //############################################ACTIONS##############################################

    public void clickAddMultiple() {
        ldriver.findElement(addMultiple).click();
    }

    public void setTxtFName(String firstName) {
        txtFirstName.clear();
        txtFirstName.sendKeys(firstName);
    }

    public void setTxtLName(String firstName) {
        txtLastName.clear();
        txtLastName.sendKeys(firstName);
    }

    public void clickBtnResumeCv() {
        btnResume.click();
    }

    public void clickBtnAdd() throws Exception {
        btnAdd.click();
    }

    public void fileUploads() throws Exception
    {
        //Thread.sleep(5000);

        Pattern fileNameInput = new Pattern("C:\\Users\\SHIBL\\Desktop\\UploadResume\\FileNameInput.PNG");
        Pattern openButton = new Pattern("C:\\Users\\SHIBL\\Desktop\\UploadResume\\OpenButton.PNG");

        Screen screen = new Screen();
        screen.type(fileNameInput, "Demo CV.docx");
        screen.click(openButton);

        clicksOpen();
    }

    public void clicksOpen() {

        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }

    public void clicksBtnSave() {
        ldriver.findElement(btnSave).click();
    }


}
