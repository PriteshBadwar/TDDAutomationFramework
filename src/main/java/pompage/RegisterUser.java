package pompage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterUser {
	WebDriver driver;
	private	By firstname  = By.xpath("//*[@id='firstName']");
	
	@FindBy(xpath = "//*[text()='Register']")
	private	WebElement registerbutton;
	
//	@FindBy(xpath = "//*[@id='firstName']")
//	WebElement firstname;
	
	@FindBy(xpath = "//*[@id='lastName']")
	private WebElement lastname;
		
	@FindBy(xpath = "//*[@id='userEmail']")
	private	WebElement useremail;
	
	@FindBy(xpath = "//*[@id='userMobile']")
	private	WebElement phonenumber;
	
	@FindBy(xpath = "//*[@id='userPassword']")
	private	WebElement password;
	
	@FindBy(xpath = "//form//select")
	private	WebElement occupationDropdown;
	
	@FindBy(xpath = "//*[@value='Male']")
	private	WebElement radioButton;
	
	@FindBy(xpath = "//*[@id='confirmPassword']")
	private	WebElement confirmPassword;
	
	@FindBy(xpath = "//*[@type='checkbox']")
	private	WebElement checkbox;
	
	@FindBy(xpath = "//*[@id='login']")
	private	WebElement registerfinalButton;
	
	
	@FindBy(xpath = "//*[text()='Login']")
	WebElement loginButton;
	
	public RegisterUser(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnRegister()
	{
		registerbutton.click();
	}
	
	public void enteringDetails(String emailvalue)
	{
		WebElement name = driver.findElement(firstname);
		
		name.sendKeys("dgfjd");
//		firstname.sendKeys("SeptUser");
		lastname.sendKeys("Morningbatch");
		useremail.sendKeys(emailvalue);
		phonenumber.sendKeys("9988776655");
	
		Select selOccupation = new Select(occupationDropdown);
		
		selOccupation.selectByVisibleText("Engineer");
		
		radioButton.click();
		
		password.sendKeys("Test@1234");
		
		confirmPassword.sendKeys("Test@1234");
		
		checkbox.click();
		
		registerfinalButton.click();
		
	}
	
	public void clickOnLoginButton()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		loginButton.click();
	}
	
	
	
	
	
	
}
