package testngannot2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class clas2anotations {
	@Test
	void abc() {
		System.out.println("This test is from this class");
	}
	@AfterTest
	void Afterts() {
		System.out.println("This is from after test");
	}
}
