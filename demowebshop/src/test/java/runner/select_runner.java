package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/resources/features",
		glue = {"StepDefiniton.select.select_stepdef.class"},
		tags = {"@tag2"},
		plugin = {"pretty", "html:target/cucumber"},		
		monochrome = true
		)

public class select_runner {

}
