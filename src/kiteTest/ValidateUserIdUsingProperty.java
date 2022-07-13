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

import kiteBase.BaseNew;
import kitePOMNew.KiteHomePage1;
import kitePOMNew.KiteLogInPage1;
import kitePOMNew.KitePinPage1;
import kiteUtility.Utility;
import kiteUtility.UtilityProp;

public class ValidateUserIdUsingProperty extends BaseNew{
	KiteLogInPage1 login;
	KitePinPage1 pin;
	KiteHomePage1 home; 
	String TCID="555";
	
	
	@BeforeClass
	public void launchBrowser() throws IOException 
	{
		openBrowser();
		login=new KiteLogInPage1(driver);
		pin=new KitePinPage1(driver);
		home=new KiteHomePage1(driver);
		
	}
	
	@BeforeMethod
	public void logIntokiteApp() throws EncryptedDocumentException, IOException 
	{
		login.senduserName(UtilityProp.getDataFromProprtyFile("UN"));
		login.sendpassword(UtilityProp.getDataFromProprtyFile("PWD"));
		login.clickLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		pin.sendPIN(UtilityProp.getDataFromProprtyFile("PIN"));
		pin.ClickContinue();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	}
	//Assert.assertEquals(home.getActualUserName(), UtilityProp.getDataFromProprtyFile("UN"), "Actual and Expected Not matching TC failed");
  @Test
  public void validateUserID() throws EncryptedDocumentException, IOException 
  {
	Assert.assertEquals(home.getActualUserName(), UtilityProp.getDataFromProprtyFile("UN") );
	UtilityProp.captureScreenShot(driver, TCID);
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
