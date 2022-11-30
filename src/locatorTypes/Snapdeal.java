package locatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\Driver\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();   //open browser
		
	//=======launch  url   =================	
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		//=========== linktext ================
		
		driver.findElement(By.linkText("Sell On Snapdeal")).click();
	
	    Thread.sleep(4000);
		
	    driver.navigate().back();
		
	   // ============ Partiallinktext ===================== 
	    
	    
	   driver.findElement(By.partialLinkText("Gift")).click();
		
		
		
		
		
		
	}

}
