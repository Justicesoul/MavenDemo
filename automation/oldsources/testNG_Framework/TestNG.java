//GOOD
package testNG_Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNG {
	public WebDriver driver;
  @Test
  public void f() {
      driver.findElement(By.id("email")).sendKeys("yourusername");
      driver.findElement(By.id("pass")).sendKeys("yourpassword");
      driver.findElement(By.id("loginbutton")).click();
      System.out.println("-Login Successfully-");
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();
      //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("https://www.facebook.com/");
      System.out.println("TestNG-Before Method");
  }
  
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
	  System.out.println("TestNG-After Method");
  }
  
  @BeforeClass
  public void beforeClass() {
  System.out.println("TestNG-Before Class");
	}
	
  @AfterClass
  public void afterClass() {
  System.out.println("TestNG-After Class");
}
  
}
