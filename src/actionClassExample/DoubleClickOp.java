package actionClassExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickOp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\\\Driver\\\\ChromeDriver\\\\chromedriver.exe");	
	  	WebDriver driver=new ChromeDriver();
		driver.get("https://stqatools.com/demo/index.php");
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@id='navbarDropdownPortfolio'])[2]")).click();
		
		driver.findElement(By.xpath("//a[text()='Double Click']")).click();
		
		
		//double click Op
		
		WebElement double_button = driver.findElement(By.xpath("//button[text()='Click Me / Double Click Me!']"));
		
		Actions act=new Actions(driver);
		act.doubleClick(double_button).build().perform();
		Thread.sleep(2000);
		act.doubleClick(double_button).build().perform();
		Thread.sleep(2000);
		act.doubleClick(double_button).build().perform();
		Thread.sleep(2000);
		act.doubleClick(double_button);
		Thread.sleep(2000);
		act.doubleClick(double_button);
		
		
		
		

	}

}
