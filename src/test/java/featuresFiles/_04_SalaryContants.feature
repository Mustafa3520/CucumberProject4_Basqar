Feature: Login feature test

  Background:
    Given I navigate to basqar
    When I try to login using username and password
    Then I am logged in

  Scenario: Successful creating editing and deleting Salary Contants
     Given I navigate to "Salary Constants" screen in HR