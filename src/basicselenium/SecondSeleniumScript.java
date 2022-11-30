package basicselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondSeleniumScript {

	public static void main(String[] args) {
		
       System.setProperty("webdriver.chrome.driver", "E:\\Driver\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver(); 
		
		driver.get("https://www.snapdeal.com");
		

		driver.manage().window().maximize();
		
		String actual_title = driver.getTitle();
		
		System.out.println(actual_title);
		
		
		String expected_title = "Shop Online for Men, Women & Kids Clothing, Shoes, Home Decor Items";
    	
    	
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
