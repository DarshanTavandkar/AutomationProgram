package ScreenshotExample;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AmazoneEx {

	//Captured Screenshot
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","E:\\\\Driver\\\\ChromeDriver\\\\chromedriver.exe");	

		WebDriver driver= new ChromeDriver();
		
        driver.get("https://www.amazon.in/");

		
		driver.manage().window().maximize();
				
		//------Casting
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		
		
	      String path = "E:\\TestcasesSS\\ abc.png";
		
		  File des = new File(path);
		
		FileHandler.copy(src, des);
		
		System.out.println("Screenshot Captured");
		
		UtilClass.takeSS(driver,"pqr");
		
		
	}	
		
}


