package selenium_brushupbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitwaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		//2. load the URL
		driver.get("https://letcode.in/");
		WebElement login=driver.findElement(By.linkText("Log in"));
		login.click();
		//4. enter email id
		WebElement username=driver.findElement(By.name("email"));
		username.sendKeys("koushik350@gmail.com");
		//5. enter password
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Enter password']"));
		password.sendKeys("Pass123$");
		//6. enter login btn
		
		WebElement loginbtn=driver.findElement(By.xpath("//button[.='LOGIN']"));
		loginbtn.click();
		WebElement signoutbtn=driver.findElement(By.xpath("//a[contains(@class,'button is-primary is-round')]"));
		
		signoutbtn.click();
	}

}
