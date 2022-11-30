package actionClassExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\\\Driver\\\\ChromeDriver\\\\chromedriver.exe");	
	  	WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	    
	    driver.switchTo().frame(0);
	    
	//----------------Drag & Drop--------------------------------
	    
	   WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
	
		WebElement des = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act=new Actions(driver);
	
		act.dragAndDrop(src, des).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
