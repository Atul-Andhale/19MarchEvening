package dropDowm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("day"));
		driver.findElement(By.id("month"));
		driver.findElement(By.id("year"));
		
		
		 WebElement day =driver.findElement(By.id("day"));
		 Select s1=new Select(day);
		 s1.selectByValue("14");
		 
		 Thread.sleep(500);
		 
       WebElement month = driver.findElement(By.id("month"));
       Select s2=new Select(month);
       s2.selectByIndex(10);
       
       Thread.sleep(500);
       
     WebElement year = driver.findElement(By.id("year"));
       Select s3=new Select(year);
       s3.selectByValue("1996");
        
        
        
        
		
		
		
	}

}
