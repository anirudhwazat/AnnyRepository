package Datadrivenpro;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readdatafromexcel1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		FileInputStream file = new FileInputStream("./data/TestData.xlsx");
		
		Workbook wb = WorkbookFactory.create(file);
		
		Sheet sheet = wb.getSheet("Invalid");
		
		int rc = sheet.getLastRowNum();
	
		for(int i = 0;i<rc;i++)
			
			{
				FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
			
				Workbook wb1 = WorkbookFactory.create(fis);
			
				Sheet sheet1 = wb.getSheet("Invalid");
			
				Row row = sheet1.getRow(i);
		
				Cell cell = row.getCell(1);
			
				String data = cell.getStringCellValue();
			
				System.out.println(data);
		
			
			}	
	}
}
