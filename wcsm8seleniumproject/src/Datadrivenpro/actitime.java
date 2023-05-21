package Datadrivenpro;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class actitime extends Flib{

	
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(op);
		driver.get("http://127.0.0.1/login.do;jsessionid=b0krlcmql9acp");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		FileInputStream fi = new FileInputStream("./data/actitimecredentials.xlsx");
		Workbook wb = WorkbookFactory.create(fi);				
		
		Sheet sheet = wb.getSheet("Invalid");
		
		int rx = sheet.getLastRowNum();
		
/////////////////////////////////////////////////////////////////////////////////////////		
		for(int i =1;i<rx;i++)
		{
			FileInputStream fil = new FileInputStream("./data/actitimecredentials.xlsx");
			Workbook wb1 = WorkbookFactory.create(fil);				
			Sheet sheet1 = wb.getSheet("Invalid");
			Row rw = sheet.getRow(i);
			Cell ce = rw.getCell(0);
			
			String Username = ce.getStringCellValue();
			WebElement usrtb = driver.findElement(By.xpath("//input[@name='username']"));
			usrtb.sendKeys(Username);
			
			Sheet sheet2 = wb.getSheet("Invalid");
			Row rw1 = sheet.getRow(i);
			Cell ce1 = rw.getCell(1);
			
			String pass = ce.getStringCellValue();
			WebElement pwdtb = driver.findElement(By.xpath("//input[@name='pwd']"));
			pwdtb.sendKeys(pass);
			
			WebElement button = driver.findElement(By.id("loginButton"));
			button.click();
			
			Thread.sleep(2000);	
		}
	

	}

}
