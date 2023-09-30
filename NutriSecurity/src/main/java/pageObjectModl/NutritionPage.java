package pageObjectModl;

import org.openqa.selenium.By;

import utilsEtc.HomeWebsite;

public class NutritionPage extends HomeWebsite {
	
	
	public void playVideo() {
		
		driver.findElement(By.xpath("//*[@id=\"block-usda-content\"]/article/div/p[2]/a")).click();
		
	}
	
	
	

}
