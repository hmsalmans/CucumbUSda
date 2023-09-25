package utilsEtc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWebsite {
	
	public static WebDriver driver;
	 
	 
	
	public  HomeWebsite (WebDriver received) { 
		
	driver	 = received;
		
	}
	
	public HomeWebsite() {
		
	};
	

	public void systemSetPrpr () {
		
		System.setProperty("webdriver.chrome.driver","/Users/apple/Desktop/QA/driver-1/chromedriver");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get("https://www.usda.gov/");
		

	}
	

}
