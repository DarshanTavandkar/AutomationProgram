package basicselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstseleniumscript {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();   //open browser
		
		driver.get("https://www.flipkart.com/");  //open url
		
		driver.manage().window().maximize();  //maximize browser
		
           String actual_title = driver.getTitle(); //get title	
        		   
        	System.out.println(actual_title);
        	
  String expected_title = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
        	
        	
        	if(actual_title.equals(expected_title))
        	{
        		System.out.println("Test case passed");
        	}
        	
        	else
        	{
        		System.out.println("Test case Failed");
        	}
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	

	}

}