package TestNG;

import org.testng.annotations.Test;

public class DependsONMethod {

	@Test
	 public void login(){
		System.out.println("Login Test");
		int  a=9/0;
	}
	
	@Test(dependsOnMethods = "login")
	 public void RegPage(){
		System.out.println("RegPage ");
	}
	
	@Test(dependsOnMethods = "login")
	 public void HomePage(){
		System.out.println("HomePage");
	}
	 
	 @Test(dependsOnMethods = {"login"})
	public void SearchPage() {
		System.out.println("Search Page");
	}
	
}
