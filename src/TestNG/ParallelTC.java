package TestNG;

import org.testng.annotations.Test;

public class ParallelTC {

	@Test
	public void method1(){
		System.out.println("Inside method 1");
	}
	
	
	
	@Test
	public void method2(){
		System.out.println("Inside method2");
	}
}
