package kiteLogInTestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateKiteAppUserName {
	WebDriver driver;
	Sheet mySheet;
	KiteLogInPage login;
	KitePinPage pin;
	KiteHomePage home;
	
	@BeforeClass
	public void launchBrowser() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		   System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
			ChromeOptions opt= new ChromeOptions();
			opt.addArguments("incognito");
			
			
			driver=new ChromeDriver();
			
			driver.get("https://kite.zerodha.com/");
			Reporter.log("Launching Browser",true);
			File Myfile= new File("E:\\Class\\excel file\\Book1.xlsx");
		    mySheet = WorkbookFactory.create(Myfile).getSheet("Sheet2");
		    login=new KiteLogInPage(driver);
		    pin=new KitePinPage(driver);
		    home=new KiteHomePage(driver);
		    
	}
	
	@BeforeMethod
	public void logInToKiteApp()
	{
		String UN = mySheet.getRow(7).getCell(0).getStringCellValue();
		String PS = mySheet.getRow(7).getCell(1).getStringCellValue();
		String PN = mySheet.getRow(7).getCell(2).getStringCellValue();
		
		login.senduserName(UN);
		Reporter.log("sending username",true);
		login.sendpassword(PS);
		Reporter.log("sending password",true);
		login.clickLoginButton();
		Reporter.log("Clicking on login button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		pin.sendPIN(PN);
		Reporter.log("sending pin",true);
		pin.ClickContinue();
		Reporter.log("Click on continueButton",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	}

	
	
   @Test
    public void validateUserName()
  {
	   String expectedUN = mySheet.getRow(7).getCell(0).getStringCellValue();
	   String actualUN = home.getActualUserName();
	   Reporter.log("Validating UserName",true);
	   Assert.assertEquals(actualUN, expectedUN,"Actual and expected UN not Matching TC failed");
	   Reporter.log("Actual and expected UN Matching TC Passed",true);
	   
  }
  
    @AfterMethod
    public void logOutFromKite() throws InterruptedException
    {
    	home.ClickLogout();
    	Reporter.log("Logging out...",true);
    	
    }
    
    @AfterClass
    public void closeBrowser() throws InterruptedException
    {
    	Thread.sleep(2000);
    	
    	Reporter.log("Closing Browser",true);
    	driver.close();
    }
}
