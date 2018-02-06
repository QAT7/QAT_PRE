package step_definitions;


import cucumber.api.java.en.*;
import helper.Constants;

import org.openqa.selenium.WebDriver;
import pageObjects.LandingPage;

public class LoginLogout_StepDef {

    public WebDriver driver;
    LandingPage landingPage;

    public LoginLogout_StepDef() {
        driver = Hooks.driver;
        landingPage = new LandingPage(driver);
    }

    @Given("^I go outreach website$")
    public void iGoOutreachWebsite() throws Throwable {
        driver.get(Constants.URL);
    }

    @Given("^I enter my username$")
    public void iEnterMyUsername() throws Throwable {
        landingPage.enterEmail();
    }

    @Given("^I enter my password$")
    public void iEnterMyPassword() throws Throwable {
        landingPage.enterPassword();
    }

    @When("^I click on Submit$")
    public void iClickOnSubmit() throws Throwable {
        landingPage.clickSubmit();
    }

    @Then("^I should get Welcome message$")
    public void iShouldGetWelcomeMessage() throws Throwable {
        landingPage.verifyWelcomeMessage();
    }

    @Then("^I should be able to logout$")
    public void iShouldBeAbleToLogout() throws Throwable {

        landingPage.logout();
    }


}
