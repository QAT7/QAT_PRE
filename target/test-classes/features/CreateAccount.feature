Feature: As an applicant I should be able to create new account.

  @wip
  Scenario: Create new account
    Given I go outreach website
    And I click on Create Account link
    And I enter all required field
    When I click on Create Account button
    Then I should get successful message "Almost finished... now check your email. We've emailed you a link, which you need to click to activate your account."
    And I should get verification email



  Scenario: Create new account with already used email address
    Given I go outreach website
    And I click on Create Account link
    And I enter all required field
    When I click on Create Account button
    Then I should get message "You already have an account. Please log in, or click on 'Forgotten Password' to set a new password."



