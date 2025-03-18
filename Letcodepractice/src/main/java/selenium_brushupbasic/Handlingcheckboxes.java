package selenium_brushupbasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingcheckboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		// 1.specific checkbox selection
		// driver.findElement(By.xpath("//label[@for='sunday']")).click();

		// 2. Selecting all Checkboxes
		List<WebElement> Checkboxes = driver
				.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		//Normal for loop
		/*
		 * for(int i=0;i<Checkboxes.size();i++) { Checkboxes.get(i).click(); }
		 */
		
		//Enhanced for loop
		/*
		 * for(WebElement checkbox:Checkboxes) { checkbox.click(); }
		 */
		
		//Condition based to select only last 3 checkboxes
		//Formula: Total no of checkboxes-how many checkboxes want to select=starting index
		//Eg: 7-3=4
		/*
		 * for(int i=4;i<Checkboxes.size();i++) { Checkboxes.get(i).click();
		 * 
		 * }
		 */
		
		//Condition based to select only first 3 checkboxes
		/*
		 * for(int i=0;i<=2;i++) { Checkboxes.get(i).click(); }
		 */
		
		//Unselect Checkboxes if they are selected
		Thread.sleep(3000);
		for(int i=0;i<3;i++) {
			Checkboxes.get(i).click();
		}
		
		Thread.sleep(6000);
		//After sometime it will unselect the selected checkboxes
		for(int i=0;i<Checkboxes.size();i++) {
			if(Checkboxes.get(i).isSelected()) {
				Checkboxes.get(i).click();
			}
		}
			
		System.out.println("Selection of specific checkboxes done successfully");
	}

}
