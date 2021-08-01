package commonMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class UtilityMethods {
	
	WebDriver driver;
	
	@BeforeClass
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/");
	}
	
	@AfterClass
	public void QuitBrowser() {
		driver.quit();
	}
	
	public WebDriver GetDriver() {
		return driver;
	}
	
}
