package kiteTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteBase.Base;
import kitePOMNew.KiteHomePage1;
import kitePOMNew.KiteLogInPage1;
import kitePOMNew.KitePinPage1;
import kiteUtility.Utility;

public class ValidateUserID extends Base
{
	KiteLogInPage1 login;
	KitePinPage1 pin;
	KiteHomePage1 home; 
	
	
	@BeforeClass
	public void launchBrowser() 
	{
		openBrowser();
		login=new KiteLogInPage1(driver);
		pin=new KitePinPage1(driver);
		
	}
	
	@BeforeMethod
	public void logIntokiteApp() throws EncryptedDocumentException, IOException 
	{
		login.senduserName(Utility.readDataFromExcel(7, 0));
		login.sendpassword(Utility.readDataFromExcel(7, 1));
		login.clickLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		pin.sendPIN(Utility.readDataFromExcel(7, 2));
		pin.ClickContinue();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	}
	
  @Test
  public void validateUserID() throws EncryptedDocumentException, IOException 
  {
	Assert.assertEquals(home.getActualUserName(), Utility.readDataFromExcel(7, 0), "Actual and Expected Not matching TC failed");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000)); 
  }
  
  @AfterMethod
  public void logoutFromKite() throws InterruptedException 
  {
	  home.ClickLogout();
  }
  @AfterClass
  public void closeBrowser()
  {
	 driver.close();
  }
}
