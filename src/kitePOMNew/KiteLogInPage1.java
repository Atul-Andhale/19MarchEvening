package kitePOMNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogInPage1 
{

	@FindBy(id="userid")private WebElement userName;
	@FindBy(id="password")private WebElement password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement logInButton;
	
	public KiteLogInPage1 (WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	public void senduserName(String UserName)
	{
		userName.sendKeys(UserName);
	}
	
	public void sendpassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickLoginButton( ) 
	{
		logInButton.click();
	}
}
