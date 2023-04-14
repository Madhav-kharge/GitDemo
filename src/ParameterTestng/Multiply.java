package ParameterTestng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multiply {
	@Test
    @Parameters({"a","b"})

    public void mul(int c, int d) {
	int Mul=c*d;
	System.out.println("MUltification of nos== "+Mul);
   
	}
}
