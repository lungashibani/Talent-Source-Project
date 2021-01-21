package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Keys;
import org.sikuli.script.*;

import java.awt.*;
import java.awt.event.KeyEvent;



public class CreateCandidatePage {

    public WebDriver ldriver;

    public CreateCandidatePage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }


    @FindBy(xpath = "//button[@id='details-button']")
    @CacheLookup
    WebElement btnAdvanced;

    @FindBy(xpath = "//a[@id='proceed-link']")
    @CacheLookup
    WebElement lnkProceed;

    @FindBy(xpath = "//input[@id='username']")
    @CacheLookup
    WebElement txtUsername;

    @FindBy(xpath = "//input[@id='password']")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(xpath = "//button[@name='_eventId_proceed']")
    @CacheLookup
    WebElement btnLogin;

    @FindBy(xpath = "//i[@class='fa fa-plus']")
    @CacheLookup
    WebElement btnCandidate;

    @FindBy(xpath = "//input[@name='firstName']")
    @CacheLookup
    WebElement txtFirstName;

    @FindBy(xpath = "//input[@name='lastName']")
    @CacheLookup
    WebElement txtLastName;

    @FindBy(xpath = "//input[@value='M']")
    @CacheLookup
    WebElement rBtnGender;

    @FindBy(xpath = "//input[@id='dobDatePicker']")
    @CacheLookup
    WebElement txtDateOfBirth;

    @FindBy(xpath = "//input[@name='Email']")
    @CacheLookup
    WebElement txtEmail;

    @FindBy(xpath = "//input[@name='PrimaryPhoneNumber']")
    @CacheLookup
    WebElement txtHomePhone;

    @FindBy(xpath = "//input[@ng-model='vm.speculativeCV.CellPhone']")
    @CacheLookup
    WebElement txtMobilePhone;

    @FindBy(xpath = "//input[@name='CurrentSalary']")
    @CacheLookup
    WebElement txtCurrentSalary;


    By txtNationality = By.xpath("//input[@id='focusser-0']");

    By txtNationalityItem = By.xpath("//div[@class='ui-select-choices-group optgroup']//div//div");

    By txtRacialGroup = By.xpath("//input[@id='focusser-1']");

    By txtRacialGroupItem = By.xpath("//div[@class='ui-select-choices-group optgroup']//div//div");

    @FindBy(xpath = "//textarea")
    @CacheLookup
    WebElement txtComments;

    @FindBy(xpath = "//div[@data-filename='vm.cvResumeFilefilename']")
    @CacheLookup
    WebElement btnResume;

//    @FindBy(xpath = "//span[@class='ng-isolate-scope']//button")
//    @CacheLookup
//    WebElement btnSave;

    By btnSave = By.xpath("//span[@class='ng-isolate-scope']//button//i");



    //*********************************************************ACTIONS***************************************//


    public void clickBtnAdvanced() {
        btnAdvanced.click();
    }

    public void clickLnkProceed() {
        lnkProceed.click();
    }

    public void setTxtUsername(String uname) {
        txtUsername.clear();
        txtUsername.sendKeys(uname);
    }

    public void setTxtPassword(String pwd) {
        txtPassword.clear();
        txtPassword.sendKeys(pwd);
    }

    public void clickBtnLogin() {
        btnLogin.click();
    }

    public void clickBtnCandidate() {
        btnCandidate.click();
    }


    public void setTxtFirstName(String firstName) {
        txtFirstName.clear();
        txtFirstName.sendKeys(firstName);
    }

    public void setTxtLastName(String firstName) {
        txtLastName.clear();
        txtLastName.sendKeys(firstName);
    }

    public void clickRBtnGender() {
        rBtnGender.click();
    }


    public void setTxtDateOfBirth(String birthDate) {
        txtDateOfBirth.clear();
        txtDateOfBirth.sendKeys(birthDate);
    }

    public void setTxtEmail(String emailAddress) {
        txtEmail.clear();
        txtEmail.sendKeys(emailAddress);
    }

    public void setTxtHomePhone(String homePhone) {
        txtHomePhone.clear();
        txtHomePhone.sendKeys(homePhone);
    }

    public void setTxtMobilePhone(String mobilePhone) {
        txtMobilePhone.clear();
        txtMobilePhone.sendKeys(mobilePhone);
    }


    public void setTxtCurrentSalary(String currentSalary) {
        txtCurrentSalary.clear();
        txtCurrentSalary.sendKeys(currentSalary);
    }

    public void clickTxtNationality(String nationality) {
        ldriver.findElement(txtNationality).sendKeys(nationality, Keys.DOWN);
        ldriver.findElement(txtNationalityItem).click();
    }


    public void clickTxtRacialGroup(String racialGroup) {
        ldriver.findElement(txtRacialGroup).sendKeys(racialGroup, Keys.DOWN);
        ldriver.findElement(txtRacialGroupItem).click();
    }

    public void setTxtComments(String comments) {
        txtComments.clear();
        txtComments.sendKeys(comments);
    }



    public void clickBtnResume() throws Exception {
        btnResume.click();

    }

    public void txtFileInput() throws Exception {

        Pattern fileNameInput = new Pattern("C:\\Users\\SHIBL\\Desktop\\UploadResume\\FileNameInput.PNG");
        //Pattern openButton = new Pattern("C:\\Users\\SHIBL\\Desktop\\UploadResume\\Button.PNG");

        Thread.sleep(5000);

        Screen screen = new Screen();

        screen.type("Demo CV.docx");
        //screen.click(openButton);
        clickOpen();


    }

    public void clickOpen() {

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

    public void clickBtnSave() {
        ldriver.findElement(btnSave).click();
    }

//    public void clickBtnSave() {
//        btnSave.click();
//    }
}


