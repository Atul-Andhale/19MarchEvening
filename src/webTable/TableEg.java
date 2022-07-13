package webTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEg {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		
		// no of rows
		List<WebElement> noOfrows = driver.findElements(By.xpath("//table//tr"));
		 int TotalRows = noOfrows.size();
		 System.out.println(TotalRows);
		 
		 //no of columns
		List<WebElement> columnNo = driver.findElements(By.xpath("//table//tr[1]//th"));
		 int Totalcolumn = columnNo.size();
		 System.out.println(Totalcolumn);
		 
		 System.out.println("==================");
		 //how to header
		 for(WebElement r:columnNo)
		 {
			 System.out.println(r.getText());
		 }
		 
		 System.out.println("==================");
		 //how to read all rows
		 Iterator<WebElement> it = noOfrows.iterator();
		 while(it.hasNext()) 
		 {
			 System.out.print(it.next().getText()+" ");
			 System.out.println();
		 }

	}

}
