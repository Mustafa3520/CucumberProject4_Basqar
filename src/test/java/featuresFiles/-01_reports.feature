Feature: Login feature test

  Background:
    Given I navigate to basqar
    When I try to login using username and password
    Then I am logged in

  Scenario: Successful creating editing and deleting excel template
    Given I navigate to excel template screen
    When Create "testTechno9" excel template
    Then Edit "testTechnoEdited" excel template
    And Delete excel template

