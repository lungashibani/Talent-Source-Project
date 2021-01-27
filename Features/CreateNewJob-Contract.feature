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
    And User searches for Job Title menu as "Accountant"
    Then User clicks on Job Title menu

    #When User selects Job Type



    And User searches for Cost Code menu as "0011"
    When User selects Cost Code

    Then User searches for Corporate Structure menu as "Geneva"
    When User selects Corporate Structure

    And User searches for Skill Band menu as "Accountant"
    Then User selects Skill Band

    When User searches for Skill Detail menu as "Accountant"
    And User selects Skill Detail

    Then User searches for Reason menu as "Accountant"
    When User selects Reason

    And User searches for Location menu as "Accountant"
    Then User selects Location

    When User searches for Choose Contact menu as "Accountant"
    And User Chooses Contact

    When User selects IR35 Status

    Then User Enters Contract Length as "26"

    And User searches for Pay Code menu as "Monthly Paid"
    When User selects Pay Code

    Then User Enters Minimum Pay as "300"
    And User Enters Maximum Pay "350"

    When User enter hours as "40"








