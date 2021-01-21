package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmploymentHistoryPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public EmploymentHistoryPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver, 10);
    }

    By btnAddEmployment = By.xpath("//button[@ng-click='vm.addEditEmployment()']");

    @FindBy(xpath = "//input[@ng-model='vm.currentEmployment.EmployerName']")
    @CacheLookup
    WebElement txtEmployer;

    @FindBy(xpath = "//input[@ng-model='vm.currentEmployment.JobTitle']")
    @CacheLookup
    WebElement txtJobTitle;

    @FindBy(xpath = "//textarea[@name='jobResponsibilities']")
    @CacheLookup
    WebElement txtJobResponsibilities;

    @FindBy(xpath = "//input[@ng-model='vm.currentEmployment.JobStartDate']")
    @CacheLookup
    WebElement txtStartDate;

    //#########################################ACTIONS##################################################

    public void clickBtnAddEmployment() throws Exception{
        Thread.sleep(3000);

        new WebDriverWait(ldriver, 10).until(ExpectedConditions.elementToBeClickable(btnAddEmployment)).click();

        WebElement ele = ldriver.findElement(btnAddEmployment);
        ele.click();
    }

    public void setTxtEmployer(String employer) {
        txtEmployer.clear();
        txtEmployer.sendKeys(employer);
    }

    public void setTxtJobTitle(String jobTitle) {
        txtJobTitle.clear();
        txtJobTitle.sendKeys(jobTitle);
    }

    public void setTxtJobResponsibilities(String responsibilities) {
        txtJobResponsibilities.clear();
        txtJobResponsibilities.sendKeys(responsibilities);
    }

    public void setTxtStartDate(String startDate) {
        txtStartDate.clear();
        txtStartDate.sendKeys(startDate);
    }
}
