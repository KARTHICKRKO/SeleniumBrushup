package selenium_brushupbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard_Actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");

		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Kamali");

		// Using Actions Class
		Actions act = new Actions(driver);
		// Ctrl+A //Selecting the text
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		// Ctrl+C //copy the text into clipboard
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		// TAB //shift to 2ndbox
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		// Ctrl+V //Paste the text
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
	}

}
