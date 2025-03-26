package selenium_brushupbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.get("https://testautomationpractice.blogspot.com/");
		
	//WebElement Oslo=driver.findElement(By.xpath("//div[@id='box1']"));
	//WebElement Norway=driver.findElement(By.xpath("//div[@id='box101']"));
	
	WebElement source=driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
	WebElement Target=driver.findElement(By.xpath("//div[@id='droppable']"));
		//Using Actions Class
		Actions act= new Actions(driver);
		act.dragAndDrop(source, Target).perform();
		System.out.println(Target.getText());
		
		

	}

}
