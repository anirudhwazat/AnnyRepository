package Methodsofwebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Setpositionofbrowser {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(op);
		
		Dimension dm = new Dimension(300,300);
		Thread.sleep(2000);
		driver.manage().window().setSize(dm);
		
		
		Point po = new Point(200,300);
		Thread.sleep(2000);
		driver.manage().window().setPosition(po);
		
		
		
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		

	}

}
