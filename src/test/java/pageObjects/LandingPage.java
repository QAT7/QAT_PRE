package pageObjects;

import com.google.common.base.Verify;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends BaseClass {

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//input[@id='CollegeCommon_Th_wt11_block_Imperial_Theme_wt15_block_wtMainContent_wtMainContent_wtUsernameInput']")
    public static WebElement email;

    @FindBy(xpath = ".//input[@id='CollegeCommon_Th_wt11_block_Imperial_Theme_wt15_block_wtMainContent_wtMainContent_wtPasswordInput']")
    public static WebElement password;

    @FindBy(xpath = ".//input[@id='CollegeCommon_Th_wt11_block_Imperial_Theme_wt15_block_wtMainContent_wtMainContent_wt22']")
    public static WebElement submit;


    @FindBy(xpath = ".//*[contains(text(),'Welcome')]")
    public static WebElement getwelcomeMessage;

    @FindBy(xpath = ".//div[@class='OSInline']")
    public static WebElement navUsername;

    @FindBy(xpath = ".//*[contains(text(),'Logout')]")
    public static WebElement logout;

    //We will use this boolean for assertion. To check if page is opened.
    public void enterEmail() {
        email.sendKeys("stud11@mailinator.com");
    }

    //We will use this boolean for assertion. To check if Sign In Link is displayed.
    public void enterPassword() {
        password.sendKeys("Test@123");
    }

    public void clickSubmit() throws Exception {
        Thread.sleep(1000);
        submit.click();
    }

    public void verifyWelcomeMessage() {
        System.out.println("Welcome = " + getwelcomeMessage.getText());
    }

    public void logout() throws Exception {
        Thread.sleep(1000);
        navUsername.click();
        Thread.sleep(1000);
        logout.click();
    }


    public void successfullLogin() {
        email.sendKeys("stud11@mailinator.com");
        password.sendKeys("Test@123");
        submit.click();
    }
}
