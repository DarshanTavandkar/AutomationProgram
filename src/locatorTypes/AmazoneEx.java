package locatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazoneEx {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\\\Driver\\\\ChromeDriver\\\\chromedriver.exe");	

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");

		
		driver.manage().window().maximize();
		
		//=============== Relative xpath =========================
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Acer Laptop");
		
      
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		
		
		
	}

}
