package selenium_brushupbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.AllArguments;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		// ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		WebElement inputbox = driver.findElement(By.xpath("//input[@id='name']"));

		JavascriptExecutor js = (JavascriptExecutor) driver; // indirect approach
		// JavascriptExecutor js=driver; // direct approach (parent class object=child
		// class object)
		// Passing the text into inputbox -- this is alternative of sendkeys()
		js.executeScript("arguments[0].setAttribute('value','Kamali')", inputbox);

		// Clicking the radiobutton webelement-- this is alternative of direct click()
		WebElement radiobtn = driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()", radiobtn);

	}

}
