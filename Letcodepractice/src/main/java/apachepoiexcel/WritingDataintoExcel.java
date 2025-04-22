package apachepoiexcel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataintoExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Excelfile-->Workbook--> Sheets---> Rows--->Cells
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\myfile.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet sheet = workbook.createSheet("Data");
		XSSFRow row0 = sheet.createRow(1);
		row0.createCell(0).setCellValue("Java");
		row0.createCell(1).setCellValue(8);
		row0.createCell(2).setCellValue("Automation");

		XSSFRow row1 = sheet.createRow(2);
		row1.createCell(0).setCellValue("SQL");
		row1.createCell(1).setCellValue(78.3);
		row1.createCell(2).setCellValue("ApacheJmeter");
		
		XSSFRow row2 = sheet.createRow(3);
		row2.createCell(0).setCellValue("Redhills");
		row2.createCell(1).setCellValue(87.2);
		row2.createCell(2).setCellValue("Padiyannallur");

		workbook.write(file); //attach workbook to the file
		workbook.close();
		file.close();
		
		System.out.println("File is created!...");
	}

}
