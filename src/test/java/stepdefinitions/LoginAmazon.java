package stepdefinitions;

import io.cucumber.java.en.*;
import pageObjects.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class LoginAmazon {
	public WebDriver driver;
	public LoginPage lp;
	
	@Given("User launches Chrome browser")
	public void user_launches_chrome_browser() {
		System.setProperty("WebDriver.chrome.driver", System.getProperty("user")+"//Drivers/chrome.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		lp=new LoginPage(driver);
	}
	
	@Given("User opens URL {string}")
	public void user_opens_url(String url) {
	   driver.get(url);
	}

	
	@Given("User types the word {string} in the google search box")
	public void user_types_the_word_in_the_google_search_box(String searchbox) {
		
	    lp.googleSearchbox(searchbox);
	}
	
	@Then("User clicks on the google search button")
	public void user_clicks_on_the_google_search_button() {
	    lp.googleSearchButton();
	}
	
	@Then("User click on the Amazon link")
	public void user_click_on_the_amazon_link() throws InterruptedException {
		Thread.sleep(10);
	   lp.amazonClick();
	}
}