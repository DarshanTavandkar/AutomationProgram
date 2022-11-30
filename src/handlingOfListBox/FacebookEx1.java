package handlingOfListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookEx1 {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver","E:\\\\Driver\\\\ChromeDriver\\\\chromedriver.exe");	

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg/");

		
		driver.manage().window().maximize();	
		
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		
		Select sd=new Select(day);
		
		sd.selectByIndex(9);
		
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select sm=new Select(month);

		sm.selectByValue("12");
		Thread.sleep(2000);
		
		WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
		
		Select sy=new Select(year);
		
		sy.selectByValue("1993");
		
		
	}

}
