Feature: Registration-Supervisor  functionality
  @smoke
  Scenario: Registration-Supervisor
   Given User should be able to navigate to home Page
  When Registration should be clickable
  Then Supervisor first Sign-up should be clickable
  And Gaps in the Form tab should be filled
   Then Supervisor last Sign-up should be clickable
   And The second time it should give a Registration error in the Supervisor Registration

