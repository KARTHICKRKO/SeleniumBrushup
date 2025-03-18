package selenium_brushupbasic;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handlealertusingexplicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(10)); //explicit wait declaration
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.
				  xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
		//Explicit condition
		Alert myalert=mywait.until(ExpectedConditions.alertIsPresent()); // capture alert
		
		System.out.println("Alert text is :" + myalert.getText());
		myalert.accept();
		
	}

}
