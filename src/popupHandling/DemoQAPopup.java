package popupHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQAPopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\\\Driver\\\\ChromeDriver\\\\chromedriver.exe");	

		WebDriver driver=new ChromeDriver();
		
	     driver.get("https://demoqa.com/alerts");
	        
		driver.manage().window().maximize();	
		
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		
		
		
		driver.switchTo().alert().sendKeys("I love India");
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();	
	}

}
