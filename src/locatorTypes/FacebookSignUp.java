package locatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class FacebookSignUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\\\Driver\\\\ChromeDriver\\\\chromedriver.exe");	

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg/");

		
		driver.manage().window().maximize();	
		
		WebElement ab = driver.findElement(By.xpath("//input[contains(@id,'u_0_b')]"));
		
		ab.sendKeys("Sachin");
		
		Thread.sleep(2000);
		
		WebElement xy = driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(ab));
		
		xy.sendKeys("Tendulkar");
		Thread.sleep(2000);
		
		WebElement yz = driver.findElement(RelativeLocator.with(By.tagName("input")).below(xy));
		
		yz.sendKeys("sachintendulkar@gmail.com");	
		Thread.sleep(2000);
		
		WebElement pq = driver.findElement(RelativeLocator.with(By.tagName("input")).below(yz));
		
		pq.sendKeys("sachintendulkar@gmail.com");
		
		Thread.sleep(2000);
		
		WebElement op = driver.findElement(RelativeLocator.with(By.tagName("input")).below(pq));
		
		op.sendKeys("sachin@123");
		
		
	}

}
