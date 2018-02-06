$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/CreateAccount.feature");
formatter.feature({
  "line": 1,
  "name": "As an applicant I should be able to create new account.",
  "description": "",
  "id": "as-an-applicant-i-should-be-able-to-create-new-account.",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4461528563,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Create new account",
  "description": "",
  "id": "as-an-applicant-i-should-be-able-to-create-new-account.;create-new-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@wip"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I go outreach website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on Create Account link",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter all required field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on Create Account button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should get successful message \"Almost finished... now check your email. We\u0027ve emailed you a link, which you need to click to activate your account.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I should get verification email",
  "keyword": "And "
});
formatter.match({
  "location": "LoginLogout_StepDef.iGoOutreachWebsite()"
});
formatter.result({
  "duration": 1636531594,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount_StepDef.iClickOnCreateAccountLink()"
});
formatter.result({
  "duration": 590310742,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount_StepDef.iEnterAllRequiredField()"
});
formatter.result({
  "duration": 1209006320,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount_StepDef.iClickOnCreateAccountButton()"
});
formatter.result({
  "duration": 2128507893,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Almost finished... now check your email. We\u0027ve emailed you a link, which you need to click to activate your account.",
      "offset": 33
    }
  ],
  "location": "CreateAccount_StepDef.iShouldGetSuccessfulMessage(String)"
});
formatter.result({
  "duration": 1228545616,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount_StepDef.iShouldGetVerificationEmail()"
});
formatter.result({
  "duration": 102265,
  "status": "passed"
});
formatter.after({
  "duration": 132741,
  "status": "passed"
});
});