package TestNG;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount = 5)
	 public void add(){
		int a=10;
		int b =9;
		int c;
		c=a+b;
		System.out.println("sum is " +c);
	}
	

}
