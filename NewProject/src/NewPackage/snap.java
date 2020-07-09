package NewPackage;
import java.awt.Robot;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class snap {
	
	public static void getScreen(String s)
	{
		 try {	
		 
			 	System.setProperty("webdriver.chrome.driver", "D:\\softwares\\drivers\\chromedriver.exe");
			 	
			 	WebDriver driver = new ChromeDriver();
				driver.get("https://autos.maxabout.com/bikes/royal-enfield/thunderbird/thunderbird-350x");
				
				
				Actions action = new Actions(driver);
				
				
				String Title=driver.getTitle();
				System.out.println(Title);
				
				
	            String fileName = "D:\\AutomationSnap\\"+s+driver.getWindowHandle()+".jpg";
	             System.out.println(fileName);
	           //Thread.sleep(1000);
	             WebElement ele= driver.findElement(By.xpath(".//h5[contains(text(),'LIGHTING')]"));
	             action.moveToElement(ele).build().perform();
	             Point p= ele.getLocation();
	             int height = p.getY();
	             JavascriptExecutor js = ((JavascriptExecutor)driver);
	             height = height-200;
	             js.executeScript("window.scrollTo(0,"+height+")");
	             
               File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
               FileUtils.copyFile(scrFile, new File(fileName));
               Thread.sleep(1000);
               
               Thread.sleep(1000);
              
	             
	            System.out.println("A full screenshot saved!"); 
	        } catch (Exception ex) 
		 	{
	            System.err.println(ex);
	            ex.printStackTrace();
	        }
	}
	
	public static void main(String args[])
	{
		snap.getScreen("screenshot");
		
		
	}

}
