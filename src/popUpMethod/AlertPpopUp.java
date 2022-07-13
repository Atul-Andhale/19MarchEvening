package popUpMethod;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPpopUp {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		
		driver.findElement(By.id("alertButton")).click();
		
		//to handle alert popup we need to switch selenium focus from main 
		//page to alert popup by using syntax
		
		Alert al = driver.switchTo().alert();
		//Alert is an interface which cantains abstract method like
		//1. accept(); use to click on ok button
		//2. dismiss(); use to click on cancel button
		//3. getText(); use to get text text present alert popup 
		
		System.out.println(al.getText());
		Thread.sleep(2000);
		
		al.accept();
		
		driver.findElement(By.id("timerAlertButton")).click();
		
		
		
		

	}

}
