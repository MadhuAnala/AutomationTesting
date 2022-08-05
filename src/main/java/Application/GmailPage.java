package Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GmailPage {
	
	public WebDriver driver;
	By verify=By.xpath("//*[text()='Choose an account']");
	By account=By.className("BHzsHc");
	
	public GmailPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public WebElement TextVerify()
	{
		return driver.findElement(verify);
	}

	public WebElement gmailAccount()
	{
		return driver.findElement(account);
	}
	

}
