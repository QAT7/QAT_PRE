
Feature: As an applicant when I login with valid credentials. I should be able log out from site
  @suite
  Scenario: Login with valid credentials
    Given I go outreach website
    And I enter my username
    And I enter my password
    When I click on Submit
    Then I should get Welcome message
    And I should be able to logout


