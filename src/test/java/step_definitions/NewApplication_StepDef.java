package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import org.openqa.selenium.WebDriver;
import pageObjects.CreateAccount;
import pageObjects.LandingPage;
import pageObjects.NewApplication;
import pageObjects.NewApplication.*;
import pageObjects.Programmes;
import pageObjects.Programmes.*;

public class NewApplication_StepDef {

    public WebDriver driver;
    CreateAccount createAccount;
    LandingPage landingPage;
    NewApplication newApplication;
    TeacherApplicationDetails teacherApplicationDetails;
    ParentGuardianDetails parentGuardianDetails;
    Programmes programmes;
    PathwayToMedicine pathwayToMedicine;

    public NewApplication_StepDef(){
        driver = Hooks.driver;
        createAccount = new CreateAccount(driver);
        landingPage = new LandingPage(driver);
        newApplication = new NewApplication(driver);
        teacherApplicationDetails = new NewApplication(driver).new TeacherApplicationDetails(driver);
        parentGuardianDetails = new NewApplication(driver).new ParentGuardianDetails(driver);
        programmes = new Programmes(driver);
        pathwayToMedicine = new Programmes(driver).new PathwayToMedicine(driver);
    }


    @Given("^I Login$")
    public void iLogin() throws Throwable {
        landingPage.successfullLogin();
    }

    @Given("^I click on New Application Link$")
    public void iClickOnNewApplicationLink() throws Throwable {
       newApplication.clickOnNewApplication();
    }

    @Given("^I select YES for Are you currently studying at school or college in the UK\\?$")
    public void iSelectYESForAreYouCurrentlyStudyingAtSchoolOrCollegeInTheUK() throws Throwable {
        newApplication.selectAreYouStudingAtSchoolOrCollegeInTheUK_YES();
    }

    @Given("^I select United Kingdom - England as UK School Country$")
    public void iSelectUnitedKingdomEnglandAsUKSchoolCountry() throws Throwable {
        newApplication.selectUKSchoolCountry();
    }

    @Given("^I select School from the drop down list$")
    public void iSelectSchoolFromTheDropDownList() throws Throwable {
        newApplication.selectUKSchoolorCollegeFromSuggestionsList();
    }

    @And("^I select \"([^\"]*)\" answer for Which UK Year Group are you in\\?$")
    public void iSelectAnswerForWhichUKYearGroupAreYouIn(String yearGroup) throws Throwable {
        newApplication.selectYearGroup(yearGroup);
    }

    @Given("^I enter all Teacher Details$")
    public void iEnterAllTeacherDetails() throws Throwable {
        teacherApplicationDetails.completeTeacherDetails();
    }

    @And("^I save & go to \"([^\"]*)\" tab$")
    public void iSaveGoToTab(String parentGuardiaTab) throws Throwable {
        newApplication.clickOnSaveOnSchoolEducationTabandNavigateToParentGuardianTab(parentGuardiaTab);
    }

    @And("^I complete Parent/Guardian Form and save it$")
    public void iCompleteParentGuardianFormAndSaveIt() throws Throwable {
        parentGuardianDetails.completeParentGuardianDetails();
    }

    @And("^I select \"([^\"]*)\" as my course$")
    public void iSelectAsMyCourse(String programmeName) throws Throwable {
        programmes.clickOnSelectProgrammeFromDropDownBox(programmeName);


    }

    @And("^I select start date as \"([^\"]*)\"$")
    public void iSelectStartDateAs(String startDate) throws Throwable {
        programmes.selectFristStartDateFromTheDropDown(startDate);
    }

    @And("^I select strand as \"([^\"]*)\"$")
    public void iSelectStrandAs(String strand) throws Throwable {
        System.out.println("From the scenario -- "+strand);
        programmes.selectPathWayMedinceStrand(strand);
    }

    @And("^I select FSM as \"([^\"]*)\"$")
    public void iSelectFSMAs(String fsm) throws Throwable {
        programmes.selectFSMAnswer(fsm);
    }

    @And("^I select House hold income as \"([^\"]*)\"$")
    public void iSelectHouseHoldIncomeAs(String income) throws Throwable {
        programmes.selectHouseHoldIncome(income);
    }

    @And("^I select care as \"([^\"]*)\"$")
    public void iSelectCareAs(String care) throws Throwable {
        programmes.selectCareAsnwer(care);
    }

    @And("^I select Carer as \"([^\"]*)\"$")
    public void iSelectCarerAs(String caring) throws Throwable {
        programmes.selectCaringAnswer(caring);
    }

    @And("^I select parent guardian education as \"([^\"]*)\" and save the form$")
    public void iSelectParentGuardianEducationAsAndSaveTheForm(String uni) throws Throwable {
        programmes.selectParentGuardianHigherEducation(uni);
    }


    //----- TO DO FROM HERE
    @And("^I enter my personal statement as \"([^\"]*)\"$")
    public void iEnterMyPersonalStatementAs(String arg0) throws Throwable {

    }

    @And("^I select my Data Policy & Marketing as \"([^\"]*)\"$")
    public void iSelectMyDataPolicyMarketingAs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I accept terms & conditions and save the form$")
    public void iAcceptTermsConditionsAndSaveTheForm() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I click On \"Review$")
    public void iClickOnReview() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    @When("^I click on \"([^\"]*)\" buton$")
    public void iClickOnButon(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
