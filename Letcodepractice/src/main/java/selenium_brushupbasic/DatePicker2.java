package selenium_brushupbasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		String requiredyear = "2020";
		String requiredmonth = "Mar";
		String requireddate = "21";

		driver.findElement(By.xpath("//input[@id='txtDate']")).click();
		//Selecting year
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));

		Select yr = new Select(year);
		yr.selectByVisibleText(requiredyear);
		//Selecting Month
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));

		Select mtm = new Select(month);
		mtm.selectByVisibleText(requiredmonth);
		
		//Selecting Date
		List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement date:alldates) {
			if(date.getText().equals(requireddate)) {
				date.click();
				break;
				
			}
		}

	}

}
