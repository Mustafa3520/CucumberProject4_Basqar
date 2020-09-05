Feature: Education part

  Background:
    Given I navigate to basqar
    When I try to login using username and password
    Then I am logged in

  Scenario: Succesfully Created A Subject Category
    Given I navigate to "Subject Categories" screen
    When  I create a Subject Category
      |International Politics|
      |IR301                 |
    Then Verify the "successfully" message

  Scenario:Successfully Created A Subject
    Given I navigate to "Subjects" screen
    When I create a Subject
      |name|European Union|
      |code|EU101         |
    Then Verify the "successfully" message

  Scenario:Negative scenario to delete Subject Category
    Given I navigate to "Subject Categories" screen
    When I delete "International Politics"
    Then Verify the "can't be deleted" message

  Scenario:Positive scenario to delete Subject Category
    Given I navigate to "Subjects" screen
    When I delete "European Union"
    Then Verify the "successfully" message
    And Go Back to Study Categories
    When I delete "International Politics"
    Then Verify the "successfully" message