package KiteAppPMOUsingExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testPMO {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		File Myfile= new File("E:\\Class\\excel file\\Book1.xlsx");
		Sheet mySheet = WorkbookFactory.create(Myfile).getSheet("Sheet2");
		String UN = mySheet.getRow(7).getCell(0).getStringCellValue();
		String PS = mySheet.getRow(7).getCell(1).getStringCellValue();
		String PN = mySheet.getRow(7).getCell(2).getStringCellValue();
	
		
		
		
		
		
		
			 System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://kite.zerodha.com/");
				Thread.sleep(1000);
				
				logInPageExcel log=new logInPageExcel(driver);
				
				log.senduserName(UN);
				log.sendpassword(PS);
				log.clickLoginButton();
				Thread.sleep(4000);
				
				pinPageExcel PP= new pinPageExcel(driver);
				PP.sendPIN(PN);
				PP.ClickContinue();
				
				Thread.sleep(2000);
				homeExcel HE= new homeExcel(driver);
				HE.ValidateID(UN);
				HE.ClickLogout();
				
				driver.close();
				

	

}}