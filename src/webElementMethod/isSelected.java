package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			Thread.sleep(1000);
			
			driver.findElement(By.name("checkBoxOption1"));
			
			WebElement checkbox = driver.findElement(By.name("checkBoxOption1"));
			
			boolean result = checkbox.isSelected();
			System.out.println(result);
			
			checkbox.click();
			
			boolean result1 = checkbox.isSelected();
			System.out.println(result1);

	}

}
