package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By email=By.xpath("//input[@type='email']");
	
	By pswd=By.xpath("//input[@type='password']");
	
	By lgin=By.name("commit");
	
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	}

	public WebElement getEmail()
	{
		return driver.findElement(email);
		
	}
	public WebElement getPswd()
	{
		return driver.findElement(pswd);
		
	}
	public WebElement getlgin()
	{
		return driver.findElement(lgin);
		
	}
}
