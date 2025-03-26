package selenium_brushupbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeDragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement source1=driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		WebElement Target1=driver.findElement(By.xpath("//ol[@id='bank']"));
		WebElement source2=driver.findElement(By.xpath("//section[@id='g-container-main']//li[1]//a[1]"));
		WebElement Target2=driver.findElement(By.xpath("//ol[@id='amt7']"));
		
		//Using Actions Class
				Actions act= new Actions(driver);
				act.dragAndDrop(source1, Target1).perform();
				act.dragAndDrop(source2, Target2).perform();

	}

}
