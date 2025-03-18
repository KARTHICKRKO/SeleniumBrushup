package selenium_brushupbasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeDrpdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");

		// counting the number of options for countries

		List<WebElement> options = driver.findElements(By.xpath("//select/option[position()>1]"));
		System.out.println("Number of options displayed : " + options.size());
		
		//Printing all the options displayed for countries
		for(WebElement op:options) {
			System.out.println("Displaying all the options :" + op.getText());
		}

		//Selecting specific option from the dropdown
		WebElement singleoption=driver.findElement(By.xpath("//select/option[position()>5]"));
		singleoption.click();
		System.out.println("Single option is selected");
		
		//Counting the no of options displayed for selected country
		List<WebElement> stateoptions=driver.findElements(By.xpath("//select[@id='state-list']/option[position()>1]"));
		System.out.println("Total Number of state options: " + stateoptions.size());
		
		//Printing all the options displayed for selected country
		for(WebElement state:stateoptions) {
			System.out.println("Name of the States : " + state.getText());
		}
		
		//Selecting specific state option from the dropdown
		WebElement selectedstate=driver.findElement(By.xpath("//select[@id='state-list']/option[text()='New York']"));
		selectedstate.click();
		System.out.println("Single State is selected");
		

	}

}
