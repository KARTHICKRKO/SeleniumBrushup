package selenium_brushupbasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeHiddendrp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");

		// Login steps

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		// clicking on PIM
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();

		// clicking on dropdown
		driver.findElement(
				By.xpath("//div[@class='oxd-select-text-input' and normalize-space()='-- Select --']\r\n" + ""))
				.click();

		// selecting specific option from the dropdown

		// WebElement selectedoption =
		// driver.findElement(By.xpath("//label[text()='Employment
		// Status']/following::div[contains(@class,'oxd-select-text')][1]"));
		// selectedoption.click();
		// System.out.println("Specific option is selected");

		// counting the number of options
		List<WebElement> alloptions = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println("Total no. of options: " + alloptions.size());

		// printing all the options
		for (WebElement option : alloptions) {
			System.out.println("Displaying all options :" + option.getText());

		}
	}

}
