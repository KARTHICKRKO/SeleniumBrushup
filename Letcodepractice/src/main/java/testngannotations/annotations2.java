package testngannotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*1.Login-- @Beforeclass
2.Search-- @Test
3.Advanced Search-- @Test
4.Logout--- @Afterclass*/
public class annotations2 {
	@BeforeClass
	void login() {
		System.out.println("Login into the application");
	}

	@AfterClass
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
