package basicselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodEx {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "E:\\Driver\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();   //open browser
		
		driver.get("https://www.amazon.in/");
		
		String title = driver.getTitle();      //get title
		String url = driver.getCurrentUrl();   //get current url
		
		System.out.println(title);
		System.out.println(url);
		
		//============Source code==================
		
	      String sc = driver.getPageSource();
	     System.out.println(sc);
		

		
		
		

	}

}
