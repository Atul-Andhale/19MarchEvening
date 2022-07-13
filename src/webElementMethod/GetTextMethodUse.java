package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethodUse {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//h1[contains(text(),'Welcome')]"));
		//1
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Welcome')]")).getText());
		
		//2
		WebElement element = driver.findElement(By.xpath("//h1[contains(text(),'Welcome')]"));
		
		System.out.println(element.getText());
		
		//3
		String text = element.getText();
		System.out.println(text);

	}

}
