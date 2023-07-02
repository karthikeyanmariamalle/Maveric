package juno03;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excel {
	
	@Test
	private void excelTest1() throws IOException {
		
		File Loc = new File ("C:\\Users\\Admin\\Documents\\testing");
		
		FileInputStream  stream = new FileInputStream(Loc);
		
		XSSFWorkbook workbook = new XSSFWorkbook(stream);
		
		XSSFSheet createSheet = workbook.createSheet();

		XSSFRow createRow = createSheet.createRow(1);
		
		XSSFCell cell = createRow.getCell(0);
		
		String stringCellValue = cell.getStringCellValue();
		
		
			
	
		
		
		
	}

}
