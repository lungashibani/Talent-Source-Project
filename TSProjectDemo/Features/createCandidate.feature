Feature: createCandidate

  Scenario: Successful Login with Valid Credentials
    Given User launch Chrome browser
    When User opens URL "https://r2qa100.rsawsdev.com/"
    Then User clicks on Advanced
    And Clicks on link Proceed
    When User enters Username as "lungas"
    Then User enters Password as "LUpa$w0rd"
    And Click on SignIn button
    Then User clicks on Candidate button
    And User enters First Name as "DemoName"
    Then User enters Last Name as "DemoSurname"
    And User selects their Gender type
    When User enters Date Of Birth as "1994/2/23"
    Then User enters Email as "lu@gmail.com"
    And User enters Home Phone "0112341234"
    And User enters Mobile Phone "0711234567"
    Then User enters Current Salary as "5000.00"
    And User Enters Nationality as "A"
    When User selects Racial Group as "B"
    Then User types in Comments as "This was an interesting test"
    And User clicks on Resume button
    And User types in File input
    Then User clicks on Save button





