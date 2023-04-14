package TestNG;

import org.testng.annotations.Test;

public class ExpectedException {
	 @Test(expectedExceptions=NumberFormatException.class)
	   public void test2() {
	   String a="10a";
	   Integer.parseInt(a);
	    }
}
