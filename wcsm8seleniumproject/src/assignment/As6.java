package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class As6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// set the properties of browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		// launching the browser
		ChromeDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();

		// implicit wait applied
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// launch the bluestone website
		driver.get("https://www.bluestone.com/");

		// Actions class object creation for mouse operations
		Actions act = new Actions(driver);

		// handling the popup
		driver.findElement(By.id("denyBtn")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// move to coins dropdown
		WebElement coinsdd = driver.findElement(By.xpath("//li[@id='goldCoins']/descendant::a[text()='Coins ']"));

		act.moveToElement(coinsdd).perform();
		Thread.sleep(2000);
		WebElement onegm = driver.findElement(By.xpath("//span[contains(@data-p,'l-gold-coins-weight-2gms,m')]"));
		onegm.click();

		Thread.sleep(4000);
	}

}
