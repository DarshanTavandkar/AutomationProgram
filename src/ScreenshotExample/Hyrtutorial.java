package ScreenshotExample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hyrtutorial {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","E:\\\\Driver\\\\ChromeDriver\\\\chromedriver.exe");	

		WebDriver driver= new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/");	
		driver.manage().window().maximize();
		
		UtilClass.takeSS(driver,"Before Operation");
		
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Frame Handling");
		
		UtilClass.takeSS(driver,"After sending text ");
		
		driver.switchTo().frame("frm1");
		
		
		WebElement dropdown = driver.findElement(By.xpath("(//select[@id='selectnav2'])"));
		
		
		UtilClass.takeSS(driver,"Before selecting option ");
		
		Select s=new Select(dropdown);
		
		s.selectByVisibleText("Tutorials");
		
		UtilClass.takeSS(driver,"After selection option ");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
