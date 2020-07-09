package SeleniumTraning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog1 {
	
	public static void main(String args[]) {
	
	System.setProperty("webdriver.chrome.driver", "D://softwares//drivers//chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("http://www.newtours.demoaut.com/");
	driver.manage().window().maximize();
	
	/*driver.findElement(By.name("userName")).sendKeys("mercury");
	driver.findElement(By.name("password")).sendKeys("mercury");
	driver.findElement(By.name("login")).click();*/
	
	
	driver.findElement(By.xpath(".//input[@name='userName']")).sendKeys("mercury");
	driver.findElement(By.xpath(".//input[@name='password']")).sendKeys("mercury");
	driver.findElement(By.xpath(".//input[@value='Login']")).click();
	
	
	}

}
