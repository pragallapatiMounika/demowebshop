package demowebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(linkText="Log in")
	WebElement login;
	@FindBy(id="Email")
	WebElement email;
	@FindBy(id ="Password")
	WebElement password;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
	WebElement loginBtnElement;


public Login(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	//this.driver = driver;
}
public void account() {
	login.click();
}
public void SetEmail(String Email) {
	email.sendKeys("v.manoj9631@gmail.com");
}
public void Setpassword(String Password) {
	password.sendKeys("workfromhome12$");
}

public void LoginBtnElement() {
	loginBtnElement.click();
	
}
}
