package selenium_brushupbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollingpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver; // indirect approach

		// 1.Specifying the pixel range for scrolling down
		// js.executeScript("window.scrollBy(0,1500)", "");

		// verifying the pixel range exactly it's scroll down or not
		// System.out.println(js.executeScript("return window.pageYOffset;"));

		// 2. Scroll the page till the element is visible
		// WebElement elem =
		// driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
		// js.executeScript("arguments[0].scrollIntoView()", elem);
		// System.out.println(js.executeScript("return window.pageYOffset;"));

		// 3. Scroll till the end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));

		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}

}
