package KeywordDrivenframework;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flib {
			 
		/////////////////////////////////////////////////////////////////////////////////////////////////////
			 public static void actitime()
				{
					  driver.get("http://127.0.0.1/login.do;jsessionid=8nmhi48eek58d");	
				}
		////////////////////////////////////////////////////////////////////////////////////////////////////
			 static WebDriver driver;
			 
			 public static void launch(String browser)
			 {
				 
				 if(browser.equalsIgnoreCase("chrome"))
				 	{
					 	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
					 	ChromeOptions op = new ChromeOptions();
					 	op.addArguments("--remote-allow-origins=*");
					 	driver = new ChromeDriver(op);
				 	}
				 else if(browser.equalsIgnoreCase("firefox"))
					{	
					 
					 ChromeOptions op = new ChromeOptions();
					 	op.addArguments("--remote-allow-origins=*");
					 	driver=new FirefoxDriver();
					}
			 }
			 
////////////////////////////////////////////////////////////////////////////////////////////////////			 
			 
			 public String getexceldata(String excelpath,String valid,int row,int cell) throws EncryptedDocumentException, IOException
			 {
				 FileInputStream file = new FileInputStream(excelpath);
					Workbook wb = WorkbookFactory.create(file);
					
					Sheet sheet = wb.getSheet(valid);
					Row rw = sheet.getRow(row);
					Cell ce = rw.getCell(cell);
					String data = ce.getStringCellValue();
					return data;
			 }
			 
////////////////////////////////////////////////////////////////////////////////////////////////////			 
			 
			public int rowcount(String excelpath,String sheetname) throws EncryptedDocumentException, IOException
			{
				FileInputStream file = new FileInputStream(excelpath);
				Workbook wb = WorkbookFactory.create(file);
				
				Sheet sheet = wb.getSheet(sheetname);
				int rc = sheet.getLastRowNum();
			return rc;
			}
/////////////////////////////////////////////////////////////////////////////////////////////////////////
			
			public String readPropertyData(String proppath,String key) throws IOException
			{
				
				FileInputStream fis = new FileInputStream(proppath);
				Properties prop = new Properties();
				prop.load(fis);
				String data = prop.getProperty(key);
				return data;
			}
		 }



