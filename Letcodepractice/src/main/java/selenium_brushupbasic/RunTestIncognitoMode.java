package selenium_brushupbasic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunTestIncognitoMode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		//validate title should be "nopCommerce demo store. Home page title"
		String title=driver.getTitle();
		if(title.equals("nopCommerce demo store. Home page title")) {
			System.out.println("Test is Passed");
		}else {
			System.out.println("Test is failed");
		}
		
		//Close the browser
		driver.close();

	}

}
