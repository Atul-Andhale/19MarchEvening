package kiteApp;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteAppUsingExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		File Myfile= new File("E:\\Class\\excel file\\Book1.xlsx");
		Sheet mySheet = WorkbookFactory.create(Myfile).getSheet("Sheet2");
		String userID1 = mySheet.getRow(7).getCell(0).getStringCellValue();
		String pass = mySheet.getRow(7).getCell(1).getStringCellValue();
		String pin1 = mySheet.getRow(7).getCell(2).getStringCellValue();
		
		

			System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://kite.zerodha.com/");
			Thread.sleep(1000);
			
			WebElement userID = driver.findElement(By.id("userid"));
			WebElement password = driver.findElement(By.id("password"));
			WebElement logInButton = driver.findElement(By.xpath("//button[@type='submit']"));
			
			userID.sendKeys(userID1);
			password.sendKeys(pass);
			logInButton.click();
			Thread.sleep(2000);
			
			WebElement pin = driver.findElement(By.id("pin"));
			WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
			
			pin.sendKeys(pin1);
			continueButton.click();
			Thread.sleep(1000);
			
			WebElement userName = driver.findElement(By.xpath("//span[@class='user-id']"));
			String actualUserName = userName.getText();
			String expectedUserName = userID1;
			
			if(actualUserName.equals(expectedUserName)) 
			{
				System.out.println("UserID ismatching TC is passed");
			}
			else 
			{
				System.out.println("UserID is not matching TC is failed");
			}
			
			userName.click();
			Thread.sleep(200);
			driver.findElement(By.xpath("//a[@target='_self']")).click();
			Thread.sleep(2000);
			driver.close();


	}

}
