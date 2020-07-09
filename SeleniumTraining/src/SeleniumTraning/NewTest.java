package SeleniumTraning;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
  @BeforeMethod
  public void BeforeMethod() {
	  
	  System.out.println("Inside BeforeMethod");
  }
  @AfterMethod
  public void AfterMethod() {
	  
	  System.out.println("Inside AfterMethod");
  }
  @BeforeClass
  public void BeforeClass() {
	  
	  System.out.println("Inside BeforeClass");
  }
  @AfterClass
public void AfterClass() {
	  
	  System.out.println("Inside AfterClass");
  }
  @BeforeTest
  public void BeforeTest() {
	  
	  System.out.println("Inside BeforeTest");
  }
  @AfterTest
  public void AfterTest()
  {
	  System.out.println("Inside AfterTest");
	  
  }
  
  @Test
  public void test()
  {
	  System.out.println("Test case executed");
	  
  }
  
}
