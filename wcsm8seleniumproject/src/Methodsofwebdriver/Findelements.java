// findelements (Bing suggestion printing) / get(int index) / getText() / Thread.sleep(sec) / close()


package Methodsofwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Findelements {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		op.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(op);
		
		driver.get("https://www.bing.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("sb_form_q")).sendKeys("java");
		Thread.sleep(3000);
		List<WebElement> allopt = driver.findElements(By.xpath("//ul[@id='sa_ul']/li"));
		Thread.sleep(2000);
		for(int i =1;i<allopt.size();i++)
		{
			String st = allopt.get(i).getText();
			System.out.println(st);
			
		}
		
		
		
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
