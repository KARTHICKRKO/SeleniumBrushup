package groupingmethods;

import org.testng.annotations.Test;

public class Logingrouping {

	@Test(priority = 1,groups = {"sanity"})
	void loginbymail() {
		System.out.println("Email login is successfull");
	}
	
	@Test(priority = 2,groups = {"sanity"})
	void loginbyfacebook() {
		System.out.println("Facebook login is successfull");
	}
	
	@Test(priority = 3,groups = {"sanity"})
	void loginbytwitter() {
		System.out.println("Twitter login is successfull");
	}
}
