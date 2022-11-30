package waitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitEx1 {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver","E:\\\\Driver\\\\ChromeDriver\\\\chromedriver.exe");	
	  	WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();

	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	//---------------------------------------------------------------------------	
		
	    driver.findElement(By.xpath("//button[@id='alertButton']")).click();
	    driver.switchTo().alert().accept();
		
	    driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));	
		wait.until(ExpectedConditions.alertIsPresent());

	}

}
