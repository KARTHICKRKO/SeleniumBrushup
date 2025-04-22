package selenium_brushupbasic;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");

		int noofbrokenlinks = 0;
		// capture all the links from the website
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		System.out.println("Total no of links is :" + alllinks.size());

		// 1. Checking if the value attribute of href is null or empty
		for (WebElement link : alllinks) {
			String hreattrval = link.getAttribute("href");
			if (hreattrval == null || hreattrval.isEmpty()) {
				System.out.println("href attribute value is null or empty.So not possible to check");
				continue;
			}
			// 2. Hit the URL to the server
			try {
				URL url = new URL(hreattrval); // converting href value from String value to URL format
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();// establishing connec to server
				connection.connect(); // connected to the server and sent request to the server

				if (connection.getResponseCode() >= 400) {
					System.out.println(hreattrval + "------->Broken link is present");
					noofbrokenlinks++;
				} else {
					System.out.println(hreattrval + "------->Broken link is not present");
				}
			} catch (Exception e) {
			}
		}
		System.out.println("No of Broken links is " + noofbrokenlinks);
	}

}
