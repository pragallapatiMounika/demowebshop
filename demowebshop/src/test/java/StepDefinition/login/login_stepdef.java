package StepDefinition.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demowebshop.SelectBooks;
import demowebshop.LogOut;
import demowebshop.Login;
import demowebshop.Select;
import demowebshop.ShoppingCart;
import demowebshop.WishList;

public class login_stepdef {
	WebDriver driver;
	Login login;
	Select select;
	ShoppingCart shoppingCart;
	SelectBooks books;
	WishList wishlist;
	LogOut logout;

	@Given("^User Is On My LoginPage$")
	public void user_is_on_my_loginpage() throws Throwable {
		// throw new PendingException();
		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/cart");
		login = new Login(driver);
		select = new Select(driver);
		shoppingCart = new ShoppingCart(driver);
		books = new SelectBooks(driver);
		wishlist = new WishList(driver);
		logout = new LogOut(driver);
		login.account();
	}

	@When("^User Fillup uid user(\\d+)$")
	public void user_fillup_uid(String username) throws Throwable {
		
		login.SetEmail(username);
	}

	@Then("^User click LoginButton$")
	public void user_click_loginbutton() throws Throwable {
		login.LoginBtnElement();
	}

	@When("^User Fillup pwd userpass$")
	public void user_fillup_pwd(String password) throws Throwable {
		login.Setpassword(password);
	}
}
