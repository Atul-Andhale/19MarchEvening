package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//getMethod : use to entr url in browser or to open application
		
		driver.get("https://www.facebook.com/");
		
		//Close method : use to close tab of browser opened by selenium tool
		
		//driver.close();
		
		//quit method : use to close all tab present in browser
		//driver.quit();
		
		//maximize and minimize method : use to maximize and minimize size of chrome 
		
		//driver.manage().window().maximize();
		
		//driver.manage().window().minimize();
		
		
		// navigate method : use to open application and move forward ,backward and refresh the page
		
//		driver.navigate().to("https://www.cricbuzz.com/");
//		Thread.sleep(100);
//		
//		driver.navigate().back();
//		Thread.sleep(200);
//		
//		driver.navigate().forward();
//		Thread.sleep(200);
//		
//		driver.navigate().refresh();
		
		
	
		//getTittle: use to get title of page and return type is in string
		
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		String title = driver.getTitle();
		System.out.println("Title is "+ title);
		
		
		//getcurrentURL: use to get url get current url of page and return type is in string
		
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		
		
		
		
		
		
		

	}

}
