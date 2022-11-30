package iFrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","E:\\\\Driver\\\\ChromeDriver\\\\chromedriver.exe");	

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rediff.com/");

		
		driver.manage().window().maximize();	
		
		
		//======Switch to====
		
		
	//	driver.switchTo().frame("moneyiframe");
		
		WebElement pqr = driver.findElement(By.xpath("//iframe[@id='moneyiframe'] "));
		driver.switchTo().frame(pqr);
			
		String bse_price = driver.findElement(By.xpath("//span[@id='bseindex']")).getText();
		
		System.out.println(bse_price);
		
	}

}
