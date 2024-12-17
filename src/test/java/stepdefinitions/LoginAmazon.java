	package stepdefinitions;

	import org.junit.Assert;
	import org.openqa.selenium.WebDriver;

	import io.cucumber.java.en.*;
	import pages.AmazonPage;
	import pages.GooglePage;

	public class LoginAmazon {
		WebDriver driver;
		GooglePage gp;
		AmazonPage ap;
		
		@Given("User types the {string} in the google search box")
		public void user_types_the_in_the_google_search_box(String string) {
		 GooglePage gp = new GooglePage(driver);
		 gp.Googleenterpage("Amazon");
		}
		@Then("User lands to the Amazon India Page and click on the link")
		public void user_lands_to_the_amazon_india_page_and_click_on_the_link() {
			gp.shopOnlineAtAmazonIndia();
		}
		@Then("User lands to the Amazon Website and verifies as user logged to the Amazon Website or not")
		public void user_lands_to_the_amazon_website_and_verifies_as_user_logged_to_the_amazon_website_or_not() {
			AmazonPage ap= new AmazonPage(driver);
			Assert.assertEquals("Hello, sign in", ap.amazonentrypage());
		}
		@Then("user types {string} in the search box and click on the search button")
		public void user_types_in_the_search_box_and_click_on_the_search_button(String Amazonvalue) {
			ap.Amazontxtarea(Amazonvalue);
		}
		@Then("User verifies and clicks on {string}")
		public void user_verifies_and_clicks_on(String string) {
		   
		}
		@Then("User close the browser")
		public void user_close_the_browser() {
		    
		}
	}	


