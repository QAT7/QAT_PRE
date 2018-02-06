package step_definitions;

import org.openqa.selenium.WebDriver;
import pageObjects.LandingPage;

public class HomePage_StepDef {

    public WebDriver driver ;
    LandingPage landingPage;


    public HomePage_StepDef() {
        driver = Hooks.driver;
        landingPage = new LandingPage(driver);
    }


}
