package pageObjects;

import cucumber.api.java.gl.E;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Programmes extends BaseClass {

    public Programmes(WebDriver driver){
        super(driver);
    }

    //Which programme are you applying for?
    @FindBy(xpath = ".//span[@class='select2-chosen' and contains(text(),'Select Programme')]")
    public static WebElement whichProgrammeAreYouApplyingFor_ComboBox;

    //Set focus on Select Programme
    @FindBy(xpath = ".//input[@id='s2id_autogen2_search']")
    public static WebElement programmeList;


    // CLick on Choose Start a Date
    @FindBy(xpath = ".//div[contains(@id,'Applications_ProgrammeStartDate')]")
    public WebElement selectStartDate;

    //Set focus on Select Select Date
    @FindBy(xpath = ".//input[@id='s2id_autogen49_search']")
    public static WebElement clickOnStartDate;

    //Click inside Select Strand
    @FindBy(xpath = ".//div[contains(@id,'Applications_Stream')]")
    public WebElement chooseStrand;

    //Set focus on Strand Text Field
    @FindBy(xpath = ".//input[@id='s2id_autogen33_search']")
    public WebElement selectStrand;

    //Click on FSM Option drop down
    @FindBy(xpath = ".//div[contains(@id,'Applications_FSM')]")
    public WebElement fsm;

    //Enter value for FSM
    @FindBy(xpath = ".//input[@id='s2id_autogen34_search']")
    public WebElement enterFSMValue;


    //Click on House hold Income Drop Down
    @FindBy(xpath = ".//div[contains(@id,'Applications_Income')]")
    public WebElement incomeDropDown;

    //Enter House Hold Income
    @FindBy(xpath = ".//input[@id='s2id_autogen35_search']")
    public WebElement incomeAnswer;


    //Click on care drop down
    @FindBy(xpath = ".//div[contains(@id,'Application') and contains(@id,'Care')][1]")
    public WebElement careDropDown;

    //Enter Care answer
    @FindBy(xpath = ".//input[@id='s2id_autogen8_search']")
    public WebElement careAnswerSelection;


    //Click on Carer Drop Down
    @FindBy(xpath = ".//div[contains(@id,'Application') and contains(@id,'Care') and contains(@id,'Carer')]")
    public WebElement carerDropDown;

    //Enter Carer answer
    @FindBy(xpath = ".//input[@id='s2id_autogen9_search']")
    public WebElement carerAnswerSelection;


    //Click on Parent Guardian Education Details
    @FindBy(xpath = ".//span[@id='select2-chosen-10']")
    public WebElement parentGuardianDropDown;

    //Select Parent Guardian Education Answer

    @FindBy(xpath = ".//input[@id='s2id_autogen10_search']")
    public WebElement parentGuardianAnswerSelection;




    ///------------------------------------------------------||||||||||||||------------------------------------\\\\\\\\\\\\\\\\\
   //Click on Programme Drop Down, Enter and Select the Programme Name and selec
    public void clickOnSelectProgrammeFromDropDownBox(String programmeName) throws Exception {
        //To Click on the dropdown element
        whichProgrammeAreYouApplyingFor_ComboBox.click();
        System.out.println("I have clicked on - Which Programme Are You Applying for");
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.moveToElement(programmeList).click().sendKeys(programmeName).sendKeys(Keys.RETURN).build().perform();
    }

    //Make this dynamic to select the first value every time
    public void selectFristStartDateFromTheDropDown(String startDate) throws Exception{
        Thread.sleep(2000);
        selectStartDate.click();
        System.out.println("I have clicked on - Choose a Start Date");
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.moveToElement(clickOnStartDate).click().sendKeys(startDate).sendKeys(Keys.RETURN).build().perform();
    }

    // Make this dyanmic to select the frist strand from the frop down list
    public void selectPathWayMedinceStrand(String strand) throws  Exception{
        Thread.sleep(1000);
        chooseStrand.click();
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.moveToElement(selectStrand).click().sendKeys(strand).sendKeys(Keys.RETURN).build().perform();
    }

    public void selectFSMAnswer(String fsmAnswer) throws Exception{
        Thread.sleep(1000);
        fsm.click();
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.moveToElement(enterFSMValue).click().sendKeys(fsmAnswer).sendKeys(Keys.RETURN).build().perform();

    }

    public void selectHouseHoldIncome(String income) throws Exception{
        Thread.sleep(1000);
        incomeDropDown.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(incomeAnswer).click().sendKeys(income).sendKeys(Keys.RETURN).build().perform();

    }

    public void selectCareAsnwer(String careAnswer) throws Exception{
        Thread.sleep(1000);
        careDropDown.click();
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.moveToElement(careAnswerSelection).click().sendKeys(careAnswer).sendKeys(Keys.RETURN).build().perform();

    }

    public void selectCaringAnswer(String caringAnswer) throws Exception{
        Thread.sleep(1000);
        carerDropDown.click();
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.moveToElement(careAnswerSelection).click().sendKeys(caringAnswer).sendKeys(Keys.RETURN).build().perform();

    }

    public void selectParentGuardianHigherEducation(String universityAnswer)throws Exception{
        Thread.sleep(1000);
        parentGuardianDropDown.click();
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.moveToElement(parentGuardianAnswerSelection).click().sendKeys(universityAnswer).sendKeys(Keys.RETURN).build().perform();

    }

    //Programme Related Questions
    public class PathwayToMedicine extends BaseClass {

       public PathwayToMedicine(WebDriver driver){
           super(driver);
       }


    }

}
