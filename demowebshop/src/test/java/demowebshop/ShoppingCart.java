package demowebshop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart {
	@FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
	WebElement cart;	
	//@FindBy(className = "button-1 cart-button")
	//WebElement gotocart;
	@FindBy(xpath="//input[@name='continueshopping']")
	//@FindBy(className ="button-2 continue-shopping-button")
	WebElement continueshopping;

	public ShoppingCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	public void cart( WebDriver driver)  {
		cart.click();
		
		
		Actions action = new Actions(driver);
		action.moveToElement(cart).click().build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	//public void gotocart() {
		
	//	gotocart.click();
	//}

	public void continueshopping() {
		
		continueshopping.click();
	}

}