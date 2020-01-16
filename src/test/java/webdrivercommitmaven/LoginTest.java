package webdrivercommitmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
		driver=new ChromeDriver();
	
	}
	
	@Test
		public void doLogin() {
			driver.get("http://gmail.com");
			driver.findElement(By.id("Email")).sendKeys("trainer@way2automation.com");
		driver.findElement(By.id("Passwd")).sendKeys("sddsfd");
	}
		
		@AfterSuite
		public void tearDown() {
			driver.quit();
		}
		
		
	}

