package TestNG;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class DependsOnGroups {

    @Test(groups = {"Laptop Group"})
	public void A1() {
		System.out.println("Laptop Group 1");
		
	}
    @Test(dependsOnGroups = {"Laptop Group"})
	public void A2() {
		System.out.println("Laptop Group 2");
	}
	
	
    @Test(groups= {"Mobile Group"})
	public void A3() {
		System.out.println("Mobile Group 1");
	}
	
    
    @Test(dependsOnGroups= {"Mobile Group"})
	public void A4() {
		System.out.println("Mobile Group 2");
	}
    
    
    @Test(dependsOnGroups= {"Mobile Group"})
	public void A5() {
		System.out.println("Mobile Group 3");
	}
    
}
