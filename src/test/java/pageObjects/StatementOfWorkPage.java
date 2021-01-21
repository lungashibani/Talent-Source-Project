package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StatementOfWorkPage {
    public WebDriver ldriver;
    public WebDriverWait wait;


    public StatementOfWorkPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By txtShortJobSpec = By.xpath("//textarea[@ng-model='vm.job.ShortJobSpec']");

    By btnQuestionOne = By.xpath("");

    By btnQuestionTwo = By.xpath("");

    By btnQuestionThree = By.xpath("");

    By btnQuestionFour = By.xpath("");

    By btnQuestionFive = By.xpath("");

    By btnQuestionSix = By.xpath("");



    //########################################ACTIONS############################################

    public void setTxtShortJobSpec(String text){
        ldriver.findElement(txtShortJobSpec).sendKeys(text);
    }




}
