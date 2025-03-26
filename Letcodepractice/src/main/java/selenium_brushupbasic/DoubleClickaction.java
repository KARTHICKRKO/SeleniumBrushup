package selenium_brushupbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		//switching to Frame first
		
		driver.switchTo().frame("iframeResult");

		WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
		
		WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));

		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		box1.clear(); //clearing the box1
		box1.sendKeys("Dear Kamali!!!");
		
		//Using Actions Class performing Double click
		
		Actions act= new Actions(driver);
		act.doubleClick(button).perform();
		
		//validation: Box2 contains text of "Dear Kamali!!!"
		
		String text=box2.getAttribute("value");
		System.out.println("Captured text is :"+text);
		if(text.equals("Dear Kamali!!!")) {
			System.out.println("Text copied...");
		}else {
			System.out.println("Text not copied properly");
		}
		

	}

}
