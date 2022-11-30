package excelHandling;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo1 {

	
	public static void main(String[] args) throws InterruptedException, IOException
	{
	//Auto Script Launching broswer
	
    System.setProperty("webdriver.chrome.driver","E:\\\\Driver\\\\ChromeDriver\\\\chromedriver.exe");	
  	WebDriver driver=new ChromeDriver();
	driver.get("https://demoblaze.com/index.html");
	driver.manage().window().maximize();
    driver.manage().deleteAllCookies();

    //login script

      driver.findElement(By.xpath("//a[@id='login2']")).click();
      Thread.sleep(3000);
      driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys(ReadData.readdata("sheet3", 4, 0));
      driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys(ReadData.readdata("Sheet3", 4, 1));
      driver.findElement(By.xpath("//button[text()='Log in']")).click();
      Thread.sleep(5000);
	
	    String name= driver.findElement(By.xpath("//a[@id='nameofuser']")).getText();
	    
	   boolean status = name.contains(ReadData.readdata("sheet3", 4, 0));
	    
	    if(status==true)
	    {
	    	ReadData.writeData("sheet3", 4, 2,"pass");
	    	
	    }
	    
	    else
	    {
	    	ReadData.writeData("sheet3", 4, 2,"fail");
	    }
	    	
	
	    
	}
	
}
