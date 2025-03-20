package selenium_brushupbasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeDynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		// 1. Finding total no of pages // menu
		List<WebElement> Pages = driver.findElements(By.xpath("//ul[@id='pagination']//li"));
		int total_page = Pages.size();
		System.out.println("Number of pages is :" + total_page);

		// 2.Repeating the pages
				for (int p = 1; p <= total_page; p++) {
					if (p > 1) {
						WebElement activepage = driver.findElement(By.xpath("//ul[@id='pagination']//*[text()=" + p + "]"));
						activepage.click();
						Thread.sleep(3000);
						
						// Click all checkboxes on the current page
						List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
						for(WebElement checkbox:checkboxes) {
							if(!checkbox.isSelected()) {
								checkbox.click();
							}
						}

					}
					// 3.Reading data from the pages.
					int noofrows = driver
							.findElements(By.xpath("//table[@id='productTable']//tbody//tr"))
							.size();
					for (int r = 1; r <= noofrows; r++) {
						String ID = driver.findElement(By.xpath(
								"//table[@id='productTable']//tbody//tr["+r+"]//td[1]"))
								.getText();

						String Name = driver.findElement(By.xpath(
								"//table[@id='productTable']//tbody//tr["+r+"]//td[2]"))
								.getText();

						String Price = driver.findElement(By.xpath(
								"//table[@id='productTable']//tbody//tr["+r+"]//td[3]"))
								.getText();
						System.out.println(ID + "\t" + Name + "\t" + Price);
					}
				}
	}

}
