Feature: Login feature test

#3) These are the features which you need to work on.
#
#    3.1)    Create a county Delete a country [DONE]
#    3.2)    Create a city Delete a city
#    3.3)    Create a country (name is SOMECOUNTRY )and create a city (choose a SOMECOUNTRY from the country dropdown.) . Remove
#        country and city. First try to remove country you should be able to see error message.
#            After adding city for country should not be deleted. Test this scenario as well.

  Background:
    Given I navigate to basqar
    When I try to login using username and password
    Then I am logged in

  Scenario: Successful country creating and deleting in basqar
    Given I navigate to "country" screen
    And "Liechtenstein" entity doesn't exist in table
    When I create "Liechtenstein" country

  Scenario: Successful city creating and deleting in basqar
    Given I navigate to new "city" screen
    When I create "Vaduz" city of "Liechtenstein"
    Then I delete "Vaduz" city

