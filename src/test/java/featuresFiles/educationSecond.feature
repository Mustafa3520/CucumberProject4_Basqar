Feature: Education

  Background:
    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Navigate to education page

  Scenario: : Successfully creation of Subject Categories
    And Navigate to Subject Category
    When User create "MySubjectCat" with code "code007"
    Then Success message should be displayed

  Scenario: : Successfully creation of Subject
    And Navigate to Subject
    When User create "MySubject" with code "code005" and choose "MySubjectCat" as a category
    Then Success message should be displayed

  Scenario: Testing of Delete function of Subject Categories
    And Navigate to Subject Category
    When User delete "MySubjectCat"
    Then Error message should be displayed
