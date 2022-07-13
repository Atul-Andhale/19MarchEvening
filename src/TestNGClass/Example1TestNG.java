package TestNGClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example1TestNG {
  @Test
  public void Mymethod() throws InterruptedException
  {System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://kite.zerodha.com/");
	Thread.sleep(1000);
	
	System.out.println("Hi this is printing Statement");
	
	Reporter.log("Hi this is reporter output", true);
	
	
	
	
  }
  @Test
	public void test3() 
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
	}
}
