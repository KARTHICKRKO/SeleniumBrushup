package selenium_brushupbasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");

		// By using dynamic xpath
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();

		// 1.selecting single dropdown option
		// driver.findElement(By.xpath("//input[@value='Java']")).click();

		// 2. capture all the options and find out the size
		List<WebElement> alloptions = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println("Number of options displayed in dropdown: " + alloptions.size());

		// 3. Printing all options from the dropdown
		// Using Enhanced for loop
		/*
		 * for (WebElement op : alloptions) { System.out.println(op.getText()); }
		 */

		// 4. Select Multiple options
		// Using Enhanced for loop
		for (WebElement op : alloptions) {
			String option = op.getText();

			if (option.equals("Java") || option.equals("MySQL") || option.equals("Angular")) {
				op.click();
			}
		}
		System.out.println("Multiple options are selected");

	}

}
