package excelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataTypeOfExcel {

	public static void main(String[] args) throws IOException {
		
    String path="C:\\Users\\ACER\\Desktop\\MyTestData.xlsx";
		
		File file = new File(path);
		
		FileInputStream fis=new FileInputStream(file);
		
		//-------create object of XSSFWorkbook---------
		
				XSSFWorkbook wb=new XSSFWorkbook(fis);
		        XSSFSheet sheet = wb.getSheet("Sheet2");
		        
		        // Read data from Excel----------------
		        
		        XSSFRow row = sheet.getRow(0);
		        XSSFCell cell = row.getCell(0);
		        
		       String data0 = cell.getStringCellValue();
		
                System.out.println(data0);	
                
	            //(0,1)
                 //-------Date data-------------------
                Date data01 = sheet.getRow(1).getCell(2).getDateCellValue();
                
                System.out.println(data01);
                
                //-----------Numeric data
                
                 double data02 = sheet.getRow(1).getCell(1).getNumericCellValue();
                
                 System.out.println(data02);
                
               //------------String data--------------- 
                // String data03 = sheet.getRow(0).getCell(1).getStringCellValue();
                
                 //System.out.println(data03);
                 
             //-----------Write data in excell----------------------
                 
                 sheet.getRow(1).createCell(2).setCellValue("passtest");
                 FileOutputStream fos =new FileOutputStream(file);
                 wb.write(fos);
                 
                 System.out.println("Data has been set in excel sheet");
                 
                 wb.close();
                 
                
                
                
	}

}
