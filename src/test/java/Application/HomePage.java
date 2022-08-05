package Application;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage extends Base{
	
	
	@BeforeMethod
	
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		
	
	
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		/*LandingPage lp=new LandingPage(driver);
		System.out.println(lp.checkImagesText().getText());
		Assert.assertEquals(lp.checkImagesText().getText(),"Images");
		Assert.assertEquals(lp.gmailText().getText(),"Gmail");
		System.out.println(lp.gmailText().getText());
		lp.searchBox().sendKeys("GallBladder");
		lp.searchButton().click();*/
		
	

}
	@Test
	public void LandingElmts() throws InterruptedException, IOException
	{
		LandingPage lp=new LandingPage(driver);
		System.out.println(lp.checkImagesText().getText());
		Assert.assertEquals(lp.checkImagesText().getText(),"Images");
		Assert.assertEquals(lp.gmailText().getText(),"Gmail");
		System.out.println(lp.gmailText().getText());
		//lp.searchBox().sendKeys("GallBladder");
		//lp.searchButton().click();
		
		lp.gmailText().click();
		//GmailPage g=new GmailPage(driver);
		//System.out.println(g.TextVerify().getText());
		//g.gmailAccount().click();
		Thread.sleep(1000);
		
		GmailLogin glogin=new GmailLogin(driver);
		glogin.SignIn().click();
		
		SignInPage sgn=new SignInPage(driver);
		
		DataDriven d=new DataDriven();
		ArrayList<String> data=d.getData("email");
		//sgn.email().sendKeys(data.get(1));
		sgn.Next().click();
		
	}
}
