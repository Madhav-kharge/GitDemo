package TestNG;

import org.testng.annotations.Test;

public class TimeOuts {
  
	@Test//(timeOut = 3000)(timeOut = 1000) fail
	public void testcase1() throws InterruptedException {
		System.out.println("Tase case 1");
	        Thread.sleep(2000);
	}
	@Test
	public void testcase2() {
		System.out.println("Tase case 2");
	}
	
	@Test
	public void testcase3() {
		System.out.println("Tase case 3");
	}
}
