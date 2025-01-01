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
			
driver=rdriver;
			
PageFactory.initElements(driver, this);
		}

@FindBy(xpath="//textarea[@name='q']")
WebElement googlelink;

@FindBy(xpath="//input[@value='Google Search']")
WebElement googlesearchbutton;

@FindBy(xpath="//span[text()='Shop online at Amazon India']")
WebElement amazonLinkClick;

public void googleSearchbox(String Amazon) {
googlelink.sendKeys(Amazon);
List<WebElement> list= driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@aria-label='amazon india']"));
for(int i=0;i<list.size();i++) {
	System.out.println(list.get(i).getText());
	if(list.get(i).getText().equals("amazon india"));
	{
		list.get(i).click();
		break;
	}
}
}





public void googleSearchButton() {
googlesearchbutton.click();


try {
    // Wait for element to be visible and clickable
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement googlesearchbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Google Search']")));
    
    // Scroll the element into view
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true);", googlesearchbutton);
    
    // Perform double-click action
    Actions actions = new Actions(driver);
    actions.doubleClick(googlesearchbutton).perform();
} catch (ElementNotInteractableException e) {
    System.out.println("Element not interactable: " + e.getMessage());
} catch (Exception e1) {
    System.out.println("An error occurred: " + e1.getMessage());
}

}
public void amazonClick() {
amazonLinkClick.click();
	}
}
