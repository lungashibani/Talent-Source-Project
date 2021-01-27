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


    @FindBy(id = "imagesrc")
    @CacheLookup
    WebElement btnImageSrc;

//    By btnImageSrc = By.id("imagesrc");


    //###########################################ACTIONS##############################

    public void clicksBtnImageSrc() throws Exception{
        Thread.sleep(5000);
        btnImageSrc.click();
    }


    public void fileUpload() throws Exception
    {

        Pattern fileNameInput = new Pattern("C:\\Users\\SHIBL\\Desktop\\Patterns\\FileNameInput.PNG");
        Pattern openButton = new Pattern("C:\\Users\\SHIBL\\Desktop\\Patterns\\openButton.PNG");

        Thread.sleep(5000);

        Screen screen = new Screen();
        screen.type(fileNameInput, "C:\\Users\\SHIBL\\Desktop\\Patterns\\openButton.PNG");
        screen.click(openButton);
    }
}
