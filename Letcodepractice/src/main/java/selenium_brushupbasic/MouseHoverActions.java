package selenium_brushupbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement Selenium=driver.findElement(By.xpath("//a[@class='dropdown-toggle'][normalize-space()='Selenium']"));
		Selenium.click();
		WebElement Mac=driver.findElement(By.xpath("//a[normalize-space()='Table Demo']"));
		
		//Now using Actions class
		Actions action= new Actions(driver);
		//action.moveToElement(Mac).click().build().perform();
		
		action.moveToElement(Mac).click().perform();
	}

}
