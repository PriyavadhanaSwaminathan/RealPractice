package myhooks;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import driverfactory.DriverFactory;
import io.cucumber.java.Before;
import utils.ConfigReader1;

public class MyHooks {
		
		WebDriver driver;
		
		@Before
		public void setup() {
			Properties prop= ConfigReader1.intializeproperties();
			DriverFactory.initializingbrowser(prop.getProperty("browser"));
			driver= DriverFactory.getdriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));
			
			
		}
		
		@Before
		public void teardown() {
			driver.close();
			
		}
	}



