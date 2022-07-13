package inFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Inframe {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/frames");
		Thread.sleep(1000);
		
		driver.switchTo().frame("frame1");
		
		driver.findElement(By.xpath("//input")).sendKeys("Welcome...");
		Thread.sleep(2000);
		
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@id='a']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		
		WebElement index = driver.findElement(By.id("animals"));
		
		Select s=new Select(index);
		s.selectByVisibleText("Avatar");
		
		driver.switchTo().defaultContent();
		WebElement text = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
		
		String a = text.getText();
		System.out.println(a);
		
		
		
		

	}

}
