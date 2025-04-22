package apachepoiexcel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicSpecificDataintoRowandCell {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream file = new FileOutputStream(
				System.getProperty("user.dir") + "\\testdata\\myfileRandom.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet sheet = workbook.createSheet("Data_Random");
		XSSFRow randomrow=sheet.createRow(3);
		XSSFCell randomcell=randomrow.createCell(3);
		randomcell.setCellValue("America");
		workbook.write(file); //attach workbook to the file
		workbook.close();
		file.close();
		
		System.out.println("File is created!...");
	}

}
