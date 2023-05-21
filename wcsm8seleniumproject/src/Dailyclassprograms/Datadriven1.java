package Dailyclassprograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Datadriven1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		
		FileInputStream fis = new FileInputStream("./data/Testdata.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet = wb.getSheet("Valid");
		
		for(int i =1;i<10;i++)
		{
			Row row = sheet.getRow(i);
			
			Cell cell = row.getCell(1);
		
			String data = cell.getStringCellValue();
		
			System.out.println(data);
		}
		
		
		
		
	}

}
