package groupingmethods;

import org.testng.annotations.Test;

public class Signupgrouping {
	
	@Test(priority = 1,groups = {"regression"})
	void emailsignup() {
		System.out.println("Email signup is successfull");
	}
	
	@Test(priority = 2,groups = {"regression"})
	void facebooksignup() {
		System.out.println("Facebook signup is successfull");
	}

	@Test(priority = 3,groups = {"regression"})
	void twittersignup() {
		System.out.println("Twitter signup is successfull");
	}
}
