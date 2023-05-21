package AllPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Methodsofwebdriver2 {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeOptions op = new ChromeOptions();
			op.addArguments("--remote-allow-origins=*");
			
		
		ChromeDriver driver = new ChromeDriver(op);		
			driver.manage().window().maximize();
			driver.get("http://omayo.blogspot.com/");
			driver.findElement(By.id("ta1")).sendKeys("I love india  !!!!");			// sendkeys(""):
			WebElement button = driver.findElement(By.xpath("//button[@id='but2']"));		
			button.click();																// click();
			boolean verifybutton = button.isEnabled();									//isEnabled();
			System.out.println(verifybutton);
			
			driver.findElement(By.id("selenium143")).click();
		
		
		Thread.sleep(4000);
		driver.close();
		
		
		
		
		
		
	}

}
