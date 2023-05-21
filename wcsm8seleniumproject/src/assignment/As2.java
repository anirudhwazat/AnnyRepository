package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class As2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// launch the bluestone website
		driver.get("https://www.bluestone.com/");
		Actions act = new Actions(driver);

		// handling the popup
		driver.findElement(By.id("denyBtn")).click();

		// move cursor to offers dropdown
		WebElement offerdropdown = driver.findElement(By.xpath("//span[text()='Offers ']"));
		act.moveToElement(offerdropdown).perform();

		// click on the 20% off link
		WebElement offer10link = driver
				.findElement(By.xpath("//span[@class='prcs-d' and text()='Up to 20% Off on Diamond Prices']"));
		offer10link.click();

		// inpecting the displayname of page and get the text to verify the web page is
		// 20% off or not
		WebElement displayname = driver.findElement(By.xpath("//span[@class='filterDisplayName']"));
		String textofdisplayname = displayname.getText();

		// verifying through if condition
		if (textofdisplayname.equalsIgnoreCase("Upto 20% Off On Diamond Price")) {
			System.out.println("TEST CASE PASS");
		} else {
			System.out.println("TEST CASE FAIL");
		}

		// closing the browser
		Thread.sleep(2000);
		driver.close();
	}

}
