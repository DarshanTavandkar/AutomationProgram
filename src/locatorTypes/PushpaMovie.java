package locatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PushpaMovie {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\\\Driver\\\\ChromeDriver\\\\chromedriver.exe");	

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");

		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[contains(@name,'q')]")).sendKeys("puspha"+ Keys.ENTER);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//h3[contains(text(),'IMDb')]")).click();
		
		String xyz = driver.findElement(By.xpath("(//li[@class='ipc-metadata-list__item ipc-metadata-list-item--link'])[10]")).getText();
		
		System.out.println(xyz);
		

	}

}
