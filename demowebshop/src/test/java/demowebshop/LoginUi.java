package demowebshop;

    import org.testng.annotations.Test;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.Test;

	public class LoginUi {
		WebDriver driver;
		Login login;
		Select select;
		ShoppingCart shoppingCart;
		SelectBooks selectbooks;
		WishList wishlist;
		LogOut logout;

		@BeforeSuite
		public void initDriver() {
			System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
		}

		@Test
		public void OpenBrowser() {
			driver = new ChromeDriver();
			driver.get("http://demowebshop.tricentis.com");
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			login = new Login(driver);
			select = new Select(driver);
			shoppingCart = new ShoppingCart(driver);
			selectbooks = new SelectBooks(driver);
			wishlist = new WishList(driver);
			logout = new LogOut(driver);

		}

		@Test(priority = 1)
		public void Login() {
			login.account();
			login.SetEmail("email");
			login.Setpassword("password");
			login.LoginBtnElement();
		}

		@Test(priority = 2)
		public void Slect() {
			select.ClickElectronics();
			select.ClickCellphones();
			select.ClickSmartphones();
			select.addtocart();
		}

		@Test(priority = 4)
		public void ShoppingCart() throws InterruptedException {
			shoppingCart.cart(driver);
			//shoppingCart.gotocart();
			Thread.sleep(5000);
			
			shoppingCart.continueshopping();

		}

		@Test(priority = 3)
		public void books() {
			selectbooks.books();
			selectbooks.Computing();
			selectbooks.compare();
		}

		@Test(priority = 5)
		public void Wishlist() {
			wishlist.wishlist();
		}
		@Test(priority=6)
		public void Logout(){
			logout.logout();
		}

	}


