package Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By gmail=By.className("gb_d");
	By images=By.xpath("//*[text()='Images']");
	By search=By.className("gLFyf");
	By button= By.name("btnK");
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement checkImagesText()
	{
		return driver.findElement(images);
	}
	


	public WebElement gmailText()
	{
		return driver.findElement(gmail);
	}

	public WebElement searchBox()
	{
		return driver.findElement(search);
	}
	
	public WebElement searchButton()
	
	{
		return driver.findElement(button);
		
	}
}
