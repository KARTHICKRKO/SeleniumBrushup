package selenium_brushupbasic;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicealert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		// Normal Alert with Ok button
		WebElement signin = driver.findElement(By.xpath("//input[@title='Sign in']"));
		signin.click();

		Alert myalert1 = driver.switchTo().alert();
		Thread.sleep(5000);
		System.out.println("Alert Text message is: " + myalert1.getText());
		myalert1.accept();

	}

}
