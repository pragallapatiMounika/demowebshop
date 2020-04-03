package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/resources/features",
		glue = {"StepDefiniton.logout"},
		plugin = {"pretty", "html:target/cucumber"},
		tags = {"@tag5"},
		monochrome = true
		)

public class logout_runner {

}
