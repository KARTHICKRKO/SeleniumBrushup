package selenium_brushupbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://books-pwakit.appspot.com/");
		
		//This Element is inside single shadow DOM.
		//String cssSelectorForHost1 = "book-app[apptitle='BOOKS']";
		//Thread.sleep(1000);
		
		//Handle Shadow DOM Element
		SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();// Main host with shadow root
		Thread.sleep(1000);
		shadow.findElement(By.cssSelector("#input")).sendKeys("KAMALI");
		

	}

}
