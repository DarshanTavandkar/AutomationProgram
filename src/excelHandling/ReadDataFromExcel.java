package excelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		String path="C:\\Users\\ACER\\Desktop\\MyTestData.xlsx";
		
		File file = new File(path);
		
		FileInputStream fis=new FileInputStream(file);
		
		//-------create object of XSSFWorkbook---------
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		//--------Get sheet--------------------
		XSSFSheet sheet= wb.getSheetAt(0);

//--------------For username --------------
		
		//--------get row-------------
		
		XSSFRow row = sheet.getRow(1);
		
		//-----------get cell------
		
		XSSFCell cell = row.getCell(0);
		
		String username = cell.getStringCellValue();
		
		System.out.println(username);
		
//---------- for password--------------------------
		
		//--------get row-------------
		
		XSSFRow row1 = sheet.getRow(1);
				
		//-----------get cell------
				
		XSSFCell cell1 = row.getCell(1);
				
		String password = cell1.getStringCellValue();
				
		System.out.println(password);
		
		//Totalcount
		
		int rowcount = sheet.getLastRowNum();
		
		System.out.println(rowcount);
		
		short cellcount = row.getLastCellNum();
		
		System.out.println(cellcount);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
