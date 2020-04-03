package StepDefinition.select;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demowebshop.LogOut;
import demowebshop.Login;
import demowebshop.Select;
import demowebshop.SelectBooks;
import demowebshop.ShoppingCart;
import demowebshop.WishList;

public class select_stepdef {
	    
	
	WebDriver driver;
	Login login;
	Select select;
	ShoppingCart shoppingCart;
	SelectBooks books;
	WishList wishlist;
	LogOut logout;
	  
	 // @Given("^User is on Homepage$")
	   // public void user_is_on_homepage() throws Throwable {
		  //System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
			//driver = new ChromeDriver();
			//driver.get("http://demowebshop.tricentis.com/cart");
			
			//login = new Login(driver);
			//select = new Select(driver);
			//shoppingCart = new ShoppingCart(driver);
			//books = new SelectBooks(driver);
			//wishlist = new WishList(driver);
			//logout = new LogOut(driver);
		  
		  
		  
	        //throw new PendingException();
	    //}

	  @Given("^User Clicks Electronics$")
	    public void i_click_electronics() throws Throwable {
		  System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://demowebshop.tricentis.com/cart");
			
			login = new Login(driver);
			select = new Select(driver);
			shoppingCart = new ShoppingCart(driver);
			books = new SelectBooks(driver);
			wishlist = new WishList(driver);
			logout = new LogOut(driver);
		  
	    	select.ClickElectronics();
	        //throw new PendingException();
	    }

	    @Then("^click addtoCart$")
	    public void click_addtocart() throws Throwable {
	    	select.addtocart();
	        //throw new PendingException();
	    }

	    @And("^click cellphones$")
	    public void click_cellphones() throws Throwable {
	    	select.ClickCellphones();
	        //throw new PendingException();
	    }

	    @And("^click smartPhones$")
	    public void click_smartphones() throws Throwable {
	    	select.ClickSmartphones();
	        //throw new PendingException();
	    }
	  

}
