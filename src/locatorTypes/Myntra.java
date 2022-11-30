package locatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\\\Driver\\\\ChromeDriver\\\\chromedriver.exe");	

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/");

		
		driver.manage().window().maximize();
		
	//===========contains xpath=================
		
		driver.findElement(By.xpath("//input[contains(@class,'desktop-searchBar')]")).sendKeys("T-shrit" + Keys.ENTER);
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//img[contains(@class,'img')]")).click();
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
