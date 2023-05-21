
package Methodsofwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Closemethod {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	ChromeOptions op = new ChromeOptions();
	op.addArguments("--remote-allow-origins=*");
	
	ChromeDriver driver = new ChromeDriver(op);
	
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	driver.close();
	
	
	
	
	
	
	}
		
	
	

}
