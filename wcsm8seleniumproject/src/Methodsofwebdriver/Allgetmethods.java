package Methodsofwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Allgetmethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(op);
		
		driver.get("https://www.google.com/");
		
		///////////////////////////////////////////////
		//			getpagesourcecode
		
		String sourcecode = driver.getPageSource();
		//System.out.println(sourcecode);
		
		///////////////////////////////////////////////
		//			getcurrenturl
		
		String currenturl = driver.getCurrentUrl();
		System.out.println("CURRENT URL  :"+currenturl);
		
		///////////////////////////////////////////////
		//			gettitle
		
		String title = driver.getTitle();
		System.out.println("TITLE   :"+title);
		
		Thread.sleep(2000);
		driver.close();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
