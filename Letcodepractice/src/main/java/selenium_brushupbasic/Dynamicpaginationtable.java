package selenium_brushupbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicpaginationtable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://getdstv-uat-headless.dstv.com/login?ReturnUrl=%2Fadmin");

		// Login details
		WebElement username = driver.findElement(By.xpath("//input[@id='Email']"));
		username.sendKeys("admin@yourstore.com");

		WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
		password.sendKeys("admin@123");

		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
		button.click();

		driver.findElement(By.xpath("//a[@href='#']//p[contains(text(),'Customers')]")).click(); // customer main menu
		driver.findElement(By.xpath("//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")).click(); // customer
																													// sub
		// 1. Finding total no of pages // menu
		String text = driver.findElement(By.xpath("//div[contains(text(),'1-15 of 43 items')]")).getText();
		String totalItems = text.substring(text.indexOf("of") + 3, text.indexOf("items")).trim();
		int total_page = (int) Math.ceil(Integer.parseInt(totalItems) / 15.0);
		System.out.println("Number of pages is: " + total_page);

		// 2.Repeating the pages
		for (int p = 1; p <= total_page; p++) {
			if (p > 1) {
				WebElement activepage = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()=" + p + "]"));
				activepage.click();
				Thread.sleep(3000);

			}
			// 3.Reading data from the pages.
			int noofrows = driver
					.findElements(By.xpath("//table[contains(@class,'table table-bordered table-hover')]//tbody//tr"))
					.size();

			for (int r = 1; r <= noofrows; r++) {
				String CustmerEmail = driver.findElement(By.xpath(
						"//table[contains(@class,'table table-bordered table-hover')]//tbody//tr[" + r + "]//td[2]"))
						.getText();

				String CustmerName = driver.findElement(By.xpath(
						"//table[contains(@class,'table table-bordered table-hover')]//tbody//tr[" + r + "]//td[3]"))
						.getText();

				String Createddate = driver.findElement(By.xpath(
						"//table[contains(@class,'table table-bordered table-hover')]//tbody//tr[" + r + "]//td[7]"))
						.getText();

				System.out.println(CustmerEmail + "\t" + CustmerName + "\t" + Createddate);

			}
		}

	}

}
