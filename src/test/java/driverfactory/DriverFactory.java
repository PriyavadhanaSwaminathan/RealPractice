	package driverfactory;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class DriverFactory {

		static WebDriver driver= null;
		
		public static void initializingbrowser(String browsername) {
		
		if(browsername.equals("chrome")){
			driver = new ChromeDriver();
		}else browsername="Firefox" ;
			driver = new FirefoxDriver();	
			
		
		}	
		public static WebDriver getdriver() {
			return driver;
		}


}
