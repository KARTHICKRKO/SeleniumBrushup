package selenium_brushupbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		//Frame1
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1); //passed frame as a webelelement to switch to the frame
		
		WebElement frinput=driver.findElement(By.cssSelector("input[name='mytext1']"));
		frinput.sendKeys("Pooja");
		System.out.println("Frame1 is verified successfully");
		driver.switchTo().defaultContent(); // go back to the main page
		
		//Frame2
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2); //passed frame as a webelelement to switch to the frame
		WebElement frinput2=driver.findElement(By.xpath("//input[@name='mytext2']"));
		frinput2.sendKeys("Vasumathi");
		System.out.println("Frame2 is verified successfully");
		driver.switchTo().defaultContent(); // go back to the main page
		
		//Frame3
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		WebElement frinput3=driver.findElement(By.xpath("//input[@name='mytext3']"));
		frinput3.sendKeys("Viji");
		System.out.println("Frame3 is verified successfully");
		//driver.switchTo().defaultContent(); // go back to the main page
		
		//inner iframe - part of frame3
		driver.switchTo().frame(0); // switching to iframe using index
		WebElement radiobtn=driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", radiobtn);
		
		System.out.println("iFrame is verified successfully");
		driver.switchTo().defaultContent();
	}

}
