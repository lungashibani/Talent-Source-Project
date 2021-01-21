Feature: Create New Job - Contract

  Scenario: Successful Login with Valid Credentials
    Given User launch Chrome browser
    When User opens URL "https://r2qa100.rsawsdev.com/"
    Then User clicks on Advanced
    And Clicks on link Proceed
    When User enters Username as "lungas"
    Then User enters Password as "LUpa$w0rd"
    And Click on SignIn button
    When User clicks on New Job button
    Then Clicks on Contract button
    And Enters Job Title as "A"
#    Then Selects Job Title item
#    And User selects their job title Type
#    When Clicks on Cost Code dropdown
#    Then Selects Cost Code item
#    When Clicks on Corporate Structure dropdown
#    Then Selects Corporate Structure item
#    And Clicks on Skill Band dropdown
#    Then Selects Skill Band item
#    When Clicks on Skill Detail dropdown
#    Then Selects Skill Detail item
#    And Clicks on Reason dropdown
#    Then Selects Reason item
#    And Clicks on Location dropdown
#    Then Selects Location item
#    And Clicks on Location dropdown
#    Then Selects Location item