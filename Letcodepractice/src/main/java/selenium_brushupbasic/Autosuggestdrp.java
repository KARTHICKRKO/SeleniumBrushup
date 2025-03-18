package selenium_brushupbasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Autosuggestdrp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		// Open URL
		driver.get("https://www.google.com/");

		// Maximize browser window
		driver.manage().window().maximize();

		// Enter text in the search box
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Selenium tutorial");

		// Wait for suggestions to load
		Thread.sleep(2000);

		// Locate all suggestions
		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role='listbox']//li//span"));

		// Print total number of suggestions
		System.out.println("Total Suggestions: " + suggestions.size());

		// Print all suggestions
		for (WebElement suggestion : suggestions) {
			System.out.println(suggestion.getText());
		}

		// Select a specific suggestion (e.g., 3rd suggestion)
		if (suggestions.size() >= 3) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", suggestions.get(2));
			// Selecting the 3rd option
		} else {
			System.out.println("Not enough suggestions available.");
		}

		System.out.println("Selected option is clicked and redirected");

		// Close the browser
		driver.quit();
	}

}
