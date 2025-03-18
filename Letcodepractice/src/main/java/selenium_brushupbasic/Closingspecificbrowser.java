package selenium_brushupbasic;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closingspecificbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

		Set<String> windowIds = driver.getWindowHandles();
		
		for(String windid:windowIds) {
		String title=driver.switchTo().window(windid).getTitle();
			System.out.println(title);
			
			if(title.equals("Human Resources Management Software | OrangeHRM")) {
				driver.close();
				System.out.println("Child browser window is closed successfully");
				break;
			}
		}
	}

}
