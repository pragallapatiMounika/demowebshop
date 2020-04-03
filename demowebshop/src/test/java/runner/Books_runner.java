package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/resources/features",
		glue = {"StepDefiniton.books"},
		plugin = {"pretty", "html:target/cucumber"},
		tags = {"@tag4"},
		monochrome= true
		)
public class Books_runner {

}
