package basicselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BroswerCommentEx {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "E:\\Driver\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();   //open browser
		
	//=======launch url=================	
		
		driver.get("https://www.myntra.com/");
		
	//=======Maximize the broswer=================	
		
		driver.manage().window().maximize();
		
		//=================Sleep ==============
			
		   Thread.sleep(4000);
		
		//==============Full screen=================== 
		   
		   driver.manage().window().fullscreen();
		   
		 //=================Sleep ==============
			
		   Thread.sleep(4000); 
		   
	//=======Minimize the broswer=================	
		
		driver.manage().window().minimize();
		
	
		
		
		
		
		
		
		

	}

}
