package scrollingPurpose;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazoneEx1 {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver","E:\\\\Driver\\\\ChromeDriver\\\\chromedriver.exe");	

		WebDriver driver=new ChromeDriver();
		
        driver.get("https://www.amazon.in/");
        
		
		Dimension afterlaunch = driver.manage().window().getSize();
		
		System.out.println(afterlaunch);
		
		Thread.sleep(2000);
	//---------------------------------------------------------	
		
		driver.manage().window().maximize();
		Dimension aftermax = driver.manage().window().getSize();
		
		System.out.println(aftermax);
		
		
	}
	

}
