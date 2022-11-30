package actionClassExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousehoverSnapdial {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\\\Driver\\\\ChromeDriver\\\\chromedriver.exe");	
	  	WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement men_ele = driver.findElement(By.xpath("//span[@class='catText']"));
		
		//Mousehover Op
		
		Actions act=new Actions(driver);
		
		act.moveToElement(men_ele).build().perform();
		
		
		driver.findElement(By.xpath("//span[text()='Loafers']")).click();
		
		
		

	}

}
