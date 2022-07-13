package kiteLogInTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	@FindBy(xpath = "//span[@class=\"user-id\"]")private WebElement userID;
	@FindBy(xpath = "//a[@target=\"_self\"]") private WebElement logoutButton;
	
	public KiteHomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ValidateID(String expectedUserID)
	{
		String actualID = userID.getText();
		String expectedUserName = expectedUserID;
		
		if(expectedUserName.equals(actualID)) 
		{
			System.out.println("TC is passed");
			
		}
		else {System.out.println("TC is failed");}
	}
	public String getActualUserName() 
	{
		String actualUserName = userID.getText();
		return actualUserName;
	}

	public void ClickLogout () throws InterruptedException
	{
		userID.click();
		Thread.sleep(200);
		logoutButton.click();
		Thread.sleep(1000);
		}
}
