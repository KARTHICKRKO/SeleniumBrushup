package selenium_brushupbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		//single File Upload
		/*driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\karthick.r\\Videos\\Captures\\Karthick R- Resume.docx");
		
		if(driver.findElement(By.xpath("//ul[@id='fieldList']//li")).getText().equals("Karthick R- Resume.docx")) {
			System.out.println("File is uploaded successfully");
		}else {
			System.out.println("Upload Failed");
		}
	}*/
		//Multiple File upload
		
		String file1="C:\\Users\\karthick.r\\Videos\\Captures\\Karthick R- Resume.docx";
		String file2="C:\\Users\\karthick.r\\Videos\\Captures\\Karthick resume NEW.docx";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		
		int nooffiles=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		
		//1.validation of no. of files
		if(nooffiles==2) {
			System.out.println("All Files are uploaded successfully");
		}else {
			System.out.println("Files are not uploaded correctly");
		}
		
		//2.validation of file names
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Karthick R- Resume.docx")&&
				driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Karthick resume NEW.docx")) {
			System.out.println("File name is matching");
		}else {
			System.out.println("File name is not matching");
		}
		

}
}
