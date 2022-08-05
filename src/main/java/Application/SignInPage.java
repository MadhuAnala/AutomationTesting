package Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {
	
	public WebDriver driver;
	
	By emai=By.cssSelector("input[type='email']");
	By nxt=By.className("VfPpkd-vQzf8d");
	
	public SignInPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this. driver=driver;
	}

	public WebElement email()
	{
		return driver.findElement(emai);
	}
	public WebElement Next()
	{
		return driver.findElement(nxt);
	}

}
