package kiteUtility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility 
{
 

		
		
	

	public static String readDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException {
		File Myfile= new File("E:\\Class\\excel file\\Book1.xlsx");
        Sheet mySheet = WorkbookFactory.create(Myfile).getSheet("Sheet2");
	    String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
		
		return value;
	}
}
