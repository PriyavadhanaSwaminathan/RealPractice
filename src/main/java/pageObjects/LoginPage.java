package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage{
		public WebDriver driver;
		public Actions ac;
		
		
		//The constructor LoginPage(WebDriver rdriver) initializes the WebDriver instance (ldriver) and uses PageFactory to initialize all the elements on the login page.
		
public LoginPage(WebDriver rdriver) {
			
this.driver=rdriver;
			
PageFactory.initElements(driver, this);
		}

@FindBy(xpath="//textarea[@name='q']")
WebElement googlelink;

@FindBy(xpath="//input[@value='Google Search']")
WebElement googlesearchbutton;


@FindBy(xpath="//span[text()='Shop online at Amazon India']")
WebElement amazonLinkClick;





public void googleSearchbox(String amazonindia) {
googlelink.sendKeys(amazonindia);
List<WebElement> list= driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@aria-label='amazon india']"));
for(int i=0;i<list.size();i++) {
	if(list.get(i).getText().equals("amazon india"));
	{
		list.get(i).click();
		break;
	}
}
}



public void amazonClick() {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 WebElement amazonLinkClick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Shop online at Amazon India']")));		
	 amazonLinkClick.click();
	}
}

