package selenium_brushupbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement launch = driver.findElement(By.name("q"));
		launch.sendKeys("Gangai");
		Thread.sleep(3000);
		launch.click();

		System.out.println("Search is completed successfully");

	}

}
