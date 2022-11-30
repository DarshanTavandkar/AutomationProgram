package popupHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingMyntra {

	
	static String testdata= "iphone13";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\\\Driver\\\\ChromeDriver\\\\chromedriver.exe");	

		WebDriver driver=new ChromeDriver();
		
	     driver.get("https://www.myntra.com/");
	        
		driver.manage().window().maximize();	
		
		driver.manage().deleteAllCookies();
		
		
		//---------------object repo --------------------
		
		By search_box=By.xpath("//input[@class='desktop-searchBar']");
		
		By product = By.xpath("//img[@class='img-responsive']");
		
		//------------------Action step----------------------
		
		driver.findElement(search_box).sendKeys(testdata+Keys.ENTER);
		
		Thread.sleep(2000);
		
		driver.findElement(product).click();
		
		//----------------------------------------------
		
		String p_ID = driver.getWindowHandle();
		
		System.out.println(p_ID);
		
		Set<String> c_IDs = driver.getWindowHandles();
		
		System.out.println(c_IDs);
		
		for(String child :c_IDs)
		{
		  System.out.println(child);	
		  
		if(!(p_ID.equals(child)))
		{
            driver.switchTo().window(child);
			
			driver.findElement(By.xpath("//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']")).click();
	
			Thread.sleep(2000);
		}
				
		}	
		
		driver.switchTo().window(p_ID);

	}

}
