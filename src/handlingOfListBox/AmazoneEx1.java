package handlingOfListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazoneEx1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\\\Driver\\\\ChromeDriver\\\\chromedriver.exe");	

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");

		
		driver.manage().window().maximize();
		
		//============ For Dropdown ====================
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		
		Select s=new Select(dropdown);
		
		
		s.selectByIndex(14);
		
	//	s.selectByValue("search-alias=computers");
		
	//	s.selectByVisibleText("Baby");
		
//====================Count of option =============================//
		
		List<WebElement> all_op =s.getOptions();
		
		int count = all_op.size();
		
		System.out.println(count);
		
		
		for(int i=0;i<count;i++)
		{
			Object abc = all_op.get(i).getText();
			
			System.out.println(abc);
			
		}
			
		
		
	}

}
