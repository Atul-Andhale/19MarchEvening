package KiteAppPMO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pmoTest {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		
		logInPage login= new logInPage(driver);
		login.SendUserName();
		login.SendPassword();
		login.Logbutton();
		
		Thread.sleep(4000);
		
		pinPage pin=new pinPage(driver);
		pin.sendPin();
		pin.sendContinueButton();
		
		Thread.sleep(2000);
		
		homePageKite home=new homePageKite(driver);
		home.validateUserName();
		home.ClickLogout();
		
		driver.close();
		
		

	}

}
