Feature: createCandidate - Add Multiple

  Scenario: Successful Login with Valid Credentials
    Given User launch Chrome browser
    When User opens URL "https://r2qa100.rsawsdev.com/"
    Then User clicks on Advanced
    And Clicks on link Proceed
    When User enters Username as "lungas"
    Then User enters Password as "LUpa$w0rd"
    And Click on SignIn button
    Then User clicks on Candidate button
    And User clicks on Add Multiple button
    When User enter First Name as "DemoName2"
    Then User enter Last Name as "DemoSurname2"
    And User click on Resume button
    When User type in File input
    Then User Adds another Candidate
    And User click on Save button