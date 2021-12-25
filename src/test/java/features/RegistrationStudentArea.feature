Feature: Registration-Studen Area functionality
@smoke
  Scenario: Registration-Student Area
    Given User should be able to navigate to home Page
    When Registration should beclickable
    Then  Student first Sign-up should be clickable
    And Gaps in the Student Form tab should be filled
    Then Student last Sign-up should be clickable
    And The second time it should give a Registration error in the Student Registration


