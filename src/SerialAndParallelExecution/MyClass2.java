package SerialAndParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass2 {
  @Test
  public void myMethod2() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(1000);
			Reporter.log("My Method 2 is running",true);
  }
}
