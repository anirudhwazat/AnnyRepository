package PageObjectModel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public String readExcelData(String excelpath) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Invalid");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String data = cell.getStringCellValue();
		return data;
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public String readPropertyData(String proppath, String key) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(proppath);
		Properties pro = new Properties();
		pro.load(fis);
		String propdata = pro.getProperty(key);
		return propdata;
	}

	public void writeExcelData(String excelpath) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Invalid");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String data = cell.getStringCellValue();
		FileOutputStream fo = new FileOutputStream(excelpath);
		wb.write(fo);

	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public int rowcount(String excelpath) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Invalid");
		int rc = sheet.getLastRowNum();
		return rc;
	}
}
