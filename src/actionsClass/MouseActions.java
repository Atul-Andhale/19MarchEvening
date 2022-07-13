package actionsClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		
		//creat object of actions class and pass webdrivers object
		
		Actions act=new Actions(driver);
		
		//identify element where action to perform
		
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//Using Action method perform desire action
		//1. method
//		act.moveToElement(rightClickButton).perform(); //move mouse to desire location
//		act.contextClick().perform();  //to right click on botton
		
		//2 method
		
//		act.moveToElement(rightClickButton).contextClick().build().perform();
		
		//3 method
		//act.contextClick(rightClickButton).perform();
		
		
		// double click using actions class
 
		WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		act.moveToElement(doubleclick).perform();
		act.doubleClick(doubleclick).perform();
		
		Alert al = driver.switchTo().alert();
		al.accept();
		
	}

}
