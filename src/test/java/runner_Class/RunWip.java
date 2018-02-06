package runner_Class;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


import java.io.File;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        tags = {"@wip","~@suite"},
        glue = {"step_definitions"},
        snippets = SnippetType.CAMELCASE,
        plugin = {"pretty:STDOUT","html:Reports\\cucumber-pretty",
        "json:Reports\\cucumber-json\\cucumber.json",
     "com.cucumber.listener.ExtentCucumberFormatter:Reports\\cucumber-extent\\report.html"}


)
public class RunWip {

    @BeforeClass
    public static void setup(){
        ExtentProperties extentProperties = ExtentProperties.INSTANCE;
        extentProperties.setReportPath("output\\myreport.html");
//        extentProperties.setExtentXServerUrl("http://localhost:1337");
//        extentProperties.setProjectName("MyProject");
    }

    @AfterClass
    public static void tearDown(){
        Reporter.loadXMLConfig(new File("src\\test\\resources\\extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os","Windows 10");
        Reporter.setTestRunnerOutput("Sample test runner output message");
    }
}
