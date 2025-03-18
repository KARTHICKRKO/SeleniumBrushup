package selenium_brushupbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLocatorsLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//1. launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//2. load the URL
		driver.get("https://letcode.in/");
		//2a. Verify the title
		String verifytitle=driver.getTitle();
		System.out.println(verifytitle);
		//2b.Verify the URL
		String VerifyURL=driver.getCurrentUrl();
		System.out.println(VerifyURL);
		//3. Click login btn
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
		//7. click on signout button
		
		WebElement signoutbtn=driver.findElement(By.xpath("//a[contains(@class,'button is-primary is-round')]"));
		Thread.sleep(5000);
		signoutbtn.click();
		//8. Verify the title
		WebElement titleverify=driver.findElement(By.xpath("//title[text()='LetCode with Koushik']"));
		String title=titleverify.getText();
		
				
		System.out.println(title);
		

	}

}
