	package utils;

	import java.io.File;
	import java.io.FileInputStream;
	import java.util.Properties;

	public class ConfigReader1 {
		
		public static Properties intializeproperties() {
		Properties prop = new Properties();
		File propfile= new File(System.getProperty("user.dir")+"src\\test\\resources\\config1\\config1.properties");
		
		try {
		FileInputStream fip = new FileInputStream(propfile);
		prop.load(fip);
		}catch(Throwable e) {
			e.printStackTrace();
			
		}
		
		return prop;
		}
	}



