package Parameter.TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Vegetable {
	
	@Test
	@Parameters("ladyfinger")
	public void mango(String l) {
	System.out.println("ladyfinger");	
		System.out.println(l);
	}
	
	@Test
	@Parameters("flower")
	public void orange(String f) {	
		System.out.println(f);
	}
}
