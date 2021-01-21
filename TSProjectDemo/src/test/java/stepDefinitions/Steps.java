package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Screen;
import pageObjects.CreateCandidatePage;
import pageObjects.CandidatesAddMultiplePage;
import pageObjects.CreateNewJobContractPage;



import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;




public class Steps {

    public WebDriver driver;
    public CreateCandidatePage lp;
    public CandidatesAddMultiplePage ca;
    public CreateNewJobContractPage njc;



    @Given("User launch Chrome browser")
    public void user_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver/Chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        lp = new CreateCandidatePage(driver);
        ca = new CandidatesAddMultiplePage(driver);
        njc = new CreateNewJobContractPage(driver);

    }

    @Given("User launch IE browser")
    public void user_launch_gecko_driver() {
        System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "//Drivers/iedriver.exe");
        driver = new FirefoxDriver();
        lp = new CreateCandidatePage(driver);
        ca = new CandidatesAddMultiplePage(driver);
        njc = new CreateNewJobContractPage(driver);
    }

    @When("User opens URL {string}")
    public void user_opens_url(String url) {
        driver.get(url);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Then("User clicks on Advanced")
    public void user_clicks_on_advanced() {
        lp.clickBtnAdvanced();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    @Then("Clicks on link Proceed")
    public void clicks_on_link_proceed() {
        lp.clickLnkProceed();
    }

    @When("User enters Username as {string}")
    public void user_enters_username_as(String username) {
        lp.setTxtUsername(username);
    }

    @Then("User enters Password as {string}")
    public void user_enters_password_as(String password) {
        lp.setTxtPassword(password);
    }

    @Then("Click on SignIn button")
    public void click_on_sign_in_button() {
        lp.clickBtnLogin();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    @Then("User clicks on Candidate button")
    public void user_clicks_on_candidate_button() {
        lp.clickBtnCandidate();
    }

    @Then("User enters First Name as {string}")
    public void user_enters_first_name_as(String name) {
        lp.setTxtFirstName(name);
    }

    @Then("User enters Last Name as {string}")
    public void user_enters_last_name_as(String surname) {
        lp.setTxtLastName(surname);
    }

    @Then("User selects their Gender type")
    public void user_selects_their_gender_type() {
        lp.clickRBtnGender();
    }

    @Then("User enters Date Of Birth as {string}")
    public void user_enters_date_of_birth_as(String dateOfBirth) {
        lp.setTxtDateOfBirth(dateOfBirth);
    }

    @Then("User enters Email as {string}")
    public void user_enters_email_as(String email) {
        lp.setTxtEmail(email);
    }

    @Then("User enters Home Phone {string}")
    public void user_enters_home_phone(String homeNumber) {
        lp.setTxtHomePhone(homeNumber);
    }

    @Then("User enters Mobile Phone {string}")
    public void user_enters_mobile_phone(String mobileNumber) {
        lp.setTxtMobilePhone(mobileNumber);
    }


    @Then("User enters Current Salary as {string}")
    public void user_enters_current_salary_as(String salary) {
        lp.setTxtCurrentSalary(salary);
    }

    @Then("User Enters Nationality as {string}")
    public void user_enters_nationality_as(String nation) {
        lp.clickTxtNationality(nation);
    }

    @Then("User selects Racial Group as {string}")
    public void user_selects_racial_group_as(String race) {
        lp.clickTxtRacialGroup(race);
    }

    @Then("User types in Comments as {string}")
    public void user_types_in_comments_as(String textComments) {
        lp.setTxtComments(textComments);
    }

    @Then("User clicks on Resume button")
    public void user_clicks_on_cv_resume_button() throws Exception {
        lp.clickBtnResume();
    }

    @Then("User types in File input")
    public void user_types_in_file_input() throws Exception {
        lp.txtFileInput();
    }

    @Then("User clicks on Save button")
    public void user_clicks_on_save_button() {
        lp.clickBtnSave();
    }

    //#################################################CREATE CANDIDATE ADD MULTIPLE##############################



    //################################################CANDIDATE ADD MULTIPLE#####################################

    @Then("User clicks on Add Multiple button")
    public void user_clicks_on_add_multiple_button() {
        ca.clickAddMultiple();
    }

    @Then("User enter First Name as {string}")
    public void user_enter_first_name_as(String fname) {
        ca.setTxtFName(fname);
    }

    @Then("User enter Last Name as {string}")
    public void user_enter_last_name_as(String surname) {
        ca.setTxtLName(surname);
    }

    @Then("User click on Resume button")
    public void user_click_on_cv_resume_button(){
        ca.clickBtnResumeCv();
    }

    @Then("User type in File input")
    public void user_type_in_file_input() throws Exception {
        ca.fileUploads();
    }
    @Then("User Adds another Candidate")
    public void user_adds_another_candidate() throws Exception {
        ca.clickBtnAdd();
    }

    @Then("User click on Save button")
    public void user_click_on_save_button() {
        ca.clicksBtnSave();
    }


    //##################################CREATE NEW JOB - CONTRACT############################################

    @When("User clicks on New Job button")
    public void user_clicks_on_new_job_button() {
        njc.clickBtnNewJob();
    }

    @Then("Clicks on Contract button")
    public void clicks_on_contract_button() {
        njc.clickBtnContract();
    }

    @Then("Enters Job Title as {string}")
    public void enters_job_title_as(String jobTitleName) {
        njc.setTxtJobTitle(jobTitleName);
    }




}
