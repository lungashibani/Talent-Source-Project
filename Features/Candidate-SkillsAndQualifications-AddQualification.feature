Feature: Add Qualification

  Scenario: Successful adds Qualificatione
    Given User launch Chrome browser
    When User opens URL "https://r2qa100.rsawsdev.com/People/Candidate/Speculative/3225974"
    Then User clicks on Advanced
    And Clicks on link Proceed
    When User enters Username as "lungas"
    Then User enters Password as "LUpa$w0rd"
    And Click on SignIn button

    When User clicks on Skills and Qualification
    Then User clicks on Add Qualification

    When User searches for an Institution menu as "Oxford University"
    And User selects an Institution

    Then User search for Degree menu as "Diploma"
    When User selects a Degree

    Then User search for Level menu as "2"
    When User selects a Level

    Then User search for Course Subject menu as "Pure and Applied Mathematics"
    When User selects a Course Subject