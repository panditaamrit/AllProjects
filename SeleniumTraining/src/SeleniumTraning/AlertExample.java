package SeleniumTraning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AlertExample {
	
	public static void main(String [] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "D://softwares//drivers//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		WebElement ele = driver.findElement(By.name("q"));
		
		//action class compiles series of actions
		
		
		Actions builder= new Actions(driver);
		Action seriesofactions = builder.moveToElement(ele).click().keyDown(ele, Keys.SHIFT).sendKeys(ele, "selenium").keyUp(ele, Keys.SHIFT).doubleClick(ele).contextClick().build();
		seriesofactions.perform();
			
		
	}
	

}
   