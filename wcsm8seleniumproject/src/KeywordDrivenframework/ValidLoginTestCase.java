package KeywordDrivenframework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginTestCase extends BaseTest implements IAutoConstant{

	public static void main(String[] args) throws IOException, InterruptedException {

		BaseTest bt = new BaseTest();
		Flib fb = new Flib();
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		bt.openBrowser();
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys(fb.readPropertyData(PROP_PATH,"username"));
		driver.findElement(By.name("pwd")).sendKeys(fb.readPropertyData(PROP_PATH, "password"));
		driver.findElement(By.id("loginButton")).click();

		
		
		
		Thread.sleep(2000);
		bt.tearDown();
	}

}
