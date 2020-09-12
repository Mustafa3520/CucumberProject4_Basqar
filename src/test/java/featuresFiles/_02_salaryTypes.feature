Feature: Login feature test

  Background:
    Given I navigate to basqar
    When I try to login using username and password
    Then I am logged in

  Scenario: Successful creating editing and deleting Salary Types
    Given I navigate to "Salary Types" screen in HR
    When Create "salaryTypesName" Salary Types
    Then Edit "editedSalaryTypes" Salary Types
    And Delete Salary Types

