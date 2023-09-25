package SteDefPckg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;
import pageObjectModl.MainPage;

import utilsEtc.*;


public class StepDefinitions {
	
	
	
	 WebDriver chroming;
	 
	 //WebDriverWait wait = new WebDriverWait(chroming,30);
	 
	 HomeWebsite obj = new HomeWebsite(chroming);// object of HomeWebsite class with sending driver from here.
     
     MainPage main = new MainPage(); //object of MainPage
	 
	 
	@Given("I am on home page")
	public void i_am_on_home_page() {
		
		obj.systemSetPrpr();
		
	    
	  
	}
	
	@When("I click on Priorities tab")
	public void i_click_on_priorities_tab() {
		 
		main.clickProperTab();
		
    
	}

	@When("Select food and security title")
	public void select_food_and_security_title()  {
		
		main.foodAndNutriSelect();
	   
	}

	@Then("A new page opens")
	public void a_new_page_opens() {
		
		main.verifyFoodNutriPage();
		
		
	}
	
	
	
	@Given("I am on Food and Nutritionl Security page")
	public void i_am_on_food_and_nutritionl_security_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I click on play link")
	public void i_click_on_play_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Video will play")
	public void video_will_play() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	

}
