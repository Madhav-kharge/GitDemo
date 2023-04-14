package TestNG;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginPage {
 
	WebDriver driver;
	
	
	
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/madhavkharge/Downloads/chromedriver");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.get("http:/www.google.com/");
	   }
	
	@Test(priority = 2,groups = "Title",alwaysRun = true)
	public void GoogleTitleTest() {
		String Title =driver.getTitle();
		System.out.println(Title);
	  }
	
	@Test(priority = 1,groups = "Title")
	public void GmaillinkTest() {
		boolean b= driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	
	@Test(priority = 5,groups = "link")
	public  void Test3() {
		System.out.println("Test3");
	}
	
	@Test(priority = 4,groups = "logo" )
	public void Test4() {
		System.out.println("Test4");
	}
	
	@Test(priority = 3,groups = "Test")
	public void Test5() {
		System.out.println("Test5");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
