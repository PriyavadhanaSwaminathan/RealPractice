package stepdefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.AmazonPage;
import pageObjects.LoginPage;

public class AmazonCart {
	WebDriver driver;
	LoginPage lp;
	AmazonPage ap;
	
	
	
	@Given("User types the word {string} in google search box")
	public void user_types_the_word_in_google_search_box(String searchbox)  {
		driver=DriverFactory.getDriver();
		lp= new LoginPage(driver);
		lp.googleSearchbox(searchbox);
	    
	}
	
	
	@Then("User click on Amazon link")
	public void user_click_on_amazon_link() throws InterruptedException {
		lp.amazonClick();
	   }
	
	@Given("User types the word {string} in the amazon search box")
	public void user_types_the_word_in_the_amazon_search_box(String searchbox1)  {
		driver=DriverFactory.getDriver();
		ap= new AmazonPage(driver);
		ap.amazonSearchbox(searchbox1);
	    
	}
	

	    
}
