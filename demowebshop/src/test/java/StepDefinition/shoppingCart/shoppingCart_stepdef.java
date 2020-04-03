package StepDefinition.shoppingCart;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demowebshop.ShoppingCart;

public class shoppingCart_stepdef {
	  WebDriver driver;
	   ShoppingCart shoppingCart; 
	
    @Given("^User clicks the ShoppingCart $")
    public void user_clicks_the_shoppingcart() throws Throwable {
    	
    	shoppingCart.cart(driver);
        //throw new PendingException();
    }

    //@When("^Clicks gotocart$")
   // public void clicks_gotocart() throws Throwable {
    //	shoppingCart.cart();
        //throw new PendingException();
    //}

    @Then("^click continue shopping$")
    public void click_continue_shopping() throws Throwable {
    	shoppingCart.continueshopping();
        //throw new PendingException();
    }
   

}
