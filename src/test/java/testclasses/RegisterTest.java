package testclasses;

import org.testng.annotations.Test;

import extentlisteners.TestNGListeners;

public class RegisterTest extends TestNGListeners {
	
	@Test(priority = 1)
	public void registerUser()
	{
		test.info("Clicking on register");
		register.clickOnRegister();
		test.info("entering the details of user");
		register.enteringDetails();
	}

	
	@Test(priority = 2)
	public void navToLoginPage()
	{
		test.info("Clicking on login button");
		register.clickOnLoginButton();
	}
}
