package selenium_brushupbasic;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closingspecificbrowser2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		// finding the search box
		WebElement searchid = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		searchid.sendKeys("selenium");
		WebElement searchbtn=driver.findElement(By.xpath("//input[@type='submit']"));
		searchbtn.click();
		//Counting the list of dropdowns
		List<WebElement> totallinks=driver.findElements(By.xpath("(//div[@class='wikipedia-search-results']/div)"));
		System.out.println("Number of links displayed: " + totallinks.size());
		
		//Clicking on each link and verifying
		WebElement linktext1=driver.findElement(By.xpath("//a[text()='Selenium']"));
		linktext1.click();
		WebElement linktext2=driver.findElement(By.xpath("//a[text()='Selenium in biology']"));
		linktext2.click();
		WebElement linktext3=driver.findElement(By.xpath("//a[text()='Selenium (software)']"));
		linktext3.click();
		WebElement linktext4=driver.findElement(By.xpath("//a[text()='Selenium disulfide']"));
		linktext4.click();
		WebElement linktext5=driver.findElement(By.xpath("//a[text()='Selenium dioxide']"));
		linktext5.click();
		
		//Using Enhanced forloop
		
		Set<String> windowIds = driver.getWindowHandles();
		for(String windid:windowIds) {
			String title=driver.switchTo().window(windid).getTitle();
				System.out.println(title);
				if(title.equals("Selenium - Wikipedia") || title.equals("Selenium in biology - Wikipedia")
						|| title.equals("Selenium disulfide - Wikipedia")) {
					driver.close();
					System.out.println("Child browser window is closed successfully");
	}
	}
	}
}
