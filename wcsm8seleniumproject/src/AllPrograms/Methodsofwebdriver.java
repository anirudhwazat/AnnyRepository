

//	METHODS OF WEBDRIVER CLASS :
//	CLOSE / GET / GETTITLE / GETPAGESOURCECODE / GETTITLE / GETCURRENTURL / MANAGE /


package AllPrograms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Methodsofwebdriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

														//	LAUNCH CHROME BROWSER BY SETTING PATH TO AVOID ILLEGAL STATE EXCEPTION
//-----------------------------------------------------------------------------------------------
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
//-----------------------------------------------------------------------------------------------
		ChromeDriver driver = new ChromeDriver(op);		//lAUNCH CHROME BROWSER
//-----------------------------------------------------------------------------------------------		
		
														//  MAXIMIZE THE BROWSER = manage().window().maximize()
		driver.manage().window().maximize();
		
//----------------------------------------------------------------------------------------------
		


//----------------------------------------------------------------------------------------------

		
														//	LAUNCH A WEB PAGE THROUGH URL = get();
		driver.get("http://www.google.com/");
		
//----------------------------------------------------------------------------------------------
														//	GET PAGE SOURCE CODE = getPageSource();
		
		String pagesourcecode = driver.getPageSource();
		System.out.println("-------------------PAGE SOURCE CODE ");
		System.out.println();
		//System.out.println(pagesourcecode);
		
//----------------------------------------------------------------------------------------------		
														//	GET CURRENT URL = getCurrentUrl();
		String currenturl = driver.getCurrentUrl();
		System.out.println("-------------------PAGE CURRENT URL");
		System.out.println();
		System.out.println("    "+currenturl);
		
//----------------------------------------------------------------------------------------------
														//	TITLE OF WEB PAGE = getTitle();
		String pagetitle = driver.getTitle();
		System.out.println("-------------------PAGE TITLE ");
		System.out.println();
		System.out.println("    "+pagetitle);
		
//----------------------------------------------------------------------------------------------
														//	HOW TO ADD STATIC WAIT TO AVOID SYNCHRONIZATION 
														//we need to declare exception like throws InterruptedException)
		Thread.sleep(3000);
//----------------------------------------------------------------------------------------------
														// 	HOW TO CLOSE THE PARENT BROWSER
		driver.close();
		

		
		
		
		
	}

}
