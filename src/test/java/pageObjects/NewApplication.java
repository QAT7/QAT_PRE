package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class NewApplication extends BaseClass {

    public NewApplication(WebDriver driver) {
        super(driver);
    }

    //New Application Link on Home Page after applicant logs in
    @FindBy(xpath = ".//a[contains(text(),'New Application')]")
    public static WebElement newApplication;

    //Are you currently studying at school or college in the UK? = YES
//    @FindBy(xpath = ".//div[contains(text(),'Yes')]")
    @FindBy(xpath = ".//input[contains(@id,'School2')]")
    public static WebElement schookUKYES_RadioButton;

    //Are you currently studying at school or college in the UK? = NO
    @FindBy(xpath = ".//div[contains(text(),'No')]")
    public static WebElement schoolUKNO_RadioButton;

    //UK School Country
    @FindBy(xpath = ".//span[@class='select2-chosen']")
    public static WebElement ukSchoolCountry_ComboBox;

    //Set focus on UK School Country Drop down text field
    @FindBy(xpath = ".//input[@id='s2id_autogen2_search']")
    public static WebElement ukSchoolCountryList;

    //UK School Or College text field
    @FindBy(xpath = ".//input[@placeholder='Search school']")
    public static WebElement ukSchoolOrCOllegeSuggestList;

    // Harrow College
    @FindBy(xpath = ".//*[contains(text(),'Harrow College')]")
    public static WebElement selectCollegeByNameFromTheList;

    // Year Group Drop Down list
    @FindBy(xpath = ".//span[contains(text(),'Select a Year Group')]")
    public static WebElement yearGroup;

    //Set focus on Year Group Drop down text field
    @FindBy(xpath = ".//input[@id='s2id_autogen1_search']")
    public static WebElement getYearGroupList;

    @FindBy(xpath = ".//input[@value='Save' and @type='submit']")
    public static WebElement saveButtonSchoolEducationTab;


    //-----Methods
    public void clickOnNewApplication() throws Exception {
        newApplication.click();
        Thread.sleep(1000);
    }

    public void selectAreYouStudingAtSchoolOrCollegeInTheUK_YES() throws Exception {
        schookUKYES_RadioButton.click();
        Thread.sleep(1000);
    }

    public void selectUKSchoolCountry() throws Exception {
        //To Click on the dropdown element
        ukSchoolCountry_ComboBox.click();
        System.out.println("I have clicked on - UK School Country drop down field");
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.moveToElement(ukSchoolCountryList);
        actions.click();
        actions.sendKeys("United Kingdom - England");
        actions.sendKeys(Keys.RETURN);
        actions.build().perform();
    }


    public void selectUKSchoolorCollegeFromSuggestionsList() throws Exception {
        Thread.sleep(2000);
        ukSchoolOrCOllegeSuggestList.sendKeys("Harrow College");
        selectCollegeByNameFromTheList.click();
    }

    public void selectYearGroup(String yearGroupAsOne) throws Exception {
        Thread.sleep(1000);
        yearGroup.click();
        Actions a = new Actions(driver);
        a.moveToElement(getYearGroupList);
        a.click();
        a.sendKeys(yearGroupAsOne);
        a.sendKeys(Keys.RETURN);
        a.build().perform();


    }

    //1. Click on Save button on School Education Tab - DONE
    //2. Verify if applicant is on Parent/Guardian Tab - TO DO
    public void clickOnSaveOnSchoolEducationTabandNavigateToParentGuardianTab(String parentGuardianTab) {
        saveButtonSchoolEducationTab.click();
    }

    //Teacher Details Tab page object class
    public class TeacherApplicationDetails extends BaseClass {

        public TeacherApplicationDetails(WebDriver driver) {
            super(driver);
        }

        // Teacher Title
        @FindBy(xpath = ".//input[contains(@id,'TeacherTitle')]")
        public WebElement teacherTitle;
        //Teacher First Name
        @FindBy(xpath = ".//input[contains(@id,'TeacherFirstName')]")
        public WebElement teacherFirstName;
        //TeacherSurname
        @FindBy(xpath = ".//input[contains(@id,'TeacherLastName')]")
        public WebElement teacherSurname;
        //Teacher Email address
        @FindBy(xpath = ".//input[contains(@id,'TeacherEmailAddress')]")
        public WebElement teacherEmail;
        //Teacher Phone
        @FindBy(xpath = ".//input[contains(@id,'TeacherPhone')]")
        public WebElement teacherPhone;
        //Teacher Job Title
        @FindBy(xpath = ".//input[contains(@id,'TeacherJob')]")
        public WebElement teacherJobTitle;


        public void completeTeacherDetails() {

            teacherTitle.sendKeys("Mrs");
            teacherFirstName.sendKeys("Sue");
            teacherSurname.sendKeys("Parker");
            teacherEmail.sendKeys("sue.parker@mailinator.com");
            teacherPhone.sendKeys("123456789");
            teacherJobTitle.sendKeys("Head Teacher");
        }
    }

    //Parent/Guardian Details Tab page object class
    public class ParentGuardianDetails extends BaseClass {

        public ParentGuardianDetails(WebDriver driver) {
            super(driver);
        }

        // Locate Parent Guardian Label by Text - returns 2
        @FindBy(xpath = ".//div[contains(text(),'Parent / Guardian')]")
        public WebElement parentGuardian_Text;

        //Locate Parent/Guardian Label by ID - returns 1
        @FindBy(xpath = ".//div[contains(@id,'Title')]")
        public WebElement parentGuardianLabel_ByID;

        //Parent/Guardian Title
        @FindBy(xpath = ".//input[contains(@id,'GuardianTitle')]")
        public WebElement parentGuardiaTitle;

        //Parent/Guardian FirstName
        @FindBy(xpath = ".//input[contains(@id,'GuardianFirstName')]")
        public WebElement parentGuardianFirstName;

        //Parent/Guardian Surname
        @FindBy(xpath = ".//input[contains(@id,'GuardianLastName')]")
        public WebElement parentGuardianSurname;

        //Parent/Guardian Email
        @FindBy(xpath = ".//input[contains(@id,'GuardianEmailAddress')]")
        public WebElement parentGuardianEmailAddress;

        //Parent/Guardian Emergency Contact Number
        @FindBy(xpath = ".//input[contains(@id,'GuardianContactNumber')]")
        public WebElement parentGuardianEmergencyContact;

        //Parent/Guardian Mobile Number
        @FindBy(xpath = ".//input[contains(@id,'GuardianMobileNumber')]")
        public WebElement parentGuardianMobileNumber;

        //Parent/Guardian Live at same address = YES
        @FindBy(xpath = ".//input[contains(@id,'IsGuardianSameAddr') and @value='1']")
        public WebElement parentGuardianLiveAtSameAddress_RadioButtonYES;

        //Parent/Guardian Live at same address = NO
        @FindBy(xpath = ".//input[contains(@id,'IsGuardianSameAddr2') and @value='2']")
        public WebElement parentGuardianLiveAtSameAddress_RadioButtonNo;

        //Parent/Guardian Relationship to you
        @FindBy(xpath = ".//input[contains(@id,'GuardianRelationship')]")
        public WebElement parentGuardianRelationshipToYou;


        @FindBy(xpath = ".//input[@value='Save' and @type='submit']")
        public  WebElement saveButtonSchoolParentGuardianTab;



        //Are you the first in your family to go to University?
        @FindBy(xpath = ".//span[@class='select2-chosen']")
        public WebElement parentGuardianAreYouFirstToGoToUniversity;

        @FindBy(xpath = ".//input[@id='s2id_autogen1_search']")
        public WebElement parentGuardianAreYouFirstToGoToUniversity_YES;

        //Add Guardian Details Link
        @FindBy(xpath = ".//a[@id='CollegeCommon_Th_wt180_block_Imperial_Theme_wt15_block_wtMainContent_wtMainContent_wtHeDetailsWB_WebPatterns_wt43_block_wtCell1_WebPatterns_wt32_block_wtCell2_wtNewGuardianHistoryLink2']")
        public WebElement addGuardianDetails;



        public void completeParentGuardianDetails() {

            parentGuardiaTitle.sendKeys("Mrs");
            parentGuardianFirstName.sendKeys("Alice");
            parentGuardianSurname.sendKeys("Hewit");
            parentGuardianEmailAddress.sendKeys("alicehewit@mailinator.com");
            parentGuardianEmergencyContact.sendKeys("11111111111111111111");
            parentGuardianMobileNumber.sendKeys("1230000000000");
            parentGuardianLiveAtSameAddress_RadioButtonYES.click();
            parentGuardianRelationshipToYou.sendKeys("Mother-Parent");
            saveButtonSchoolParentGuardianTab.click();
        }

    }


}
