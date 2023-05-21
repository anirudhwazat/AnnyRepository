package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class As1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		Actions act = new Actions(driver);
		driver.findElement(By.id("denyBtn")).click();

		WebElement offerdropdown = driver.findElement(By.xpath("//span[text()='Offers ']"));
		act.moveToElement(offerdropdown).perform();

		WebElement offer10link = driver.findElement(
				By.xpath("//span[@class='prcs-d' and text()='10% Making Charges Off on Plain Gold Jewellery']"));
		offer10link.click();

		WebElement displayname = driver.findElement(
				By.xpath("//span[@class='filterDisplayName' and text()='10% Off On Making Charge On Plain Gold']"));
		String textofdisplayname = displayname.getText();

		if (textofdisplayname.equalsIgnoreCase("10% Off On Making Charge On Plain Gold")) {
			System.out.println("TEST CASE PASS");
		} else {
			System.out.println("TEST CASE FAIL");
		}

		Thread.sleep(2000);
		driver.close();
	}

}
