package TestNG;

import org.testng.annotations.Test;

public class Grouping {
     
	     @Test( priority = 3,     groups = {"sanity"})
	     public void testcase1() {
	    	 System.out.println("Test Case 1");
	     }
	
	
	     @Test( priority = 1,   groups = { "smoke","sanity"})
	     public void testcase2() {
	    	 System.out.println("Test Case 2");
	     }
	     
	     @Test(priority = 2,   groups = {"Regression"})
	     public void testcase3() {
	    	 System.out.println("Test Case 3");
	     }
}
