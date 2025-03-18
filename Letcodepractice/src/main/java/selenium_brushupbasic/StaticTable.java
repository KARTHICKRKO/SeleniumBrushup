package selenium_brushupbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		// Open URL
		driver.get("https://testautomationpractice.blogspot.com/");

		// 1. Find total no of rows in a table
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); // multiple tables
		System.out.println("Number of rows:" + rows);

		// If u have single table then go for this approach.
		//int total = driver.findElements(By.tagName("tr")).size(); // single table
		//System.out.println("Number of rows:" + total);

		// 2. find total no of columns in a table
		int colms = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size(); // multiple tables
		// int colms=driver.findElements(By.tagName("th")).size(); //single table

		System.out.println("Number of columns :" + colms);

		// 3. Read data from the specific row and column(ex: 4th row 2nd column)
		/*
		 * String Bookauthor =
		 * driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]//td[2]")).
		 * getText(); System.out.println("Specific Book name is :" + Bookauthor); // 3A.
		 * Printing the first row header System.out.println("Bookname" + "\t" +
		 * "BookAuthor" + "\t" + "Domain" + "\t" + "Price"); // 4. Read all the data
		 * from rows and columns for (int r = 2; r <= total; r++) { for (int c = 1; c <=
		 * colms; c++) { String Bookvalue = driver
		 * .findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[" + c +
		 * "]")).getText(); System.out.print(Bookvalue + "\t"); // one tab space }
		 * System.out.println(); }
		 */

		// 4. Print Bookname whose author is "Mukesh" (Specific condition)
		/*for (int r = 2; r <= total; r++) {
			String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[2]")).getText();
			//System.out.println(author);
			if (author.equals("Amit")) {
				String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[1]"))
						.getText();
				System.out.println(bookname+"\t"+author);
			}
		}*/
		
		// 5. Find total price of all the books
		int total=0;
		for (int r = 2; r <= rows; r++) {
			String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[4]")).getText();
			total= total+Integer.parseInt(price);
			
	}
		System.out.println("Total Price of all the books is :" +total);
	}
}
