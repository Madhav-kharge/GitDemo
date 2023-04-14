package ParameterTestng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Subtract {
	 @Test
     @Parameters({"a","b"})
	
	 public void sub(int c, int d) {
	 int Sub=c-d;
     System.out.println("subtraction of nos ==" +Sub);
	}
}
