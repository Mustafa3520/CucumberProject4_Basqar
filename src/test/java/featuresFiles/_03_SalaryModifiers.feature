Feature: Login feature test

  Background:
    Given I navigate to basqar
    When I try to login using username and password
    Then I am logged in

  Scenario: Successful creating  Salary Modifiers
    Given I navigate to "Salary Modifiers" screen in HR
    When I create salary Modifiers following fields
      | Description      | Salary Modifier     |
      | Variable         | My  Salary Modifier |
      | Modifier Type    | Addition            |
      | Integration Code | 439                  |
      | Value  Type      | Fixed Value         |
      | Priority         | 1                   |
      | Amount           | 30                  |
