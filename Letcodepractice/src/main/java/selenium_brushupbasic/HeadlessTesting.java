package selenium_brushupbasic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--headless=new"); //setting for headless mode of execution
		
		WebDriver driver = new ChromeDriver(option);
		// ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		
		//validate title should be "Your Store"
		String title=driver.getTitle();
		if(title.equals("Your Store")) {
			System.out.println("Test is Passed");
		}else {
			System.out.println("Test is failed");
		}
		
		//Close the browser
		driver.close();

	}

}
