package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		Thread.sleep(4000);
		WebElement day = driver.findElement(By.id("day"));
		
		Actions act=new Actions(driver);
		
		act.click(day).perform();
		
		for(int i=1; i<=5; i++) 
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		act.sendKeys(Keys.ENTER).perform();

	}

}
