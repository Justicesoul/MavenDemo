//GOOD
package testNG_Framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class P5_framework_annotations {
  @Test
  public void f1() {
	  System.out.println("This is Test case 1");
  }
  
  @Test
  public void f2() {
	  System.out.println("This is test case 2");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This will execute BEFORE every Method");
  }

  @AfterMethod
  public void afterMethod() {
      System.out.println("This will execute AFTER every Method");
  }

  @BeforeClass
  public void beforeClass() {
      System.out.println("This will execute BEFORE the Class");
  }

  @AfterClass
  public void afterClass() {
      System.out.println("This will execute AFTER the Class");
  }

  @BeforeTest
  public void beforeTest() {
      System.out.println("This will execute BEFORE the Test");
  }

  @AfterTest
  public void afterTest() {
      System.out.println("This will execute AFTER the Test");
  }

  @BeforeSuite
  public void beforeSuite() {
      System.out.println("This will execute BEFORE the Test Suite");
  }

  @AfterSuite
  public void afterSuite() {
      System.out.println("This will execute AFTER the Test Suite");
  }

}
