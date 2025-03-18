package selenium_brushupbasic;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class Fluentwaitdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//Fluent wait Declaration //Wait is an interface
		Wait<WebDriver> mywait= new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(10))
				.ignoring(NoSuchElementException.class);
		driver.manage().window().maximize();
		// 2. load the URL
		driver.get("https://letcode.in/");
		WebElement login = driver.findElement(By.linkText("Log in"));
		login.click();
		// 4. enter email id
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("koushik350@gmail.com");
		// 5. enter password
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Enter password']"));
		password.sendKeys("Pass123$");
		// 6. enter login btn

		WebElement loginbtn = driver.findElement(By.xpath("//button[.='LOGIN']"));
		loginbtn.click();
		
		WebElement signoutbtn=mywait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.linkText("Sign out"));
				
			}
		});
		 
		signoutbtn.click();
	}

}
