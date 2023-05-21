package Datadrivenpro;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v108.network.model.LoadingFinished;

public class Actitime1 extends BaseTest {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {

		setUp("chrome");
		Thread.sleep(2000);
		driver.get("http://127.0.0.1/login.do;jsessionid=1eitljuwog8bg");

		Flib fb = new Flib();
		int rc = fb.rowcount("./data/actitimecredentials.xlsx", "Invalid");
		WebElement usertb = driver.findElement(By.xpath("//input[@name='username']"));
		usertb.clear();
		WebElement pwdtb = driver.findElement(By.xpath("//input[@name='pwd']"));
		pwdtb.clear();
		WebElement loginbutton = driver.findElement(By.id("loginButton"));

		for (int i = 1; i <= rc; i++) {

			usertb.clear();
			pwdtb.clear();
			String invalidusername = fb.getexceldata("./data/actitimecredentials.xlsx", "Invalid", i, 0);
			usertb.sendKeys(invalidusername);
			String invalidpassword = fb.getexceldata("./data/actitimecredentials.xlsx", "Invalid", i, 1);
			pwdtb.sendKeys(invalidpassword);
			loginbutton.click();

		}

		Thread.sleep(2000);
		driver.close();

	}

}
