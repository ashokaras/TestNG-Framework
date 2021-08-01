package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.UtilityMethods;

public class TC001_Edit {
	
	WebDriver driver;
	
	public TC001_Edit(UtilityMethods utility) {
		this.driver = utility.GetDriver();
	}
	
	@Test
	public void CountActions() {
		System.out.println("Hello");
	}
	


}
