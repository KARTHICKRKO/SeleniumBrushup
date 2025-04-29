package testngannotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*1.Login-- @BeforeMethod
2.Search-- @Test
3.Logout--- @AfterMethod
4.Login
5.Advanced Search
6.Logout*/
public class annotations1 {
	@BeforeMethod
	void login() {
		System.out.println("Login into the application");
	}

	@AfterMethod
	void logout() {
		System.out.println("Logout from the application");
	}

	@Test(priority = 1)
	void Search() {
		System.out.println("Search is done");
	}

	@Test(priority = 2)
	void Advancedsearch() {
		System.out.println("Advanced search is done");
	}

}
