package Qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//-------------------------------------------------------------------
public class launch {
	public static void main(String[] args)
	{
		//input();
	}
//------------------------------------------------------------------------------
	
	
static WebDriver driver;
	
	
	public static void chrome()
{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeOptions op = new ChromeOptions();
	op.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(op);	
	driver.manage().window().maximize();
	
	
}

public static void firefox()
{
	ChromeOptions op = new ChromeOptions();
	op.addArguments("--remote-allow-origins=*");
	driver = new FirefoxDriver();
}


public static void edge()
{
	System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
	driver = new EdgeDriver();
}


	public static void input() 
	{
			Scanner input = new Scanner(System.in);
			System.out.println("SELECT BROWSER YOU WANT TO OPEN");
			String in = input.nextLine();
	
	
			if(in.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				ChromeOptions op = new ChromeOptions();
				op.addArguments("--remote-allow-origins=*");
				driver = new ChromeDriver(op);	
			}
			else if(in.equalsIgnoreCase("firefox"))
			{
				ChromeOptions op = new ChromeOptions();
				op.addArguments("--remote-allow-origins=*");
				driver = new FirefoxDriver();
			}
			else if(in.equalsIgnoreCase("edge"))
			{
				System.setProperty("webdriver.msedge.driver","./drivers/msedgedriver.exe");
				driver = new EdgeDriver();
			}
	
			
			
			
	}

}
