package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExceleEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{ 
		//need to create object of file class
		
		File Myfile= new File("E:\\Class\\excel file\\Book1.xlsx");
		
		//Using WorkbookFactory class call create method and pass details
		//to read string type value 
		
		String Name = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(Name);
		
		double Number = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();

		System.out.println(Number);
		
	    boolean value1 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(1).getCell(1).getBooleanCellValue();

	    System.out.println(value1);
	
				
	
	}

}
