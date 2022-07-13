package testNgKiteLogIn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteLogIn {
  WebDriver driver;
  @Test
  public void ValidateUserID() 
  { WebElement userName1 = driver.findElement(By.xpath("//span[@class='user-id']"));
  String actualID = userName1.getText();
  String expectedID="ELR321";
  
  if(actualID.equals(expectedID)) 
	{
		Reporter.log("TC passed",true);
		
	}
	else {Reporter.log("TC failed",true);}
}
  
  
  @BeforeClass
  public void openBrowser() 
  {
	    System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
  }
  
  @BeforeMethod
  public void logInIntoKiteApp() 
  {
	  driver.findElement(By.id("userid")).sendKeys("ELR321");
	
	  driver.findElement(By.id("password")).sendKeys("Dhana1111");
	
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	
  }
  
  @BeforeMethod
  public void enterPIN() 
  {
	    driver.findElement(By.id("pin")).sendKeys("982278");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
  }
  @AfterMethod
  public void logOut() 
  {
	   driver.findElement(By.xpath("//span[@class='user-id']")).click();
	
	   driver.findElement(By.xpath("//a[@target='_self']")).click();
	  
  }
  
  @AfterClass
  public void closeBrowser() 
  {
	  driver.close();
  }
  
}
