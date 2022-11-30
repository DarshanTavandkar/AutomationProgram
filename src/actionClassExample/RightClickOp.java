package actionClassExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickOp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\\\Driver\\\\ChromeDriver\\\\chromedriver.exe");	
	  	WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement button = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//Right click operation
	
		Actions act = new Actions(driver);
		act.contextClick(button).build().perform();
		WebElement option = driver.findElement(By.xpath("//span[text()='Copy']"));
		option.click();
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
