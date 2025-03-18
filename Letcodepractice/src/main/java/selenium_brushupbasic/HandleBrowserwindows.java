package selenium_brushupbasic;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserwindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

		Set<String> windowIds = driver.getWindowHandles();
		// changing Set collection to List Collection because set collection doesn't
		// have get method
		//List<String> windowlist = new ArrayList(windowIds);

		//Approach1
		/*
		 * String parentid = windowlist.get(0); String childid = windowlist.get(1); //
		 * switch to child window driver.switchTo().window(childid);
		 * System.out.println(driver.getTitle());
		 * 
		 * // switch to Parent window driver.switchTo().window(parentid);
		 * System.out.println(driver.getTitle());
		 */
		
		//Approach 2-- Looping statement for multiple browser windows
		//Enhanced for loop
		for(String winid:windowIds) {
			String title=driver.switchTo().window(winid).getTitle();
			if(title.equals("OrangeHRM")) {
				System.out.println(driver.getCurrentUrl());
				//some validations on the parent window
			}
		}
		
	}

}
