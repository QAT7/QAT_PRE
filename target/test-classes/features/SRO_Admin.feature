Feature: As an SRO Admin I Should be able to make a decission on an application.


  Background: Login to outreach interal application with SSO details
    Given I am on outreach internal application
    And I login with my SSO details

  Scenario: As an SRO admin I Accept Pre-Offer for the given application
    And I have completed application
    When I open application
    Then I should be able to set Pre-offer as Accept


  Scenario: As an SRO admin I Accept Offer for the given application
    And I have completed application
    When I open application
    Then I should be able to set Offer as Accept


  Scenario: As an SRO admin I Reject Pre-Offer and Accept Offer for the given application
    And I have completed application
    When I open application
    Then I should be able to set Pre-offer as Reject
    And I should be able to set Offer as Accept


  Scenario: As an SRO admin I Accept Pre-Offer and Reject Offer for the given application
    And I have completed application
    When I open application
    Then I should be able to set Pre-offer as Reject
    And I should be able to set Offer as Accept


  Scenario: As an SRO admin I Reject Pre-Offer and Reject Offer for the given application
    And I have completed application
    When I open application
    Then I should be able to set Pre-offer as Reject
    And I should be able to set Offer as Reject


  Scenario: As an SRO admin I Refer Work experience application to department
    And I have completed application
    When I open application
    Then I should be able to Refer to Department