Feature: Add Vendor and Save Resume

  Scenario: Successful adds Vendor and saves Resume
    Given User launch Chrome browser
    When User opens URL "https://r2qa100.rsawsdev.com/People/Register%20Speculative%20CV/3225972"
    Then User clicks on Advanced
    And Clicks on link Proceed
    When User enters Username as "lungas"
    Then User enters Password as "LUpa$w0rd"
    And Click on SignIn button

    Then User clicks on Save to add Vendor menu as "text"

    When User searches for a Vendor menu as "Actuary"
    And User selects a Vendor

    Then User search for Source menu as "Surreal"
    When User selects Source

    And User selects the Save