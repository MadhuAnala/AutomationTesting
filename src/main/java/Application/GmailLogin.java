package Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GmailLogin {
	
	public WebDriver driver;
	By sign=By.xpath("//*[text()='Sign in']");
	//By nxt=By.className("VfPpkd-vQzf8d");
	
	
	public GmailLogin(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public WebElement SignIn()
	{
		return driver.findElement(sign);
	}
	
	
}
