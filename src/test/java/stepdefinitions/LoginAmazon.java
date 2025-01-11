package stepdefinitions;

import io.cucumber.java.en.*;
import pageObjects.AmazonPage;
import pageObjects.LoginPage;

import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import factory.DriverFactory;

public class LoginAmazon {

	WebDriver driver;
	LoginPage lp;
	AmazonPage ap;
	
	
	
	@Given("User types the word {string} in the google search box")
	public void user_types_the_word_in_the_google_search_box(String searchbox)  {
		driver=DriverFactory.getDriver();
		lp= new LoginPage(driver);
		lp.googleSearchbox(searchbox);
	    
	}
	
	
	@Then("User click on the Amazon link")
	public void user_click_on_the_amazon_link() throws InterruptedException {
		lp.amazonClick();
	   }
	
	@Then("User validates landing on the Amazon Page")
	public void user_validates_landing_on_the_amazon_Page() {
		
		 ap= new AmazonPage(driver);
		 String app=ap.amazonVerification();
		 Assert.assertEquals(app,"Hello, sign in");
		 System.out.println(app);
		 }
	
	@Then("User scrolls down the page and takes the sceenshot from the Amazon Home Page")
	public void user_scrolls_down_the_page_and_takes_the_sceenshot_from_the_amazon_home_page() throws IOException {
	    ap= new AmazonPage(driver);
	    WebElement amazonScroll=ap.amazonscrolldown();
	    JavascriptExecutor js= (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'end', inline: 'center'});", amazonScroll);
	    
	  TakesScreenshot ts= (TakesScreenshot)driver;
	  File source=ts.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(source, new File("./screenshots/"+"Amazon"+".png"));
	}

	

	    

	
	
	    
	
}