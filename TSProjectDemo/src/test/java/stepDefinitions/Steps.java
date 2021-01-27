package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Screen;
import pageObjects.CandidatesAddMultiplePage;




import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;




public class Steps {
    public WebDriver driver;
    public CandidatesAddMultiplePage ca;



    @Given("User launch Chrome browser")
    public void user_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver/Chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        ca = new CandidatesAddMultiplePage(driver);


    }


    @When("User opens URL {string}")
    public void user_opens_url(String url) {
        driver.get(url);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Then("User clicks on Image Source")
    public void user_clicks_on_image_source() throws Exception{
        ca.clicksBtnImageSrc();
    }

    @Then("User clicks on Add File Upload")
    public void user_clicks_on_add_file_upload() throws Exception{
        ca.fileUpload();
    }
}
