package apachepoiexcel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicDataintoExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream file = new FileOutputStream(
				System.getProperty("user.dir") + "\\testdata\\myfile_Dynamic.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet sheet = workbook.createSheet("Data_Dynamic");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int noofrows = sc.nextInt();
		System.out.println("Enter the number of cells:");
		int noofcells = sc.nextInt();
		
		for(int r=0;r<=noofrows;r++) {
			XSSFRow currentrow=sheet.createRow(r);
			for(int c=0;c<noofcells;c++) {
				XSSFCell cell=currentrow.createCell(c);
				cell.setCellValue(sc.next()); //Here user can enter either string,number or any type but finally it store it as String(Common method)
			}
		}
		workbook.write(file); //attach workbook to the file
		workbook.close();
		file.close();
		
		System.out.println("File is created!...");
	}

}
