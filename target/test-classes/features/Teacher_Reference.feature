Feature: As a Teacher I should be able to complete Parent reference form


  Scenario: Complete and submit Teacher Reference form
    Given I am have a valid reference link
    And I enter correct student date of birth
    When I see the form
    Then I should be able to complete all the required fields
    And I should be able to submit the form