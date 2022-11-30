package waitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\\\Driver\\\\ChromeDriver\\\\chromedriver.exe");	
	  	WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();

	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	    scrollBy(driver);
		driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();
		scrollBy(driver);
		driver.findElement(By.xpath("//span[text()='Alerts']")).click();
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		SimplePopup(driver);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
	    ConfirmPopup(driver);
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@id='promtButton']")).click();
	    PromptPopup(driver);
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
	    driver.switchTo().alert().accept(); 
	}

	public static void SimplePopup(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public static void ConfirmPopup(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public static void PromptPopup(WebDriver driver)
	{
		driver.switchTo().alert().sendKeys("Sachin");
		driver.switchTo().alert().accept();
	}
	public static void scrollBy(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
		
	}	
}
