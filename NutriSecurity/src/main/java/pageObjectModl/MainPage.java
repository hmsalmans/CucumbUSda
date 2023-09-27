package pageObjectModl;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilsEtc.HomeWebsite;

public class MainPage extends HomeWebsite {
	
	
	
	
	 
	 
	public void clickProperTab() {
	    
		driver.findElement(By.xpath("//*[@id=\"block-usda-main-menu\"]/ul/li[4]/button/span")).click();
			
		System.out.println(driver.getCurrentUrl());
		
		}
	
	public void foodAndNutriSelect() throws InterruptedException  {
		
	 
		Actions action = new Actions(driver); 
		
		 WebElement elmnt = driver.findElement(By.xpath("//*[@id=\"side-nav-4\"]/ul/li[4]/a"));
		 
		 action.moveToElement(elmnt);//have to use for mouse hover actions

		 action.click().build().perform();//using click action method
		 Thread.sleep(7000);
		 
		 
		 	 
	}
		
	public void verifyFoodNutriPage() {
		
		String expctedUrl = "https://www.usda.gov/nutrition-security";
		String actualUrl = driver.getCurrentUrl();
		
		System.out.println(actualUrl);
		if (actualUrl.equals(expctedUrl) ) {
			System.out.println("Food and Nutrition page loaded");
		}else {
			System.out.println("Error in the development");
		}
		
	}
	
		

		


}
