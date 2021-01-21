Feature: Create New Job - Permanent

  Scenario: Successful Login with Valid Credentials
    Given User launch Chrome browser
    When User opens URL "https://r2qa100.rsawsdev.com/"
    Then User clicks on Advanced
    And Clicks on link Proceed
    When User enters Username as "lungas"
    Then User enters Password as "LUpa$w0rd"
    And Click on SignIn button
    When User clicks on New Job button
    Then Clicks on Permanent button
    And Clicks on Job Title dropdown
    Then Selects Job Title item
    And User selects their job title Type
    When Clicks on Cost Code dropdown
    Then Selects Cost Code item
    When Clicks on Corporate Structure dropdown
    Then Selects Corporate Structure item
    And Clicks on Skill Band dropdown
    Then Selects Skill Band item
    When Clicks on Skill Detail dropdown
    Then Selects Skill Detail item
    And Clicks on Reason dropdown
    Then Selects Reason item
    And Clicks on Location dropdown
    Then Selects Location item
    And Clicks on Location dropdown
    Then Selects Location item
    When User enters the Number of Open Positions as {string}
    And Clicks on Choose Contact dropdown
    Then Selects Choose Contact item
    And Clicks on Office Location dropdown
    Then Selects Office Location item
    When Clicks on Office Location dropdown
    Then Selects Office Location item
    And Clicks on Start Date
    Then Selects Start Date
    When User Clicks on ASAP radio button
    And Clicks on Pay Code dropdown
    Then Selects Pay Code item
    When User enters the Maximum Charge as {string}
    And User enters the Minimum Charge as {string}
    Then User enters the Pay Guide as {string}
    And Clicks on Currency dropdown
    Then Selects Currency item
    When User enters the Minimum Pay as {string}
    Then User enters the Maximum Pay as {string}
    And User clicks on Choose File under Job Description
    Then User enters a Job Summary as {string}
    When User enters a Qualification Summary as {string}
    And User enters a Key Responsibilities as {string}
    Then User enters a Candidate Summary as {string}
    When User enters a Comments as {string}
    And User enters a Job Reference as {string}
    Then User enters a Job Requisition Value as {string}
    When User enters a Hours as {string}
    And User enters a Activity Code 2 Test as {string}
    Then User enters a Test String 3 as {string}
    When User enters a Test Float as {string}
    And User enters a Test Number as {string}
    Then User clicks on radio button YES under Test Boolean
    And User enters a Test String as {string}
    When User Clicks on Test Date
    Then Selects Test Date
    And User clicks on Select Line Manager
    Then User Select Line Manager
    When User Clicks on Request Approval
    And User clicks on Submit To Hiring Manager for Approval





















