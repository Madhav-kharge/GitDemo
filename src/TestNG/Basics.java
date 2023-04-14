package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basics {
// Out Put
//	@BeforeSuite --- setup system property for chrome
//	@BeforeTest --- Enter login
//	@BeforeClass --- launch Browser
	
//	@BeforeMethod --- Enter URL
//	Test Case 1 --- Google title test
//	@AfterMethod---logout from app

//	@BeforeMethod --- Enter URL
//	Test Case 2 --- Search
//	@AfterMethod---logout from app

//	AfterClass---Close browser
//	AfterTest---delete all cookies
	
	//PreCondititon Annotation Starting with @Before Keyword
	
	@BeforeSuite//1
	public void setup() {
		System.out.println("@BeforeSuite --- setup system property foe chrome");
	}
	
	
	@BeforeTest//2
	 public void login(){
		System.out.println("@BeforeTest --- Enter login");
	}
	
	@BeforeClass//3
	public void LaunchBrowser() {
	 System.out.println("@BeforeClass --- launch Browser");
	}
	
 /*	TC Always  Runs on follwing  Sequence
	BeforeMethod
	Test -1
	AfterMethod
	

	BeforeMethod
	Test -2
	AfterMethod
*/	
	
	@BeforeMethod//4
	public void EnterUrl() {
		System.out.println("@BeforeMethod --- Enter URL");
	}
	
	
   //Test Case starting with @Test Annotation
	
	@Test//5                                             
	public void googletitleTest() {                   
	  System.out.println("Test Case 1 --- Google title test");       
	}                                                
	
                                                   
	@Test
	public void search() {
		System.out.println("Test Case 2 --- Search");
	}
	//Post Condition starting with @After
	
	
	@AfterMethod//6
	public void logout(){
	System.out.println("@AfterMethod---logout from app");
	}
	
	
	@AfterClass//7
	public void closebrowser() {
		System.out.println("AfterClass---Close browser");
	}
	
	
	@AfterTest//8
	public void deleteallcookies() {
		System.out.println("AfterTest---delete all cookies");
	}
	
//	@AfterSuite
//	public void generatetestReport() {
//	System.out.println("Generate Test Report");
//	}
	
	
}
