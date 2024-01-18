package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.TestNGListeners;

public class LoginTest extends TestNGListeners {
	
	@Test(priority = 4)
	public void loginToApp()
	{	
		test.info("entering the credentials");
		
		loginpage.enterCredentials();
		
		test.info("Clicking on login button");
		
		loginpage.clickOnLogin();
	}
	
	@Test(priority = 3)
	
	public void validateTitle()
	{
		test.info("Fetching the title of page");
		
		String title= loginpage.getTitleOfPage();
		
		test.info("Validating the title");
		Assert.assertEquals(title, "Let's Shop");


	}

}
