package SteDefPckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import utilsEtc.HomeWebsite;

public class StepDefinitions {
	
	
	
	 WebDriver chroming;
	 
	 HomeWebsite obj = new HomeWebsite(chroming);
	
	@Given("I am on home page")
	public void i_am_on_home_page() {
		
//	System.setProperty("webdriver.chrome.driver", "/Users/apple/Desktop/QA/driver-1/chromedriver");
//		
//		driver = new ChromeDriver();
		
		obj.systemSetPrpr();
		
	    
	}

	@When("I click on Priorities tab")
	public void i_click_on_priorities_tab() {
	    
	}

	@When("Select food and security title")
	public void select_food_and_security_title() {
	   
	}

	@Then("A new page opens")
	public void a_new_page_opens() {
		
	}
	
	

}
