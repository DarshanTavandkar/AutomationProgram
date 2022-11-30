package locatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","E:\\Driver\\ChromeDriver\\chromedriver.exe");
	
	  WebDriver driver=new ChromeDriver();
	  //======== launch url ==================
	  
	  driver.get("https://www.redbus.in/");
		
	 driver.manage().window().maximize();
	 
	 //  =========== linktext ====================
	 driver.findElement(By.linkText("Help")).click();
	 
	 Thread.sleep(4000);
	 
	 driver.navigate().back();
	 
	 //============== Partiallinktext ==================
	 
	 driver.findElement(By.partialLinkText("He")).click();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
		

	}

}
