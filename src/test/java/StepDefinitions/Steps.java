package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.*;

import java.util.concurrent.TimeUnit;


public class Steps {

    public WebDriver driver;
    public CreateCandidatePage lp;
    public CandidatesAddMultiplePage ca;
    public CreateNewJobContractPage cnjc;
    public EmploymentHistoryPage ehp;
    public CreateNewJobPermanentPage cnjp;




    @Given("User launch Chrome browser")
    public void user_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/Chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        lp = new CreateCandidatePage(driver);
        ca = new CandidatesAddMultiplePage(driver);
        cnjc = new CreateNewJobContractPage(driver);
        ehp = new EmploymentHistoryPage(driver);
        cnjp = new CreateNewJobPermanentPage(driver);

    }

    @Given("User launch IE browser")
    public void user_launch_gecko_driver() {
        System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "//Drivers/iedriver.exe");
        driver = new FirefoxDriver();
        lp = new CreateCandidatePage(driver);
        ca = new CandidatesAddMultiplePage(driver);
        cnjc = new CreateNewJobContractPage(driver);
        ehp = new EmploymentHistoryPage(driver);
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

//    @Then("User Enters Nationality as {string}")
//    public void user_enters_nationality_as(String nation) {
//        lp.setTxtNationality(nation);
//    }
//
//    @Then("User selects Racial Group as {string}")
//    public void user_selects_racial_group_as(String race) {
//        lp.clickTxtRacialGroup(race);
//    }

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


    //#################################################CANDIDATE ADD MULTIPLE############################################

    @Then("User clicks on Add Multiple button")
    public void user_clicks_on_add_multiple_button() throws Exception{
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
    public void user_click_on_cv_resume_button() throws Exception {
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

    //##################################CREATE NEW JOB - CONTRACT##########################################

    @When("User clicks on New Job button")
    public void user_clicks_on_new_job_button() throws Exception {
        cnjc.clickBtnNewJob();
    }

    @Then("Clicks on Contract button")
    public void clicks_on_contract_button() {
        cnjc.clickBtnContractJob();
    }

    @When("User clicks on Overview button")
    public void user_clicks_on_overview_button() {
        cnjc.clickBtnOverview();
    }

    @Then("User searches for Job Title menu as {string}")
    public void user_searches_for_job_title_menu_as(String jobTitleName) throws Exception {
        cnjc.setTxtJobTitle_menu(jobTitleName);
    }

    @Then("User clicks on Job Title menu")
    public void user_clicks_on_job_title_menu() {
        cnjc.clickJobTitle_menuitem_firstOption();
    }

    @When("User selects Job Type")
    public void user_selects_job_type() throws Exception{
        cnjc.clickJobType_menuitem();
    }


    @When("User searches for Cost Code menu as {string}")
    public void user_searches_for_cost_code_menu_as(String costCode) throws Exception{
        cnjc.setTxtCostCode_menu(costCode);
    }

    @When("User selects Cost Code")
    public void user_selects_cost_code() {
        cnjc.clickCostCode_menuitem_firstOption();
    }

    @When("User searches for Corporate Structure menu as {string}")
    public void user_searches_for_corporate_structure_menu_as(String corporateStructure) throws Exception{
        cnjc.setTxtCorporateStructure_menu(corporateStructure);
    }

    @When("User selects Corporate Structure")
    public void user_selects_corporate_structure() {
        cnjc.clickCorporateStructure_menuitem_firstOption();
    }





    @When("User searches for Skill Band menu as {string}")
    public void user_searches_for_skill_band_menu_as(String skillBand) throws Exception {
        cnjc.setTxtSkillBand_menu(skillBand);
    }

    @When("User selects Skill Band")
    public void user_selects_skill_band() {
        cnjc.clickSkillBand_menuitem_firstOption();
    }

    @When("User searches for Skill Detail menu as {string}")
    public void user_searches_for_skill_detail_menu_as(String skillDetail) throws Exception{
        cnjc.setTxtSkillDetail_menu(skillDetail);
    }

    @When("User selects Skill Detail")
    public void user_selects_skill_detail() {
        cnjc.clickSkillDetail_menuitem_firstOption();
    }

    @Then("User searches for Reason menu as {string}")
    public void user_searches_for_reason_menu_as(String reason) throws Exception{
        cnjc.setTxtReason_menu(reason);
    }

    @When("User selects Reason")
    public void user_selects_reason() {
        cnjc.clickReason_menuitem_firstOption();
    }

    @Then("User searches for Location menu as {string}")
    public void user_searches_for_location_menu_as(String location) throws Exception{
        cnjc.setTxtLocation_menu(location);
    }

    @When("User selects Location")
    public void user_selects_location() {
        cnjc.clickLocation_menuitem_firstOption();
    }
    @Then("User searches for Choose Contact menu as {string}")
    public void user_searches_for_choose_contact_menu_as(String chooseContact) throws Exception{
        cnjc.setTxtChooseContact_menu(chooseContact);
    }

    @When("User Chooses Contact")
    public void user_chooses_contact() {
        cnjc.clickChooseContact_menuitem_firstOption();
    }

    @When("User selects IR35 Status")
    public void user_selects_ir35_status() {
        cnjc.clickBtnPayeOnly();
    }


    @When("User Enters Contract Length as {string}")
    public void user_enters_contract_length_as(String contractLength) {
        cnjc.setTxtContractLength(contractLength);
    }


    @When("User searches for Pay Code menu as {string}")
    public void user_searches_for_pay_code_menu_as(String payCode) throws Exception{
        cnjc.setTxtPayCode_menu(payCode);
    }

    @When("User selects Pay Code")
    public void user_selects_pay_code() {
        cnjc.clickPayCode_menuitem_firstOption();
    }

    @Then("User Enters Minimum Pay as {string}")
    public void user_enters_minimum_pay_as(String minimumPay) {
        cnjc.setTxtMinimumPay(minimumPay);
    }

    @Then("User Enters Maximum Pay {string}")
    public void user_enters_maximum_pay(String maximumPay) {
        cnjc.setTxtMaximumPay(maximumPay);
    }

    @When("User enter hours as {string}")
    public void user_enter_hours_as(String hours) {
        cnjc.setTxtHours(hours);
    }

    //##############################################CREATE NEW JOB - PERMANENT#########################



    @When("User creates a New Job button")
    public void user_creates_a_new_job_button() throws Exception{
        cnjp.clickBtnNewJob();
    }

    @Then("Clicks on Permanent button")
    public void clicks_on_permanent_button() {
        cnjp.clickBtnPermanentJob();
    }

    @Then("User searches for Job Title as {string}")
    public void user_searches_for_job_title_as(String jobTitleName) throws Exception{
        cnjp.setTxtJobTitle_menu(jobTitleName);
    }

    @Then("User clicks on Job Title")
    public void user_clicks_on_job_title() {
        cnjp.clickJobTitle_menuitem_firstOption();
    }

    @When("User select Job Type")
    public void user_select_job_type() {

    }

    @When("User searches for Cost Code as {string}")
    public void user_searches_for_cost_code_as(String costCode) throws Exception{
        cnjp.setTxtCostCode_menu(costCode);
    }

    @When("User selects Cost")
    public void user_selects_cost() {
        cnjp.clickCostCode_menuitem_firstOption();
    }

    @Then("User searches for Corporate Structure as {string}")
    public void user_searches_for_corporate_structure_as(String corporateStructure) throws Exception{
        cnjp.setTxtCorporateStructure_menu(corporateStructure);
    }

    @When("User select Corporate Structure")
    public void user_select_corporate_structure() {
        cnjp.clickCorporateStructure_menuitem_firstOption();
    }

    @When("User searches for Skill Band as {string}")
    public void user_searches_for_skill_band_as(String skillBand) throws Exception{
        cnjp.setTxtSkillBand_menu(skillBand);
    }

    @Then("User select Skill Band")
    public void user_select_skill_band() {
        cnjp.clickSkillBand_menuitem_firstOption();
    }

    @When("User searches for Skill Detail as {string}")
    public void user_searches_for_skill_detail_as(String skillDetail) throws Exception{
        cnjp.setTxtSkillDetail_menu(skillDetail);
    }

    @When("User select Skill Detail")
    public void user_select_skill_detail() {
        cnjp.clickSkillDetail_menuitem_firstOption();
    }

    @Then("User searches for Reason as {string}")
    public void user_searches_for_reason_as(String reason) throws Exception{
        cnjp.setTxtReason_menu(reason);
    }

    @When("User select Reason")
    public void user_select_reason() {
        cnjp.clickReason_menuitem_firstOption();
    }

    @When("User searches for Location as {string}")
    public void user_searches_for_location_as(String location) throws Exception{
        cnjp.setTxtLocation_menu(location);
    }

    @Then("User select Location")
    public void user_select_location() {
        cnjp.clickLocation_menuitem_firstOption();
    }

    @When("User searches for Choose Contact as {string}")
    public void user_searches_for_choose_contact_as(String chooseContact) throws Exception{
        cnjp.setTxtChooseContact_menu(chooseContact);
    }

    @When("User Choose Contact")
    public void user_choose_contact() {
        cnjp.clickChooseContact_menuitem_firstOption();
    }

    @When("User searches for Pay Code as {string}")
    public void user_searches_for_pay_code_as(String payCode) throws Exception{
        cnjp.setTxtPayCode_menu(payCode);
    }

    @When("User select Pay Code")
    public void user_select_pay_code() {
        cnjp.clickPayCode_menuitem_firstOption();
    }

    @Then("User Enter Minimum Pay as {string}")
    public void user_enter_minimum_pay_as(String minimumPay) {
        cnjp.setTxtMinimumPay(minimumPay);
    }

    @Then("User Enter Maximum Pay {string}")
    public void user_enter_maximum_pay(String maximumPay) {
        cnjp.setTxtMaximumPay(maximumPay);
    }

    @When("User enters Job Required Value as {string}")
    public void user_enters_job_required_value_as(String value) {
        cnjp.setTxtJobReqValue(value);
    }

    @When("User searches for a Line Manager as {string}")
    public void user_searches_for_a_line_manager_as(String lineManager) throws Exception{
        cnjp.setTxtLineManager_menu(lineManager);
    }

    @Then("Selects the Line Manager")
    public void selects_the_line_manager() {
        cnjp.clickLineManager_menuitem_firstOption();
    }




    //##############################################EMPLOYMENT HISTORY#################################

    @When("User clicks on Add Employment")
    public void user_clicks_on_add_employment() throws Exception{
        ehp.clickBtnAddEmployment();
    }

    @When("User enters Employer as {string}")
    public void user_enters_employer_as(String employer) {
        ehp.setTxtEmployer(employer);
    }

    @Then("User enters Job Tile as {string}")
    public void user_enters_job_tile_as(String jobTitle) {
        ehp.setTxtJobTitle(jobTitle);
    }

    @When("User enters responsibilities as {string}")
    public void user_enters_responsibilities_as(String responsibilities) {
        ehp.setTxtJobResponsibilities(responsibilities);
    }

    @When("User enters start date as {string}")
    public void user_enters_start_date_as(String startDate) {
        ehp.setTxtStartDate(startDate);
    }

    //#################################STATEMENT OF WORK##############################################






}
