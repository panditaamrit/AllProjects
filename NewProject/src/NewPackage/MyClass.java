package NewPackage;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.internal.seleniumemulation.KeyEvent;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class MyClass{


   public static void main(String[] args) throws InterruptedException

   {
	   System.setProperty("webdriver.chrome.driver", "D:\\softwares\\drivers\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       
       

       driver.get("http://google.com");
       WebElement element = driver.findElement(By.xpath(".//*[@name='btnK']"));
       String strng = element.getText();
       System.out.println(strng);
       Assert.assertEquals("Google Search", strng);
       
       //String S  = driver.findElement(By.xpath(".//*[@name='q']")).getAttribute("class");
      //String S  = driver.findElement(By.xpath(".//*[@id='SIvCob']")).getText();
       //String S  = driver.findElement(By.xpath(".//*[@name='btnK']")).getAttribute("innerText");
       //String elementname= ele.getText();
       //System.out.println("text is"+S);
       driver.close();
       
       /*ele.sendKeys("zomato");
       ele.submit();
       
       Thread.sleep(1000);
       
       
       WebElement z_link= driver.findElement(By.xpath("//a[@href='https://www.zomato.com/india']"));
       z_link.click();
       Thread.sleep(10000);
       //WebElement mum_res= driver.findElement(By.xpath("//"))
       
       
       
       
       //WebDriverWait wait = new WebDriverWait(driver,30);
       //wait.until(ExpectedConditions.presenceOfElementLocated(By.id("signin-link")));
       //WebElement signup = driver.findElement(By.xpath("(//*[@class='signin-link header-login-button ui button mr0'])"));
       
      
       //signup.click();
       
       System.out.println(driver.getTitle());*/
       
       

   }

}

