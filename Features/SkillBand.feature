Feature: Skill Band

  Scenario: Successful adds a Skill Band
    Given User launch Chrome browser
    When User opens URL "https://r2qa100.rsawsdev.com/People/Register%20Speculative%20CV/3225972"
    Then User clicks on Advanced
    And Clicks on link Proceed
    When User enters Username as "lungas"
    Then User enters Password as "LUpa$w0rd"
    And Click on SignIn button

    When User clicks on Add Skill Band as "text"

    And User search for Skill Band menu as "Actuary"
    Then User clicks on Skill Band

    When User search for Skill Detail menu as "Surreal"
    And User clicks on Skill Detail
    Then User clicks on the Save button