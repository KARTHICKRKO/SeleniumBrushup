package testngSessions;

import org.testng.annotations.Test;

//1.open application
//2.Login
//3.Logout
public class FirstTest {
	@Test(priority = -1)
	void launchapp() {
		System.out.println("Launching the application");
	}

	@Test(priority = 0)
	void loginapp() {
		System.out.println("Login into the application");
	}

	
	void logoutapp() {
		System.out.println("Logout from the application");
	}
}
