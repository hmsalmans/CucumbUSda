package pageObjectModl;

import org.openqa.selenium.By;

import utilsEtc.HomeWebsite;

public class NutritionPage extends HomeWebsite {
	
	
	public void playVideo() {
		
		driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[4]/button")).click();
		
	}
	
	
	

}
