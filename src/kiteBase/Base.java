package kiteBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class Base
{
     protected WebDriver driver;
	 public void openBrowser() 
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		opt.addArguments("incognito");
		driver=new ChromeDriver(opt);
		driver.get("https://kite.zerodha.com/");
		Reporter.log("Launching Browser",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	}
}
