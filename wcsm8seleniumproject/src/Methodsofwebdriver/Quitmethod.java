package Methodsofwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Quitmethod {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
			ChromeOptions op = new ChromeOptions();
			op.addArguments("--remote-allow-origins=*");
		
			ChromeDriver driver = new ChromeDriver(op);
			driver.manage().window().maximize();

			driver.get("http://omayo.blogspot.com/");
			driver.findElement(By.id("selenium143")).click();
			
			Thread.sleep(4000);
			driver.quit();
			

	}

}
