package content_issue;

import login.Login_TCs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Edit {
	Login_TCs abc = new Login_TCs();
	WebDriver driver;
	WebElement Ob1;
	
  @Test
  public void Edit_Issue() {
	  abc.Login_Valid();
	  
	  Ob1 = driver.findElement(By.linkText("CONTENT"));
	  Actions action = new Actions(driver);
	  action.moveToElement(Ob1).build().perform();
	  driver.findElement(By.linkText("Issues")).click();
  }
  
  @BeforeClass
  public void beforeClass() {
	  abc.beforeMethod();
	  driver = abc.driver;
  }

  @AfterClass
  public void afterClass() {
	  abc.afterMethod();
  };
}