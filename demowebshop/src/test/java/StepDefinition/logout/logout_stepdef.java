package StepDefinition.logout;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import demowebshop.LogOut;
import demowebshop.WishList;

public class logout_stepdef {
	WebDriver driver;
	WishList wishlist;
	LogOut logout;
	
	 @Given("^click wishlist$")
	    public void click_wishlist() throws Throwable {
	    	wishlist.wishlist();
	        //throw new PendingException();
	    }

	    @Then("^click  on logout $")
	    public void click_on_logout() throws Throwable {
	    	logout.logout();
	        //throw new PendingException();
	    }

}
