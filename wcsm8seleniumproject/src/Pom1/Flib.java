package Pom1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	// READEXCELDATA METHOD
	public void readExcelData(String excelfile, String sheetname, int rownum, int cellnum)
			throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(excelfile);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String data = cell.getStringCellValue();
		System.out.println(data);

	}

	// WRITEEXCELDATA
	public void writeExcelData(String excelfile, String sheetname, int rownum, int cellnum) throws EncryptedDocumentException, IOException
	{
	FileInputStream fis1 = new FileInputStream("./data/actitimecredentials.xlsx");
	Workbook wb1 = WorkbookFactory.create(fis1);
	}
	// READPROPERTYDATA

	// ROWCOUNT
	public void rowcount() throws EncryptedDocumentException, IOException
	{
	FileInputStream fis2 = new FileInputStream("./data/actitimecredentials.xlsx");
	Workbook wb2 = WorkbookFactory.create(fis2);
}
}