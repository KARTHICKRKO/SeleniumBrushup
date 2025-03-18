package selenium_brushupbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeIframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		//Frame5
				WebElement frame5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
				driver.switchTo().frame(frame5);
				WebElement frinput5=driver.findElement(By.xpath("//input[@name='mytext5']"));
				frinput5.sendKeys("Viji");
				System.out.println("Frame5 is verified successfully");
				//Checking the link in frame5
				WebElement Frame5link=driver.findElement(By.xpath("//a[normalize-space()='https://a9t9.com']"));
				JavascriptExecutor js= (JavascriptExecutor)driver;
				js.executeScript("arguments[0].click()", Frame5link);
				//Frame5link.click();
				//driver.switchTo().defaultContent(); // go back to the main page
				
				//inner iframe - part of frame5
				//driver.switchTo().frame(0); // switching to iframe using index
				WebElement Logo=driver.findElement(By.cssSelector("img[alt='Ui.Vision by a9t9 software - Image-Driven Automation']"));
							
				System.out.println("Checking the logo presence :" + Logo.isDisplayed());
				driver.switchTo().defaultContent();
				driver.close();

	}

}
