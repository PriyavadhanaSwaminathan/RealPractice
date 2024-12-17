package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
	
WebDriver driver;
	
	public GooglePage(WebDriver diver) {
	
	this.driver= driver;
	
	
	PageFactory.initElements(driver, this);
	
	}
	

	
	@FindBy(xpath="//textarea[@id='APjFqb']")
	private WebElement Googletextarea;
	
	@FindBy(xpath="//span[text()='Shop online at Amazon India']")
	private WebElement AmazonIndia;
	
	
	
	public void Googleenterpage(String googlevaluetxtbx) {
		Googletextarea.sendKeys(googlevaluetxtbx);
		List <WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("amazon"));
			{
				list.get(i).click();
				break;
			}
		}
	}
	
	public void shopOnlineAtAmazonIndia() {
	AmazonIndia.click();
	}
}



