package TestNG;

import org.testng.annotations.Test;

public class Enable {

// The Enable attribute contains boolean value.By default its value is true
// If you want skip some  test methods ,then you need to explicitly  specify 'false'value
	
	@Test(enabled = false)
	public void a() {
		System.out.println("a Method");
	}
	
	@Test
	public void b() {
		System.out.println("b Method");
	}
	@Test
	public void c() {
		System.out.println("c Method");
	}
}
