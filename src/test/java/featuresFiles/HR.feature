Feature: Human Resources

  Background:
    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Navigate to Human Resources page

  Scenario: : Successfully creation of a Position Salary
    And Navigate to Position Salary
    When User create "My Position Salary"
    And Add data in it
    Then Success message should be displayed

  Scenario: : Successfully edit of a Position Salary
    And Navigate to Position Salary
    When User edit the position salary of "My Position Salary" to "Your Position Salary"
    Then Success message should be displayed

  Scenario: : Successfully deletion of a Position Salary
    And Navigate to Position Salary
    When User delete "Your Position Salary"
    Then Success message should be displayed

  Scenario: : Successfully creation of a Position
    And Navigate to Position
    When User create a position as "My Position" with code "myCode001"
    Then Success message should be displayed

  Scenario: : Successfully edit of a Position
    And Navigate to Position
    When User edit "My Position" to "Your Position"
    Then Success message should be displayed

  Scenario: : Successfully deletion of a Position
    And Navigate to Position
    When User delete "Your Position"
    Then Success message should be displayed