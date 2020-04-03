package demowebshop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	protected WebDriver driver;

	public void LaunchApplication() {
		// To launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		

	}

	public void OpenWebsite() {
		driver.get("http://demowebshop.tricentis.com");

	}


	// To close the browser
	public void quit() {

		driver.close();
	}

}
