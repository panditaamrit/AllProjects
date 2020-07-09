package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jira_A {
	
	public static void main(String args[]) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jira.jaggedpeak.com");
		
		WebElement Uname= driver.findElement(By.xpath("//input[@name='os_username']"));
		Uname.sendKeys("apandita");
		
		WebElement Pwd = driver.findElement(By.xpath("//input[@name='os_password']"));
		Pwd.sendKeys("Flamingo456#");
		
		WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
		login.click();
		Thread.sleep(5000);
		
		WebElement board = driver.findElement(By.linkText("EDGE Development"));
		board.click();
		
		
		
	}

}
