package selenium_brushupbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");

		// Using Actions Class
		Actions act = new Actions(driver);
		// Minimum Slider
		WebElement min_slider = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		System.out.println("Default Location of the min_slider :" + min_slider.getLocation());// (59,249) (x,y)

		act.dragAndDropBy(min_slider, 130, 249).perform();
		System.out.println("Location of the min_Slider after moving :" + min_slider.getLocation()); // (189,249)

		// Maximummum Slider
		WebElement max_slider = driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
		System.out.println("Default Location of the max_slider :" + max_slider.getLocation());// (510,249) (x,y)

		act.dragAndDropBy(max_slider, -50, 249).perform();
		System.out.println("Location of the max_Slider after moving :" + max_slider.getLocation()); //(460,249)
	}

}
