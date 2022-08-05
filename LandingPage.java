package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	By signin=By.cssSelector("a[href*='sign_in']");
	By close=By.xpath("//button[text()='NO THANKS']");
	By text=By.xpath("//h2[text()='Featured Courses']");
	By check=By.xpath("//a[text()='Contact']");
	
	//this is the constructor as we have passed driver in Homepage class
	//during the object creation for the Landingpage
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getLogin()
	{
		return driver.findElement(signin);
		
	}
	public WebElement getClose()
	{
		return driver.findElement(close);
		
	}
	public WebElement getVal()
	{
		return driver.findElement(text);
		
	}
	public WebElement getCheck()
	{
		return driver.findElement(check);
		
	}

}
