package testngannot2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Suitetest1 {
	
	@Test
	void class1() {
		System.out.println("this will be main class");
	}
	@BeforeSuite
	void befosut() {
		System.out.println("this will execute befosuie");
	}
	
	@AfterSuite
	void aftrsut() {
		System.out.println("this will execute afrsuie");
	}
}
