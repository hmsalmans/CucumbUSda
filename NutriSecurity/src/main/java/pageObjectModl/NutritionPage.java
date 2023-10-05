package pageObjectModl;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilsEtc.HomeWebsite;




public class NutritionPage extends HomeWebsite {
	
	
	public void playVideo() throws InterruptedException {
//		
//		Thread.sleep(6000);
//		
//		driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[28]/div[2]/div[1]/button")).click();
//		
//		
		driver.switchTo().frame("XkVtstI10_M");
		
		
		
		
		
		driver.findElement(By.className("video-embed-field-provider-youtube video-embed-field-responsive-video")).click();
		
		
	
		
	}
	
	
	

}
