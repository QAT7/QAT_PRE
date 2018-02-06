package pageObjects;

import com.aventstack.extentreports.ExtentTest;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Sleeper;

import java.util.concurrent.TimeUnit;

public class CreateAccount extends BaseClass {

    public CreateAccount(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//*[contains(text(),'Create account')]")
    public static WebElement landingPageCreateAccountLink;

    @FindBy(xpath = "//*[contains(@id,'FirstName') and @type='text']")
    public static WebElement enterFirstName;

    @FindBy(xpath = "//*[contains(@id,'LastName') and @type='text']")
    public static WebElement enterSurname;

    @FindBy(xpath = "//*[contains(@id,'DateOfBirth') and @type='text']")
    public static WebElement selectDOB;

    @FindBy(xpath = "//*[contains(@id,'EmailInput') and @type='email']")
    public static WebElement enterEmail;

    @FindBy(xpath = "//*[contains(@id,'EmailConfirmInput') and @type='email']")
    public static WebElement enterConfirmEmail;

    @FindBy(xpath = "//*[contains(@id,'PasswordInput') and @type='password']")
    public static WebElement enterPassword;

    @FindBy(xpath = "//*[contains(@id,'PasswordConfirmInput') and @type='password']")
    public static WebElement enterConfirmPassword;

    @FindBy(xpath = "//*[contains(@id,'AcceptDataPolicy') and @type='checkbox']")
    public static WebElement acceptDataPolicy;

    @FindBy(xpath = ".//*[contains(@value,'Create Account') and @type='submit']")
    public static WebElement createAccountButton;

    //Old value with ID
//    @FindBy(xpath = ".//span[id='CollegeCommon_Th_wt11_block_Imperial_Theme_wt15_block_WebPatterns_wt17_block_RichWidgets_wt9_block_wtSanitizedHtml3']")
//    @FindBy(xpath = ".//span[id='CollegeCommon_Th_wt11_block_Imperial_Theme_wt15_block_WebPatterns_wt17_block_RichWidgets_wt9_block_wtSanitizedHtml']")
    @FindBy(xpath = ".//span[id='CollegeCommon_Th_wt11_block_Imperial_Theme_wt15_block_WebPatterns_wt17_block_RichWidgets_wt9_block_wtSanitizedHtml']")
    public static WebElement confirmationMessage;


    @FindBy(xpath = ".//span[@class='Feedback_Message_Text']")
    public static WebElement messageByClass;




    //-----------------methods----------------------------------------

    public void clickOnCreateAccountLink() {
        landingPageCreateAccountLink.click();
    }

    //Enters FirstName, Surname, Date Of birth, Email, Confirmation Email, Password, Confirmation Password, Checks Data Policy checkbox
    public void enterRequiredFields() {
        enterFirstName.sendKeys("stud2018_8");
        enterSurname.sendKeys("June");
        selectDOB.sendKeys("01/02/2003");
        enterEmail.sendKeys("stud2018_8@mailinator.com");
        enterConfirmEmail.sendKeys("stud2018_8@mailinator.com");
        enterPassword.sendKeys("Test@123");
        enterConfirmPassword.sendKeys("Test@123");
        acceptDataPolicy.click();
    }

    //Clicks on create Account button
    public void clickOnCreateAccountButton() throws Exception {

        createAccountButton.click();
        Thread.sleep(2000);
    }


    public void createAccountSuccessfullMessage(String message) throws Exception {
        Thread.sleep(1000);
        Actions a = new Actions(driver);
        a.moveToElement(messageByClass);
        a.clickAndHold();
        a.build().perform();
        messageByClass.getText();
        String expectedMessageFromPage = messageByClass.getText();

        System.out.println("Web Original Message  --- "+expectedMessageFromPage);

        Assert.assertTrue(isTextPresent(message ));
        Assert.assertEquals(expectedMessageFromPage,message);
    }

    public void createAccountAlreadyExistsMessage(String message) {
        Actions a = new Actions(driver);
        a.moveToElement(messageByClass);
        a.clickAndHold();
        a.build().perform();
        messageByClass.getTagName();
        String expectedMessageFromPage = messageByClass.getText();

        System.out.println("2 - *************************"+expectedMessageFromPage);
        Assert.assertTrue(isTextPresent(message ));
        Assert.assertEquals(expectedMessageFromPage,message);
    }


    protected boolean isTextPresent(String text){
        try{
            boolean b = driver.getPageSource().contains(text);
            return b;
        }catch (Exception e){
           return false;
        }
    }

}