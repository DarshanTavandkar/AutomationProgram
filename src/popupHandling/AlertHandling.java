package popupHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","E:\\\\Driver\\\\ChromeDriver\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
     driver.get("http://demoblaze.com/index.html");
        
	driver.manage().window().maximize();
			
	driver.findElement(By.xpath("//a[contains(text(),'Phones')]")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[contains(text(),'Samsung galaxy s6')]")).click();
	
	Thread.sleep(4000);
	AlertHandling.clickOnAddtochart(driver);
	
	Thread.sleep(4000);
	
	driver.switchTo().alert().accept();
	
	}	
	public static void clickOnAddtochart(WebDriver driver1)
	{
		
		driver1.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
	}
		
		
		
		
		
		
		
		
		
		
		
	}


