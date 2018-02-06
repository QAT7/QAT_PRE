Feature: As a department user I should be able to make decision of applications refered

  Scenario: As an Deparment user I Accept Work experience application
    And I have completed application
    When I open application
    Then I should be able to set Pre-offer as Accept


  Scenario: As an Deparment user I Reject Work experience application
    And I have completed application
    When I open application
    Then I should be able to set Pre-offer as Reject