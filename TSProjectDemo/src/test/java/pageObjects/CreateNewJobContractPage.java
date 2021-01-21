package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateNewJobContractPage {
    public WebDriver ldriver;

    public CreateNewJobContractPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//a[@class='btn btn-primary pull-left ng-scope']//span[@data-i18n='resource.newJob']")
    @CacheLookup
    WebElement btnNewJob;

    @FindBy(xpath = "//div[@class='row ']//a[@href='Jobs/Temporary/New']")
    @CacheLookup
    WebElement btnContract;

    By txtJobTitle = By.xpath("//div[@class='ui-select-match ng-scope ng-hide']//span");

    By txtJobTitleItem = By.xpath("//div[@class='ui-select-choices ui-select-dropdown selectize-dropdown ng-scope single']//div//div//div//div");
    //###########################################ACTIONS#####################################################

    public void clickBtnContract() {
        btnContract.click();
    }

    public void clickBtnNewJob(){
        btnNewJob.click();
    }

    public void setTxtJobTitle(String jobTitle) {
        WebDriverWait wait2 = new WebDriverWait(ldriver, 10);
        wait2.until(ExpectedConditions.invisibilityOfElementLocated(txtJobTitle));
        ldriver.findElement(txtJobTitle).sendKeys(jobTitle, Keys.DOWN);
        ldriver.findElement(txtJobTitleItem).click();
    }

}
