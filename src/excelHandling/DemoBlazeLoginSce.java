package excelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlazeLoginSce {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		  String path="C:\\Users\\ACER\\Desktop\\MyTestData.xlsx";
			File file = new File(path);
			FileInputStream fis=new FileInputStream(file);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
	        XSSFSheet sheet = wb.getSheet("Sheet3");
	        String username10 = sheet.getRow(1).getCell(0).getStringCellValue();
	        String password11= sheet.getRow(1).getCell(1).getStringCellValue(); 
            
            
		
		   //Auto Script Launching broswer
		
            System.setProperty("webdriver.chrome.driver","E:\\\\Driver\\\\ChromeDriver\\\\chromedriver.exe");	
    		WebDriver driver=new ChromeDriver();
    		driver.get("https://demoblaze.com/index.html");
    		driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		
		    //login script
		
		     driver.findElement(By.xpath("//a[@id='login2']")).click();
		     Thread.sleep(3000);
		     driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys(username10);
		     driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys(password11);
		     driver.findElement(By.xpath("//button[text()='Log in']")).click();
		     
		     

	}

}
