package TestNG;

import org.testng.annotations.Test;

public class Description {
     
	@Test(  description = "Hello Test 1")
	public void Test1() {
		System.out.println("Test 1");
	}
	
	@Test(description = "Hello Test 2")
	public void Test2() {
		System.out.println("Test 2");
	}
	
	@Test(description = "Hello Test 3")
	public void Test3() {
		System.out.println("Test 3");
	}
}
