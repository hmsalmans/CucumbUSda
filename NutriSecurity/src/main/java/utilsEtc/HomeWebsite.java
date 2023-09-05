package utilsEtc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWebsite {
	 WebDriver driver;
	
	public  HomeWebsite (WebDriver received) { 
		
	driver	 = received;
		
	}
	
	
	


	public void systemSetPrpr () {
		
		System.setProperty("webdriver.chrome.driver","/Users/apple/Desktop/QA/driver-1/chromedriver");
		
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}
	

}
