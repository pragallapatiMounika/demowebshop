package demowebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select {
	@FindBy(linkText="Electronics")
    WebElement electronics;
	@FindBy(linkText="Cell phones")
	WebElement cellphones;
	@FindBy(linkText="Smartphone")
	WebElement smartphones;
	@FindBy(id="add-to-cart-button-43")
	WebElement cartBtn;
	public Select(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		//this.driver = driver;
	}
	
	public void ClickElectronics() {
		electronics.click();
	}
	
	public void ClickCellphones() {
		cellphones.click();
	
	}
	public void ClickSmartphones() {
		smartphones.click();
	}
	public void addtocart()
	{
		cartBtn.click();
	}
	
}