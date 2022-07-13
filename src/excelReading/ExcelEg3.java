 package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	File Myfile= new File("E:\\Class\\excel file\\Book1.xlsx");
		
	Sheet mySheet = WorkbookFactory.create(Myfile).getSheet("Sheet2");
	int totalRows1 = mySheet.getLastRowNum();
	int rowsCount = totalRows1;
	System.out.println(totalRows1);
	 
	short totalColumn = mySheet.getRow(totalRows1).getLastCellNum();
	
	int columnCount = totalColumn-1;
	System.out.println(columnCount);
	
	System.out.println(mySheet.getRow(0).getCell(1).getCellType());
	System.out.println("===================================");
	for(int i=0;i<=rowsCount;i++) 
	{
		for(int j=0;j<=columnCount;j++)
		{
			Cell myCell = mySheet.getRow(i).getCell(j);
			CellType dataType = myCell.getCellType();
			
			if(dataType==CellType.STRING) 
			{
				String value = myCell.getStringCellValue();
				System.out.print(value+" ");
			}
			else if (dataType==CellType.NUMERIC)
            {
				double value = myCell.getNumericCellValue();
				System.out.print(value+" ");
            }
			else if (dataType==CellType.BOOLEAN)
            {
				 boolean value = myCell.getBooleanCellValue();
				 System.out.print(value+" ");
				 
            }
			else if (dataType==CellType.BLANK)
            {
				System.out.print(" ");
            }
			
			
		}System.out.println();
	}
	
	

	    
	
	
	

	}

}
