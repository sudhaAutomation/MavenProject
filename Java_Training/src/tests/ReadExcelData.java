package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws IOException  {
		FileInputStream file = new FileInputStream(
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\eclipse-workspace1\\Java_Training\\excelFiles\\testdata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheet("addCategory");
		int rowcount = sheet.getLastRowNum();
		int cellcount = sheet.getRow(1).getLastCellNum();
		System.out.println(rowcount);
		System.out.println(cellcount);

		Object data[][] = new Object[rowcount][cellcount];

		for (int i = 2; i < rowcount - 1; i++) {

			XSSFRow rowdata = sheet.getRow(i);
			for (int j = 0; j < cellcount; j++) {
			//	data[i - 2][j] = rowdata.getCell(j);
				 XSSFCell cellvalue=rowdata.getCell(j);
				//System.out.println(Arrays.toString(data));
				System.out.println(cellvalue);
			}
			System.out.println();

		}

	}

}
