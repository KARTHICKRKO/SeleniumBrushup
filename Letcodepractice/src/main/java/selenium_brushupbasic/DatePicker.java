package selenium_brushupbasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void SelectingPastDate(WebDriver driver, String month, String year, String date) {

		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		while (true) {
			String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();// actual
																													// month
			String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();// actual
																												// year

			if (currentmonth.equals(month) && currentyear.equals(year)) {
				break;
			}
			// driver.findElement(By.cssSelector("a[title='Next']")).click(); //next year
			// moving forward
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		List<WebElement> alldates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

		for (WebElement dt : alldates) {
			if (dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
	}
	public static void SelectingFutureDate(WebDriver driver, String month, String year, String date) {

		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		while (true) {
			String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();// actual
																													// month
			String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();// actual
																												// year

			if (currentmonth.equals(month) && currentyear.equals(year)) {
				break;
			}
			// driver.findElement(By.cssSelector("a[title='Next']")).click(); //next year
			// moving forward
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		List<WebElement> alldates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

		for (WebElement dt : alldates) {
			if (dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);

		// Method1: Using Sendkeys
		// driver.findElement(By.id("datepicker")).sendKeys("03/20/2025"); // MM/DD/YYYY

		// Method2: Using the datepicker (expected data)

	

		SelectingPastDate(driver, "March", "2019", "21");

	}

}
