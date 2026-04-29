package testNGPratice;

import org.testng.annotations.Test;

public class Testing {

	@Test(priority = 2)
	public void m1() {
		System.out.println("Hi");

	}

	@Test(priority = 1)
	public void m2() {
		System.out.println("Hello");
	}

}
