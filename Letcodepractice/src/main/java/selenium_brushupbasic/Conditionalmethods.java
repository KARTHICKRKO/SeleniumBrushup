package selenium_brushupbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditionalmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//2. load the URL
		driver.get("https://demo.nopcommerce.com/register");
		//2a. Verify the title
		String verifytitle=driver.getTitle();
		System.out.println(verifytitle);
		
		//IsDisplayed()
		WebElement logo=driver.findElement(By.xpath("//div[@class='header-logo']/a"));
		boolean logodisplay=logo.isDisplayed();
		System.out.println(logodisplay);
		
		//IsEnabled()
		boolean inputsearch=driver.findElement(By.xpath("//input[@name='q']")).isEnabled();
		System.out.println("Search is Enabled: "+ inputsearch);
		
		//IsSelected()
		System.out.println("Before Selection");
		WebElement radio_male=driver.findElement(By.xpath("//input[@id='gender-male']"));
		System.out.println("Radio button is selected: "+ radio_male.isSelected());
		
		WebElement radio_female=driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println("Radio button is selected: "+ radio_female.isSelected());
		
		System.out.println("After Selection");
		radio_female.click();
		System.out.println("Radio button after selected: "+ radio_female.isSelected());
		
	}

}
