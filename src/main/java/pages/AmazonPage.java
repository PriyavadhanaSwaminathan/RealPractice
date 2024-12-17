package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {
	
	
WebDriver driver;
	
	public AmazonPage(WebDriver driver) {
		
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
	}
		
	
	@FindBy(xpath="//span[text()='Hello, sign in']")
	private WebElement Amazonfirstpage;
		
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement Amazonsearchbox;
	
	public boolean amazonentrypage() {
		return Amazonfirstpage.isDisplayed();
	}
	
	public void Amazontxtarea(String Amazonvalue) {
	Amazonsearchbox.sendKeys(Amazonvalue);
	}
}



