package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import java.awt.*;
import java.awt.event.KeyEvent;

public class CandidatesAddMultiplePage {

    public WebDriver ldriver;
    public WebDriverWait wait;

    public CandidatesAddMultiplePage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }


    @FindBy(xpath = "//div[@class='container-fluid margin-botom ng-scope']//ul//li[2]")
    @CacheLookup
    WebElement addMultiple;

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

    public void clickAddMultiple() throws Exception {
        addMultiple.click();
    }

    public void setTxtFName(String firstName) {
        txtFirstName.clear();
        txtFirstName.sendKeys(firstName);
    }

    public void setTxtLName(String firstName) {
        txtLastName.clear();
        txtLastName.sendKeys(firstName);
    }

    public void clickBtnResumeCv() throws Exception {
        btnResume.click();
    }



    public void fileUploads() throws Exception
    {
//        Pattern fileNameInput = new Pattern("C:\\Users\\SHIBL\\Desktop\\UploadResume" + "FileNameInput.PNG");
//        Pattern openButton = new Pattern("C:\\Users\\SHIBL\\Desktop\\UploadResume" + "OpenButton.PNG");
//
//        System.out.println(ImagePath.getBundlePath()); // print current bundlePath
//        ImagePath.setBundlePath("src/main/resources/images"); // set custom bundlePath
//
//        System.out.println(ImagePath.getBundlePath()); // print new bundlePath
//
//        Screen screen = new Screen();
//        screen.setAutoWaitTimeout(3);
//        screen.type(fileNameInput, "Demo CV.docx");
//        //screen.click(openButton);
//        clicksOpen();
        Thread.sleep(5000);

        Pattern fileNameInput = new Pattern("C:\\Users\\SHIBL\\Desktop\\Patterns\\FileNameInput.PNG");
        Pattern openButton = new Pattern("C:\\Users\\SHIBL\\Desktop\\Patterns\\openButton.PNG");

        Screen screen = new Screen();
        ImagePath.setBundlePath("fullpath");
        screen.type(fileNameInput, "C:\\Users\\SHIBL\\Desktop\\Presentation.odt");
        System.out.println(ImagePath.getBundlePath());
//        screen.click(openButton);

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

    public void clickBtnAdd() throws Exception {
        btnAdd.click();
    }

    public void clicksBtnSave() {
        ldriver.findElement(btnSave).click();
    }



}
