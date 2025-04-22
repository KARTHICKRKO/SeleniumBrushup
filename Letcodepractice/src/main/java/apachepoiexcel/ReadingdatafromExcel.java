package apachepoiexcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingdatafromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Excelfile-->Workbook--> Sheets---> Rows--->Cells

		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\testdata\\ATTENDANCE SHEET (version 1).xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("AUGUST 2023");
		int totalrow = sheet.getLastRowNum();
		int totalcell = sheet.getRow(0).getLastCellNum();
		System.out.println("Number of rows is :" + totalrow);
		System.out.println("Number of cells is :" + totalcell);

		// Now repeating the rows and cells by using for loop
		for (int r = 0; r <= totalrow; r++)// reading the rows one by one and store in the currentrow variable
		{
			XSSFRow currentrow = sheet.getRow(r);
			for (int c = 0; c < totalcell; c++)// reading the cells from the particular row
			{
				XSSFCell currentcell = currentrow.getCell(c);
				if (currentcell != null) {
					System.out.print(currentcell.toString() + " ");// Finally by using cell object we are able to get
																	// the data as string
				} else {
					System.out.print("EMPTY ");
				}

			}
			System.out.println();
		}

		workbook.close();
		file.close();

	}

}
