package excelHandling1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilClass {

	
	static String path="C:\\Users\\ACER\\eclipse-workspace\\July30MBAutomationSessions\\src\\excelHandling1\\ParabankMytestData.xlsx";
	
	public static String readdata(String sheetname,int rownum,int cellnum) throws IOException
	{
		File file = new File(path);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		String data = wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		return data;
		
	}


	public static String readdataNum(String sheetname,int rownum,int cellnum) throws IOException
	{
		File file = new File(path);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		Double data = wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getNumericCellValue();
		String xyz = data.toString();
		return xyz;
		
	}
	
	public static void writeData(String sheetname,int rownum,int cellnum,String data) throws IOException
	{
		File file = new File(path);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		wb.getSheet(sheetname).getRow(rownum).createCell(cellnum).setCellValue(data);
		FileOutputStream fos= new FileOutputStream(file);
		wb.write(fos);
		wb.close();
		
	}
	}


