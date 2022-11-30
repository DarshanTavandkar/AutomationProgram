package popupHandling;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class STAPopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\\\Driver\\\\ChromeDriver\\\\chromedriver.exe");	

		WebDriver driver=new ChromeDriver();
		
	     driver.get("https://stqatools.com/demo/index.php");
	        
		driver.manage().window().maximize();	
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='navbarDropdownPortfolio']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Alert']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[contains(text(),'Confirm Alert')])[2]")).click();
		
		Thread.sleep(4000);
		
		driver.switchTo().alert().dismiss();
		
		
		
		
		
	}

}
