package kiteUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityProp 
{
 public static void captureScreenShot(WebDriver driver, String TCID) throws IOException 
 { 
	 File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 File dest= new File("E:\\WORK\\screenshot\\MyScreenshot"+TCID+".png");
	 org.openqa.selenium.io.FileHandler.copy(src, dest);
	 
	 
 }
 
 public static String getDataFromProprtyFile(String key) throws IOException 
 {
	 Properties prop=new Properties();
	 FileInputStream myfile= new FileInputStream("C:\\Users\\user\\eclipse-workspace\\19MarchEveningBatch\\src\\myProperties.properties");
	 prop.load(myfile);
    String value = prop.getProperty(key);
	 return value;}
}
