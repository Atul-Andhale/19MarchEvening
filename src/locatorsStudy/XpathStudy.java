package locatorsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathStudy {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		//driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).click();
		
		driver.findElement(By.xpath("//input[value='I'm Feeling Lucky']"));
		
	}

}
