package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;
	

	public void setup() {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/madhavkharge/Downloads/chromedriver");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http:/www.google.com/");
	}
	 
    @Test
    public void googletitletest() {
	   String title = driver.getTitle();
	   System.out.println(title);
	   Assert.assertEquals(title,"Google");
     }
 	@Test
 	public void googlelogotest() {
	boolean b= driver.findElement(By.xpath("//*[@id='logo']")).isDisplayed();
		Assert.assertTrue(b);
	}
	
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}
//	
}
