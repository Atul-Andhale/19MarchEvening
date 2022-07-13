package excelReading;

import java.io.File;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File Myfile= new File("E:\\Class\\excel file\\Book1.xlsx");
		
		Workbook Work = WorkbookFactory.create(Myfile);
		Sheet mySheet = Work.getSheet("Sheet1");
		Row noRows = mySheet.getRow(0);
		Cell noColumn = noRows.getCell(0);
		CellType cellInfo = noColumn.getCellType();
		System.out.println(cellInfo);
		
		System.out.println("======================================");
		
		Sheet Sheet1 = WorkbookFactory.create(Myfile).getSheet("Sheet2");
		
		for (int i = 0; i <=1; i++) 
		{ 
			for (int j = 0; j <=2; j++)
		{
			String value = Sheet1.getRow(i).getCell(j).getStringCellValue();
			System.out.print(value+" ");
		}
			System.out.println();
			
		}

		
	}

}
