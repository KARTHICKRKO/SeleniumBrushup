package dataDriventesting;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeDDT {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");

		String filepath = System.getProperty("user.dir") + "\\testdata\\Calc2.xlsx";
		int row = ExcelUtils.getRowcount(filepath, "Sheet1");

		for (int i = 1; i <= row; i++) {
			// 1. Read data from Excel

			String InitDepAmt = ExcelUtils.getCellData(filepath, "Sheet1", i, 0);
			String Length = ExcelUtils.getCellData(filepath, "Sheet1", i, 1);
			String Interestrt = ExcelUtils.getCellData(filepath, "Sheet1", i, 2);
			String Compound = ExcelUtils.getCellData(filepath, "Sheet1", i, 3);
			String Exp_val = ExcelUtils.getCellData(filepath, "Sheet1", i, 4);

			// 2.Passing above data into application

			WebElement DepositAmout = driver.findElement(By.xpath("//input[@id='mat-input-0']"));
			DepositAmout.clear();
			DepositAmout.sendKeys(InitDepAmt);
			WebElement leng = driver.findElement(By.xpath("//input[@id='mat-input-1']"));
			leng.clear();
			leng.sendKeys(Length);
			WebElement interst = driver.findElement(By.xpath("//input[@id='mat-input-2']"));
			interst.clear();
			interst.sendKeys(Interestrt);
			// Step 1: Click the mat-select dropdown
			driver.findElement(By.xpath("//mat-select[@formcontrolname='cdCompounding']")).click();

			// Step 2: Choose the option dynamically
			// String valueToSelect = "Compounded Monthly"; // or Quarterly, Monthly, etc.
			String optionXpath = String.format("//mat-option//span[contains(text(), '%s')]", Compound);

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			WebElement option = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(optionXpath)));
			option.click();

			driver.findElement(By.xpath("//button[@id='CIT-chart-submit']")).click();

			// 3.Validation against expected vs actual result

			String Actual_val = driver.findElement(By.xpath("//span[@id='displayTotalValue']")).getText();
			// Remove $ and , from the string and convert to double
			double actual = Double.parseDouble(Actual_val.replaceAll("[$,]", ""));
			// Clean expected value: remove $ and commas
			double expected = Double.parseDouble(Exp_val.replaceAll("[$,]", ""));
			// double expected = Double.parseDouble(Exp_val); // Make sure Exp_val is clean
			if (actual == expected) {
				System.out.println("Test is Passed");
				ExcelUtils.setCellData(filepath, "Sheet1", i, 6, "Passed");
				ExcelUtils.fillGreenColor(filepath, "Sheet1", i, 6);
			} else {
				System.out.println("Test is Failed");
				ExcelUtils.setCellData(filepath, "Sheet1", i, 6, "Failed");
				ExcelUtils.fillRedColor(filepath, "Sheet1", i, 6);
			}
			Thread.sleep(3000);
			driver.navigate().refresh();
		} // ending of the for loop
		driver.quit();
	}

}
