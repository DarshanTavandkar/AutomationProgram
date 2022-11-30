package scrollingPurpose;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazone {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","E:\\\\Driver\\\\ChromeDriver\\\\chromedriver.exe");	

		WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");	
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		Dimension d=new Dimension(0,900);
		
		driver.manage().window().setSize(d);
			
		//Scrolling
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,5800)");
		
		
		driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		
		
		
		
	}

}
