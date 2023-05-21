package Dailyclassprograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;








public class Actitimewithdatadriven {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
//		DATA DRIVEN FRAMEWORK (ADD ALL JAR FILES OF APACHE POI INTO JAR FOLDER AND ADD ALL TO PATH)
		
		//CREATE FOLDER AS DATA IN PROJECT -OPEN IT AND CREATE NEW EXCEL FILE AND SAVE DATA AND CLOSE IT 
		
		// TO READ DATA FROM CREATE OBJECT OF (FileInputStream class)
		// FileInputStream class
		// WorkBookFactory class with create method
		// Workbook interface
		// Sheet interface
		// Row interface
		// Cell interface
		
		FileInputStream path = new FileInputStream("./data/Testdata.xlsx");
		
		Workbook wb = WorkbookFactory.create(path);
		
		Sheet sheet = wb.getSheet("Valid");
		
		Row row = sheet.getRow(0);
		
		Cell cell = row.getCell(1);
			
		String data = cell.getStringCellValue();
		
System.out.println(data);
	
	
	}


}


