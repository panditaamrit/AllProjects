package SeleniumTraning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class selwait {

	public static void main(String [] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "D://softwares//drivers//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		WebElement ele = driver.findElement(By.name("q"));
		
			
		
	}
	
	
	
	
}
