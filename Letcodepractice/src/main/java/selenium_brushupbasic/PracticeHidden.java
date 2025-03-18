package selenium_brushupbasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeHidden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		// counting the number of options
		List<WebElement> alloptions = driver.findElements(By.xpath("//select[@id='colors']//option[position()>0]"));
		System.out.println("Total no. of options: " + alloptions.size());

		// printing all the options
		for (WebElement option : alloptions) {
			System.out.println("Displaying all options :" + option.getText());

		}
		// Selecting multi select dropdown
		WebElement multiSelect = driver.findElement(By.id("colors"));
		// Create a Select object
		Select select = new Select(multiSelect);
		// Select multiple options
		select.selectByValue("green");
		select.selectByValue("yellow");
		select.selectByValue("red");
		select.selectByValue("white");
		System.out.println("Multi-selected dropdowns are selected");
	}

}
