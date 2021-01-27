Feature: New Job - Statement of Work

  Scenario: Successful Login with Valid Credentials
    Given User launch Chrome browser
    When User opens URL "https://r2qa100.rsawsdev.com/"
    Then User clicks on Advanced
    And Clicks on link Proceed
    When User enters Username as "lungas"
    Then User enters Password as "LUpa$w0rd"
    And Click on SignIn button

    When User creates a New Job button
    Then Clicks on Statement Of Work button

    And User searches for Job Title as "Specialist"
    Then User clicks on Job Title

    When User enters Business Case "They keep your company running, store your data, keep your technology current."

    And User searches for Currency as "Australian Dollar"
    Then User clicks on Currency
    #When User select Job Type

    And User searches for Project Manager as "ATR Authoriser 2"
    Then User selects on Project Manager



    And User searches for Cost Code as "0011"
    When User selects Cost

    Then User searches for Corporate Structure as "London"
    When User select Corporate Structure

    And User searches for Location as "Crawley"
    Then User select Location

    When User searches for Choose Contact as "Specialist"
    And User Choose Contact

    And User searches for Skill Band as "Actuary"
    Then User select Skill Band

    When User searches for Skill Detail as "Surreal"
    And User select Skill Detail

    Then User searches for Reason as "Expansion"
    When User select Reason





    And User Selects Answer for Legal Question One

    Then User Selects Answer for Legal Question Two

    When User Selects Answer for Legal Question Three

    And User Selects Answer for Legal Question Four

    Then User Selects Answer for Legal Question Five

    When User Selects Answer for Legal Question Six



















