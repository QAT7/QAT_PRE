Feature: Complete and Submit application forms for different programes


  @suite
  Scenario: As an application I apply for an Pathway to Medicine outreach programme
  Country as United Kingdom - England
  Year Group as Y1
  1 Parent/Guardian Higher Education as No


    Given I go outreach website
    And I Login
    And I click on New Application Link
    And I select YES for Are you currently studying at school or college in the UK?
    And I select United Kingdom - England as UK School Country
    And I select School from the drop down list
    And I select "Y1" answer for Which UK Year Group are you in?
    And I enter all Teacher Details
    And I save & go to "Parents/Guardian" tab
    And I complete Parent/Guardian Form and save it
    And I select "Pathways to Medicine" as my course
    And I select start date as "12/03/2018"
    And I select strand as "Design Engineering"
    And I select FSM as "No"
    And I select House hold income as "0 - 25000"
    And I select care as "No"
    And I select Carer as "No"
    And I select parent guardian education as "Yes" and save the form
    And I enter my personal statement as "This is my personal stateme"
    And I select my Data Policy & Marketing as "Email"
    And I accept terms & conditions and save the form
    And I click On "Review
    When I click on "Submit Application" buton
    Then I should get successful message "Thank you for submitting your application"


  Scenario: As an application I apply for an Sutton Trust outreach programme
  Country as United Kingdom - England
  Year Group as Y2
  1 Parent/Guardian Higher Education as No


  Scenario: As an application I apply for an Maker Challenge outreach programme
  Country as United Kingdom - England
  Year Group as Y3
  1 Parent/Guardian Higher Education as No

  Scenario: As an application I apply for an Imperial Sutton Scholars outreach programme
  Country as United Kingdom - England
  Year Group as Y4
  1 Parent/Guardian Higher Education as No


  Scenario: As an application I apply for an Accelerate into Maths and Science outreach programme
  Country as United Kingdom - England
  Year Group as Y4
  1 Parent/Guardian Higher Education as No

  Scenario: As an application I apply for an Global Summer School outreach programme
  Country as United Kingdom - England
  Year Group as Y4
  1 Parent/Guardian Higher Education as No