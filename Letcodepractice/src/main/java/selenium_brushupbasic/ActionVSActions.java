package selenium_brushupbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionVSActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement rightclick = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));

		// Using Actions Class

		Actions act = new Actions(driver);
		Action myaction=act.build();// Building/creating an action and storing into action type of variable
		myaction.perform();//performing/completing the action

	}

}
