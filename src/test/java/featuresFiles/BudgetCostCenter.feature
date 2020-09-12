Feature: Budget Cost Center feature

  Background:
    Given I navigate to basqar
    When I try to login using username and password
    Then I am logged in

  Scenario: Succesfully Created A Cost Center
    Given I navigate to Cost Center screen
    When  I create a Cost Center name as "Bank"
    And   I add a code as the "mycode123"
    And I add Personal as a Type from dropdown menu
    And I choose first option as prefixes from dropdown menu
    And I click the save Button
    Then Verify the "successfully" message

  Scenario: Succesfully Edit A Cost Center
    Given I navigate to Cost Center screen
    When  I edit the Bank Cost Center name to "New Bank"
    And   I edit the mycode code to "myNewcode321"
    And I click the save Button
    Then Verify the "successfully" message

  Scenario: Succesfully Delete A Cost Center
    Given I navigate to Cost Center screen
    When  I delete the Cost Center
    Then Verify the "successfully" message
