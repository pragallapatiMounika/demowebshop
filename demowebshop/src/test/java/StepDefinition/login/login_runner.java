package StepDefinition.login;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/resources/features",
		glue = {"src/test/java/StepDefiniton/login"},
		plugin = {"pretty", "html:target/cucumber"},
		tags = {"@tag1"},
		monochrome=true
		)
public class login_runner {

	
}
