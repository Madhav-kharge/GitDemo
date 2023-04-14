package TestNG;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Asseration {
WebDriver driver;
	
	
	
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/madhavkharge/Downloads/chromedriver 4");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.get("http:/www.google.com");
	   }
	
	@Test()
	public void GoogleTitleTest() {
		String Title =driver.getTitle();
		System.out.println(Title);
		
	    Assert.assertEquals("Google", "Google");
	  }
	
	@Test
	public void GmaillinkTest() {
		boolean b= driver.findElement(By.linkText("Gmail")).isDisplayed();
		
		Assert.assertEquals("Gmail", "Gmail");
	}

	
	@AfterMethod
	public void tesrDown() {
		driver.quit();
	}
	
	 
}
   