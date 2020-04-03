package StepDefinition.books;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import demowebshop.SelectBooks;

public class books_stepdef {
	WebDriver driver;
	SelectBooks books; 
	
	
	 @Given("^User clicks the books$")
	    public void user_clicks_the_books() throws Throwable {
	    	books.books();
	        //throw new PendingException();
	    }

	    @Then("^Click CompareList$")
	    public void click_comparelist() throws Throwable {
	    	books.compare();
	       // throw new PendingException();
	    }

	    @And("^Click Computing$")
	    public void click_computing() throws Throwable {
	    	books.Computing();
	        //throw new PendingException();
	    }

}
