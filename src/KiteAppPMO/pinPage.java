package KiteAppPMO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pinPage 
{

	@FindBy(id = "pin") private WebElement pin;
	@FindBy(xpath = "//button[@type='submit']")private WebElement continueButton;
	
	
	public pinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void sendPin() 
	{
		pin.sendKeys("982278");
	}
	
	public void sendContinueButton() 
	{
		continueButton.click();
	}
}

