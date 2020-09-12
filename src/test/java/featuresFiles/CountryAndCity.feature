Feature: Login feature test

  Background:
    Given I navigate to basqar
    When I try to login using username and password
    Then I am logged in

  Scenario: Successful country creating in basqar
    Given I navigate to "country" screen
    And "Liechtenstein" entity doesn't exist in table
    When I create "Liechtenstein" country

  Scenario: Successful city creating in basqar
    Given I navigate to "city" screen
    When I create "Vaduz" city of "Liechtenstein"

  Scenario: Successful city and country deleting in basqar
    Given I navigate to "country" screen
    When I delete "Liechtenstein" country
    Given I navigate to new "city" screen
    Then I delete "Vaduz" city
    Given I navigate to new "country" screen
    When I delete "Liechtenstein" country



