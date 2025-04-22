package selenium_brushupbasic;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenthelinkinNewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");

		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		// RegLink.click();

		// Using Actions Class
		Actions act = new Actions(driver);

		// Control+RegLink
		act.keyDown(Keys.CONTROL).click(LoginLink).keyUp(Keys.CONTROL).perform();

		// Switching to the RegLink page
		List<String> pageids = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(pageids.get(1)); //switching to the login page
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin@yourstore.com");
		//driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("admin@123");
		//driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		
		//Again Switching back to Homepage
		driver.switchTo().window(pageids.get(0));
		
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Mobile");
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();

	}

}
