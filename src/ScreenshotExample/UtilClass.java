package ScreenshotExample;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilClass {		
		public static void takeSS(WebDriver driver1,String filename) throws IOException  //WebDriver driver1= driver=new chromeDriver();
		{
			TakesScreenshot ts=(TakesScreenshot)driver1;
			
			File src = ts.getScreenshotAs(OutputType.FILE);
			
			
			
		      String path = "E:\\TestcasesSS\\"+filename+".png";
			
			  File des = new File(path);
			
			FileHandler.copy(src, des);
			
			System.out.println("Screenshot Captured");
		
			
			
		}

	}


