package waitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitEx2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\\\Driver\\\\ChromeDriver\\\\chromedriver.exe");	
	  	WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();

	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.name("q")).sendKeys("Selenium"+ Keys.ENTER);
		driver.findElement(By.xpath("//h3[text()='Selenium']")).click();

		WebElement download_link = driver.findElement(By.xpath("//span[text()='Downloads']"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement elements = wait.until(ExpectedConditions.elementToBeClickable(download_link));
		elements.click();
		
	//	driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
