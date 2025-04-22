package selenium_brushupbasic;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TakeScreenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		// ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");

		// 1. Full page screenshot

		/*
		 * TakesScreenshot ts= (TakesScreenshot) driver; File
		 * sourcefile=ts.getScreenshotAs(OutputType.FILE); File targetfile=new
		 * File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
		 * 
		 * sourcefile.renameTo(targetfile); // It copies the source file
		 */
		// 2.Capture the screenshot for a specific section
		/*
		 * WebElement featuredprd=driver.findElement(By.
		 * xpath("//div[@class='product-grid home-page-product-grid']"));
		 * 
		 * File sourcefile=featuredprd.getScreenshotAs(OutputType.FILE); // calling
		 * webElement interface which comes from the searchcontext and webdriver File
		 * targetfile=new
		 * File(System.getProperty("user.dir")+"\\screenshots\\featureproducts.png");
		 * 
		 * sourcefile.renameTo(targetfile); // It copies the source file
		 * 
		 * driver.quit();
		 */

		// 3. Capture the screenshot of webElement
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File Srcfile=logo.getScreenshotAs(OutputType.FILE);
		File Targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
		Srcfile.renameTo(Targetfile); // It copies the source file to target file
		driver.quit();

	}

}
