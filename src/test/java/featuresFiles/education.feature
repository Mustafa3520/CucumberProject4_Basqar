Feature: Education

  Background:
    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Navigate to education page

  Scenario: : Successfully creation of Subject Categories
      When User create a subject category as "MySubjectCat"
      Then Success message should be displayed

    Scenario: : Successfully creation of Subject
        When User create a subject as "MySubject" and choose MySubjectCat as a category
        Then Success message should be displayed

