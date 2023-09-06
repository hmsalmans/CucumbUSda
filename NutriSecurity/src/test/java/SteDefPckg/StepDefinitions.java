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
	
	

}
