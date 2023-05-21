package Datadrivenpro;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadAllFilesfromExcel 
 {	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file = new FileInputStream("./data/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		Sheet sheet = wb.getSheet("Valid");
		int lrn = sheet.getLastRowNum();
		
		for(int i =0;i<lrn;i++)
		{
			FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
			wb=WorkbookFactory.create(fis);
			Sheet sheet1 = wb.getSheet("Valid");
			Row sh = sheet1.getRow(i);				
			Cell ce = sh.getCell(1);
			String data = ce.getStringCellValue();
			System.out.println(data);
		}
	
		
	}

 }
