package Application;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException {
		Properties prop =new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Ravi Anala\\seleniumTraining\\End2End\\src\\main\\java\\Application\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			driver =new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			//
		}
		else if(browserName.equals("IE"))
		{
			//
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		return driver;
		
	
	}

}

