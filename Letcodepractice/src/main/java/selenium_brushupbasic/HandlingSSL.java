package selenium_brushupbasic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingSSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option= new ChromeOptions();
		option.setAcceptInsecureCerts(true); //Accepts SSL Certificate
		
		WebDriver driver = new ChromeDriver(option);
		// ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://expired.badssl.com/");
		System.out.println("Title of the Page is: "+driver.getTitle());  //Privacy error
	}

}
