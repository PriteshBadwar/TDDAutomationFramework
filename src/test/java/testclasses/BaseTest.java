package testclasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pompage.LoginPage;
import pompage.RegisterUser;
import utility.ReadPropData;

public class BaseTest {
	
public	LoginPage loginpage;
public	RegisterUser register;
	
public	static WebDriver driver;
	@BeforeSuite
	public void initBrowser() throws IOException
	{
		ReadPropData rp = new ReadPropData();
		String browserName = rp.getPropData("browser");
		
		if(browserName.equals("Chrome"))
		{
		
		 driver = new ChromeDriver();
		}
		else if(browserName.equals("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		 driver.manage().window().maximize();
		 driver.get("https://rahulshettyacademy.com/client");
		
	}
	
	@BeforeClass
	public void createObject()
	{
		 loginpage = new LoginPage(driver);
		 
		 register = new RegisterUser(driver);
				 
	}
	
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}

}
