package KiteAppPMO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logInPage 
{
	//1. Data members
	
	@FindBy(id="userid")private WebElement userName;
	@FindBy(id="password")private WebElement password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement logInButton;
	
	//2.Constructor
	
	public logInPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//3.Methods
	
	public void SendUserName() 
	{
		userName.sendKeys("ELR321");
	}
	
	
	public void SendPassword() 
	{
		password.sendKeys("Dhana1111");
	}
	
	public void Logbutton() 
	{
		logInButton.click();
	}
}
