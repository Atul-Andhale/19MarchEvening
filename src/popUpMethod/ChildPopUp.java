package popUpMethod;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopUp {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://skpatro.github.io/demo/links/");
			Thread.sleep(2000);
			
			String mainPageID = driver.getWindowHandle(); //to get main page id
			System.out.println(mainPageID);
			
			System.out.println("==================");
			 
			//to open child window
			driver.findElement(By.name("NewWindow")).click();
			Thread.sleep(2000);
			
			//to get all page ids
			Set<String> allPageIds = driver.getWindowHandles();
			
			Iterator<String> it = allPageIds.iterator();
			
		    String mainPage = it.next();
		    String childPage = it.next();
		    
		    driver.switchTo().window(childPage);
		    driver.manage().window().maximize();
		    
		    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Selenium");
		    
		    driver.close();
		    
		    
		   
	 

	}

}
