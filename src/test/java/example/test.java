package example;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {

	@Test
	public void testing() {
		System.out.println("Test");
	}
	
	@BeforeTest
	public void before() {
		System.out.println("Before");
	}

}
