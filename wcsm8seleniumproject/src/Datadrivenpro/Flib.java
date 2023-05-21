package Datadrivenpro;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

////////////////////////////////////////////////////////////////////////////////////////	 

	public String getexceldata(String excelpath, String valid, int row, int cell)
			throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(file);

		Sheet sheet = wb.getSheet("Invalid");
		Row rw = sheet.getRow(row);
		Cell ce = rw.getCell(cell);
		String data = ce.getStringCellValue();
		return data;
	}

////////////////////////////////////////////////////////////////////////////////////////////////////	 

	public int rowcount(String excelpath, String sheetname) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(file);

		Sheet sheet = wb.getSheet(sheetname);
		int rc = sheet.getLastRowNum();
		return rc;
	}

	public void writeexceldata(String excelpath, int row, int cell, String data1)
			throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(file);
		Sheet sheet = wb.getSheet("Valid");
		Row rw = sheet.getRow(row);
		Cell ce = rw.getCell(cell);
		String data = ce.getStringCellValue();
		FileOutputStream fout = new FileOutputStream(excelpath);
		wb.write(fout);
	}
}
