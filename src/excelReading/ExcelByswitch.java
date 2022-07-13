package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelByswitch {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File Myfile= new File("E:\\Class\\excel file\\Book1.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(Myfile).getSheet("Sheet2");
		int totalRows = mySheet.getLastRowNum();
		int rowsCount = totalRows;
		short totalColumn = mySheet.getRow(rowsCount).getLastCellNum();
		int columnCount = totalColumn-1;
		
		for(int i=0;i<=rowsCount;i++) 
		{
			for(int j=0; j<=columnCount;j++) 
			{
				Cell mycell = mySheet.getRow(i).getCell(j);

				switch (mycell.getCellType())
				{
				case STRING:
					String value = mycell.getStringCellValue();
					System.out.print(value+" ");
					break;
					
				case NUMERIC:
					double value1 = mycell.getNumericCellValue();
					System.out.print(value1+" ");
					break;
					
				case BOOLEAN:
					 boolean value2 = mycell.getBooleanCellValue();
					System.out.print(value2+" ");
					break;
				
					
				}
				
			}System.out.println();
		}
		
	}

}
