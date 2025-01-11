package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Given;

public class AmazonPage {
public WebDriver driver;

public AmazonPage(WebDriver driver) {
	
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath=("//span[text()='Hello, sign in']"))
WebElement amazonSearchPagetxt;

@FindBy(xpath=("//a[text()='Conditions of Use & Sale']"))
WebElement amazonscroll;

@FindBy(xpath=("//div[@role='rowgroup']//div[@aria-label='sankranti']"))
WebElement amazoncart;


public String amazonVerification() {
	try
	{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement amazonSearchPagetxt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Hello, sign in']")));
	System.out.println("Text found:"+amazonSearchPagetxt.getText());
	 {
	    
	        return amazonSearchPagetxt.getText(); // Make sure element is loaded
	    }
	}catch (Exception e) {
            // Handle any exceptions (e.g., element not found or not interactable)
            e.printStackTrace();
            return null;  // Return null in case of failure
        }


}
public WebElement amazonscrolldown() {
	return amazonscroll;
}

public void amazonSearchbox(String sankranti) {
amazoncart.sendKeys(sankranti);
List<WebElement> list= driver.findElements(By.xpath("//div[@role='rowgroup']//div[@aria-label='sankranti']"));
for(int i=0;i<list.size();i++) {
	if(list.get(i).getText().equals("sankranti"));
	{
		list.get(i).click();
		break;
	}
}
}

}


