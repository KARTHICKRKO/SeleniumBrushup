package dataDriventesting;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculatorDDT {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(
				"https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");

		String filepath = System.getProperty("user.dir") + "\\testdata\\Calc.xlsx";
		int row = ExcelUtils.getRowcount(filepath, "Sheet1");

		for (int i = 1; i <= row; i++) {
			// 1. Read data from Excel

			String pricipal = ExcelUtils.getCellData(filepath, "Sheet1", i, 0);
			String roi = ExcelUtils.getCellData(filepath, "Sheet1", i, 1);
			String peroid1 = ExcelUtils.getCellData(filepath, "Sheet1", i, 2);
			String period2 = ExcelUtils.getCellData(filepath, "Sheet1", i, 3);
			String frequency = ExcelUtils.getCellData(filepath, "Sheet1", i, 4);
			String exp_mval = ExcelUtils.getCellData(filepath, "Sheet1", i, 5);

			// 2.Passing above data into application

			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(pricipal);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(roi);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(peroid1);
			Select peroidrp = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			peroidrp.selectByVisibleText(period2);
			Select freq = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			freq.selectByVisibleText(frequency);

			driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click(); // clicked on caculate button

			// 3.Validation against expected vs actual result

			String actual_mval = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			if (Double.parseDouble(actual_mval) == Double.parseDouble(exp_mval)) {
				System.out.println("Test is Passed");
				ExcelUtils.setCellData(filepath, "Sheet1", i, 7, "Passed");
				ExcelUtils.fillGreenColor(filepath, "Sheet1", i, 7);
			} else {
				System.out.println("Test is Failed");
				ExcelUtils.setCellData(filepath, "Sheet1", i, 7, "Failed");
				ExcelUtils.fillRedColor(filepath, "Sheet1", i, 7);
			}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@class='PL5']")).click();
		} // ending of the for loop
		driver.quit();

	}

}
