package KiteAppPMOUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pinPageExcel 
{
	@FindBy(id = "pin") private WebElement pin;
    @FindBy(xpath = "//button[@type='submit']")private WebElement continueButton;

    public pinPageExcel(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    
    public void sendPIN(String PinNumber) 
    {
    	pin.sendKeys(PinNumber);
    }
    
    public void ClickContinue()
    {
    	continueButton.click();
    }
}
