package excelHandling1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBankSignup {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\\\Driver\\\\ChromeDriver\\\\chromedriver.exe");	
	  	WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
	    //Signup
	    driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys(UtilClass.readdata("UserDetails", 1, 0));
	    driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys(UtilClass.readdata("UserDetails", 1, 1));
	    driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys(UtilClass.readdata("UserDetails", 1, 2));
	    driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys(UtilClass.readdata("UserDetails", 1, 3));
	    driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys(UtilClass.readdata("UserDetails", 1, 4));
	    driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys(UtilClass.readdataNum("UserDetails", 1, 5));
	    driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys(UtilClass.readdataNum("UserDetails", 1, 6));
	    driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys(UtilClass.readdata("UserDetails", 1, 7));
	    driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys(UtilClass.readdata("UserDetails", 1, 8));
	    driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys(UtilClass.readdata("UserDetails", 1, 9));
	    driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys(UtilClass.readdata("UserDetails", 1, 10));
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@class='button']")).click();
	    

	}

}
