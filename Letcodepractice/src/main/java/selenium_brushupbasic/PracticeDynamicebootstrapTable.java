package selenium_brushupbasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeDynamicebootstrapTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// Login into website
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.linkText("Admin")).click();

		// 1. Finding total no of pages // menu
		List<WebElement> allpages = driver.findElements(By.xpath("//div[@role='table']"));
		int pagesize = allpages.size();
		System.out.println("Size of the page is :" + pagesize);

		
		//2. Reading all the datas from the table
		List<WebElement> rows = driver.findElements(
				By.xpath("//div[@role='table']//div[@role='row' and contains(@class, 'oxd-table-row--with-border')]"));

		for (WebElement row : rows) {
			String username = row.findElement(By.xpath(".//div[2]")).getText();
			String employeeName = row.findElement(By.xpath(".//div[4]")).getText();

			System.out.println("Username: " + username + ", Employee Name: " + employeeName);
		}

	}

}
