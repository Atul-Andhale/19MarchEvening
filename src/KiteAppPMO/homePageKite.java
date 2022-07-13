package KiteAppPMO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePageKite 
{
	@FindBy(xpath = "//span[@class=\"user-id\"]")private WebElement userID;
	@FindBy(xpath = "//a[@target=\"_self\"]") private WebElement logoutButton;
	
	
	public homePageKite(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validateUserName ()
	{
		String expectedUserName = "ELR321";
		String actualUserNmae = userID.getText();
		
		if(expectedUserName.equals(actualUserNmae)) 
		{
			System.out.println("TC is passed");
			
		}
		else {System.out.println("TC is failed");}
	}
	
	public void ClickLogout () throws InterruptedException
	{
		userID.click();
		Thread.sleep(200);
		logoutButton.click();
		Thread.sleep(1000);
	}
	

}
