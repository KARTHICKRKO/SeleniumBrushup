package selenium_brushupbasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddendropdown {

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
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]"))
				.click();

		// selecting single option from the dropdown
		//driver.findElement(By.xpath("//span[normalize-space()='Financial Analyst']")).click();
		//System.out.println("Single option is selected");

		// counting the number of options
		List<WebElement>options=driver.findElements(By.xpath("//div[@role='listbox']//span"));
		
		System.out.println("\"Number of options displayed in the dropdown:" + options.size());
		
		
		//printing all the options
		for(WebElement op:options) {
			System.out.println("Name of all the options displayed: "+op.getText());	
			
			
		}
		
	}

}
