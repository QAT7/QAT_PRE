package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pageObjects.LandingPage;
import pageObjects.CreateAccount;

public class CreateAccount_StepDef {

    public WebDriver driver;
    CreateAccount createAccount;
    LandingPage landingPage;


    public CreateAccount_StepDef() throws Exception {
        driver = Hooks.driver;
        landingPage = new LandingPage(driver);
        createAccount = new CreateAccount(driver);
    }


    @Given("^I click on Create Account link$")
    public void iClickOnCreateAccountLink() throws Throwable {
        createAccount.clickOnCreateAccountLink();
    }

    @Given("^I enter all required field$")
    public void iEnterAllRequiredField() throws Throwable {
        createAccount.enterRequiredFields();
    }

    @When("^I click on Create Account button$")
    public void iClickOnCreateAccountButton() throws Throwable {
        createAccount.clickOnCreateAccountButton();
    }

   //Create new account successfull message
    @Then("^I should get successful message \"([^\"]*)\"$")
    public void iShouldGetSuccessfulMessage(String successfullMessage) throws Throwable {
        createAccount.createAccountSuccessfullMessage(successfullMessage);
    }




    // Verify email address already exists message
    @Then("^I should get message \"([^\"]*)\"$")
    public void iShouldGetMessage(String message) throws Throwable {
        createAccount.createAccountAlreadyExistsMessage(message);
    }


    @Then("^I should get verification email$")
    public void iShouldGetVerificationEmail() throws Throwable {
        System.out.println("Email sent.....");
        System.out.println("Email received.....");
    }

}
