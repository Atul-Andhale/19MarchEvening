package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.discoveryplus.in/");
			Thread.sleep(8000);
			
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		
		Thread.sleep(1000);
			
		driver.findElement(By.xpath("//button[text()='Get OTP']"));
			
			WebElement getOTP = driver.findElement(By.xpath("//button[text()='Get OTP']"));
			
			boolean result = getOTP.isEnabled();
			
			System.out.println(result);
			
			//
			
			

	}

}
