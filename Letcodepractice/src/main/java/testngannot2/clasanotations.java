package testngannot2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class clasanotations {

	@Test
	void xyz() {
		System.out.println("This test is from this class");
	}
	@BeforeTest
	void Beforets() {
		System.out.println("This is from before test");
	}
}
