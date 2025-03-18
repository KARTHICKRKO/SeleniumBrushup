package selenium_brushupbasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeCheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		// 1.Selecting all Checkboxes
		/*
		 * List<WebElement> checkboxes=driver.findElements(By.xpath(
		 * "//table[@id='productTable']//tbody//tr//td[4]//input[@type='checkbox']"));
		 * 
		 * //using Normal for loop
		 * 
		 * for(int i=0;i<checkboxes.size();i++) { checkboxes.get(i).click(); }
		 * System.out.println("All Checkboxes in the page are selected"); }
		 */

		// 2.Selecting specific Checkbox
		/*
		 * driver.findElement(By.xpath("//tbody/tr[2]/td[4]/input[@type='checkbox']")).
		 * click(); System.out.println("Selecting specific checkbox in the page");
		 */

		// 3.Condition based to select only last 3 checkboxes
		// Formula: Total no of checkboxes-how many checkboxes want to select=starting
		// index
		// Eg: 5-3=2
		//List<WebElement> checkboxes = driver
				//.findElements(By.xpath("//table[@id='productTable']//tbody//tr//td[4]//input[@type='checkbox']"));
		
		/*
		 * for(int i=2;i<checkboxes.size();i++) { checkboxes.get(i).click(); }
		 * System.out.println("Selected only last 3 checkboxes");
		 */
		
		//Condition based to select only first 2 checkboxes
		/*
		 * for(int i=0;i<=1;i++) { checkboxes.get(i).click(); }
		 * System.out.println("Selected only first 2 checkboxes");
		 */
		//Unselect Checkboxes if they are selected
		/*Thread.sleep(5000);
		for(int i=0;i<=2;i++) { checkboxes.get(i).click(); }
		//After sometime it will unselect the selected checkboxes
		Thread.sleep(5000);
		for(int i=0;i<checkboxes.size();i++) {
			if(checkboxes.get(i).isSelected()) {
				checkboxes.get(i).click();
			
			}
		}*/
	//	System.out.println("Unselect the selected checkboxes");
		
		// Selecting radio button
			WebElement radiobtn=driver.findElement(By.xpath("//input[@id='male']"));
			radiobtn.click();
			System.out.println("Radio button is selected");
		
	}
}
