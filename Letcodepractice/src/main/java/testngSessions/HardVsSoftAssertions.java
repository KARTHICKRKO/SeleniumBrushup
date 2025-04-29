package testngSessions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {
	
	//@Test
	void Hardassertions_test() {
		System.out.println("Test1");
		System.out.println("Test2");
		
		Assert.assertEquals(1, 2); //Hard Assertion
		System.out.println("Test3");
		System.out.println("Test4");
	}
	@Test
	void softassertions_test() {
		System.out.println("Test1");
		System.out.println("Test2");
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(1, 2); // Soft Assertion
		
		
		System.out.println("Test3");
		System.out.println("Test4");
		sa.assertAll(); //mandatory
	}


}
