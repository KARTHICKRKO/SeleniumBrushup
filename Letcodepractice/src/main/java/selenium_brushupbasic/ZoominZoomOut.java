package selenium_brushupbasic;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoominZoomOut {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().window().maximize();
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='50%'");  //set Zoom level to 50%
		Thread.sleep(3000);
		js.executeScript("document.body.style.zoom='80%'");  //set Zoom level to 80%
		Thread.sleep(3000);
	}

}
