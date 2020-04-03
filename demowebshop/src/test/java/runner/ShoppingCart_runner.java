package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/resources/features",
		glue = {"StepDefiniton.shoppingCart"},
		plugin = {"pretty", "html:target/cucumber"},
		tags = {"@tag3"},
		monochrome = true
		)

public class ShoppingCart_runner {

}
