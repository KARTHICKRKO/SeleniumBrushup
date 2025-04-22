package selenium_brushupbasic;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;//
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class EnableExtensionsAtRunTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		File file = new File("C:\\Users\\karthick.r\\Automation Extension Files\\Datalayer.crx");
		option.addExtensions(file);

		WebDriver driver = new ChromeDriver(option);
		driver.get("https://text-compare.com/");

	}

}
