package runner_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = {"step_definitions"},
        snippets = SnippetType.UNDERSCORE,
//        monochrome = true,
        plugin = {"pretty:STDOUT","html:Reports/cucumber-pretty"},
        tags = {"@suite","~@wip"}

)
public class RunSuite {
}
