package selenium_brushupbasic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabandWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/");

		//Selenium 4.x
		driver.switchTo().newWindow(WindowType.TAB); // opens new Tab

		//driver.switchTo().newWindow(WindowType.WINDOW); //opens in new window
		driver.get("https://www.orangehrm.com/");

	}

}
