package locatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazone {

	public static void main(String[] args) {
			
System.setProperty("webdriver.chrome.driver", "E:\\Driver\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();   //open browser
		
	//=======launch url=================	
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
        //----------------id-------------------
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		
		search.sendKeys("onepluse10R5g");
		
		WebElement searchbutton = driver.findElement(By.id("nav-search-submit-button"));
		
		searchbutton.click();
		
		//----------------Name----------------------------
		
	   WebElement ref = driver.findElement(By.name("field-keywords"));
		
		ref.sendKeys("iphone13");
		
	 WebElement search_button = driver.findElement(By.id("nav-search-submit-button"));
		
		searchbutton.click();
		//----------------link text----------------------------
		
		WebElement clickbutton = driver.findElement(By.linkText("Mobiles"));
		
		clickbutton.click();		
	}

}
