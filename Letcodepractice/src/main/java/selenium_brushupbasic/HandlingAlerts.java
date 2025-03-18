package selenium_brushupbasic;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		// Normal Alert with Ok button
		/*
		 * driver.findElement(By.
		 * xpath("//button[normalize-space()='Click for JS Alert']")).click();
		 * Thread.sleep(5000); Alert myalert=driver.switchTo().alert();
		 * System.out.println(myalert.getText()); myalert.accept();
		 */
		
		//2) confirmation Alert with ok/cancel button
		/*
		 * driver.findElement(By.
		 * xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		 * 
		 * Thread.sleep(3000); //driver.switchTo().alert().accept(); //alert ok to
		 * accept driver.switchTo().alert().dismiss(); //alert cancel to dismiss
		 */	
        //3) Prompt Alert-- Input Box and click on ok/cancel button
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert myalert=driver.switchTo().alert();
		myalert.sendKeys("Welcome");
		myalert.accept();
		
	}

}
