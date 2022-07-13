package popUpMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivPopup {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("One plus Nord 10R");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
