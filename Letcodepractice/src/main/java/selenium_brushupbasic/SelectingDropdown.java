package selenium_brushupbasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		WebElement drpcountryEl = driver.findElement(By.xpath("//select[@id='country']"));
		// By using Select class

		Select drpcountry = new Select(drpcountryEl);

		// select option from the dropdown
		
		// drpcountry.selectByVisibleText("Japan");
		// drpcountry.selectByValue("uk");
		//drpcountry.selectByIndex(6);
		
		//capture the options from the dropdown
		
		List<WebElement> options=drpcountry.getOptions();
		System.out.println("Number of options in the dropdown :" +options.size());
		
		//printing the options using normal for loop
		/*
		 * for(int i=0;i<options.size();i++) {
		 * System.out.println(options.get(i).getText()); }
		 */
		//printing the options using enhanced for loop
		for(WebElement op:options) {
			System.out.println(op.getText());
		}
		
	}

}
