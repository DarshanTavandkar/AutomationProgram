package locatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","E:\\\\Driver\\\\ChromeDriver\\\\chromedriver.exe");	

	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/login/");

	
	driver.manage().window().maximize();
	//=============== Relative xpath =========================
	
	
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8976873229");
	
	
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Darshan1993");
	
	//=================click button by Relative xpath================
	
	
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
	
	
	
	}

}
