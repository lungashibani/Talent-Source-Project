Feature: EmploymentHistory

  Scenario: Successful records employment history
    Given User launch Chrome browser
    When User opens URL "https://r2qa100.rsawsdev.com/People/Register%20Speculative%20CV/3225972"
    Then User clicks on Advanced
    And Clicks on link Proceed
    When User enters Username as "lungas"
    Then User enters Password as "LUpa$w0rd"
    And Click on SignIn button
#    Then User clicks on Candidate button
    When User clicks on Add Employment
    And User enters Employer as "BMW"
    Then User enters Job Tile as "Cleaner"
    When User enters responsibilities as "Clean, dusting, sweeping, vacuuming, mopping, cleaning ceiling vents, restroom cleaning etc"
    And User enters start date as "20-02-2021"