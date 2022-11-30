package basicselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommentEx {

	public static void main(String[] args) throws InterruptedException {
		
      System.setProperty("webdriver.chrome.driver", "E:\\Driver\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();   //open browser
		
		
		//======launch url================
		
		   
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		//======== Navigate to =================
		
		driver.navigate().to("https://www.amazon.in/");
		
		Thread.sleep(4000);
		
		//========Navigate backword================
		
		   driver.navigate().back();
		   Thread.sleep(4000);
		//=========Navigate forward============
		   
		   driver.navigate().forward();
		   Thread.sleep(4000);
		//==========Navigate refresh========
		   
		   driver.navigate().refresh();
		   Thread.sleep(4000);
		//===========quit==================
		   
		   driver.quit();	
		

	}

}
