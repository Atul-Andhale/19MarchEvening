package SerialAndParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass1 {
  @Test
  public void myMethod1() throws InterruptedException
{
	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		Reporter.log("My Method 1 is running",true);
  }
}
