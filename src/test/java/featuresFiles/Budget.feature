Feature: Budget feature

  Background:
    Given I navigate to basqar
    When I try to login using username and password
    Then I am logged in

  Scenario: Succesfully Created A Budget Groups
    Given I navigate to Budget Groups screen
    When  I create a Budget Groups name as "Total Expenses"
    And I add a start date as the choosen date
    And I add a finish date as the choosen date
    And I add a comment as a "Comment"
    And I click the save Button
    Then Verify the "successfully" message

  Scenario: Succesfully Edit A Budget Group
    Given I navigate to Budget Groups screen to edit
    When  I edit the Total Expenses Budget Group name to "Total Expenses1"
    And I edit a comment as a "Comment1"
    And I click the save Button
    Then Verify the "successfully" message

  Scenario: Succesfully Delete A Budget Group
    Given I navigate to Budget Groups screen
    When  I delete the Budget Group with name "Total Expenses1"
    Then Verify the "successfully" message
