package selenium_brushupbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_StaticTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		// Open URL
		driver.get("https://blazedemo.com/");
		
		//selecting Departure 
		WebElement depart=driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select depart1= new Select(depart);
		depart1.selectByVisibleText("Boston");
		
		//selecting Arrival
		WebElement arrival=driver.findElement(By.xpath("//select[@name='toPort']"));
		Select arrival1= new Select(arrival);
		arrival1.selectByVisibleText("Dublin");
		
		//Click on Find button
		WebElement find=driver.findElement(By.xpath("//input[@value='Find Flights']"));
		find.click();
		
		//Find total no of rows in a table
		int row = driver.findElements(By.tagName("tr")).size(); // single table
		System.out.println("Number of rows:" + row);
		
			
		//Find total no of columnsin a table
		int colms=driver.findElements(By.tagName("th")).size(); //single table

		System.out.println("Number of columns :" + colms);
		
		// Read data from the specific row and column(ex: 3rd row 6th column)
		
		String chooseflight=driver.findElement(By.xpath("//table[@class='table']//tr[3]//td[6]")).getText();
		System.out.println("Lowest price for the flight is :" +chooseflight);
		
		//selecting this flight price and booking
		driver.findElement(By.xpath("//tbody/tr[3]/td[1]/input[1]")).click();
		
		//Entering all the details
		driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Karthick");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("VOC Street,Redhills");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("TamilNadu");
		driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("600052");
		driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("600052");
		
		//Selecting card type
		
		WebElement ca=driver.findElement(By.xpath("//select[@id='cardType']"));
		Select cardtype= new Select(ca);
		cardtype.selectByVisibleText("Visa");
		
		driver.findElement(By.id("creditCardNumber")).sendKeys("5642 7823 8973 8973");
		driver.findElement(By.id("nameOnCard")).sendKeys("Karthick Rajendran");
		driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
		
		WebElement button=driver.findElement(By.xpath("//input[@value='Purchase Flight']"));
		button.click(); //div//h1
		
		String Confirmationtext=driver.findElement(By.xpath("//div//h1")).getText();
		System.out.println("Booking flight confirmation message :" +Confirmationtext);
		
		Thread.sleep(3000);
		driver.close();
	}

}
