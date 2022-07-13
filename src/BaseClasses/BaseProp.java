package BaseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseProp 
{
   protected static WebDriver driver;
	public void openBrowser() 
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
}
