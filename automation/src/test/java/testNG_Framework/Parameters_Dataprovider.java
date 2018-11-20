//GOOD. Run with xml file
package testNG_Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class Parameters_Dataprovider {
	WebDriver driver;
	WebElement email,pass,loginbtn;

	@BeforeMethod
	public void bfmethod(){
		driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.facebook.com");
	    email = driver.findElement(By.id("email"));
	    pass = driver.findElement(By.id("pass"));
	    loginbtn = driver.findElement(By.id("loginbutton"));
	}
	
	@AfterMethod
	public void afmethod(){
	    driver.quit();
	}
	
  @Test(dataProvider = "credential")
  public void test(String sUsername, String sPassword) {
	  email.sendKeys(sUsername);
      pass.sendKeys(sPassword);
      loginbtn.click();

  }

  @DataProvider
  public Object[][] credential() {
    return new Object[][] {
      { "user1", "a" },
      { "user2", "b" },
    };
  }
//  
//  @Test
//  @Parameters({ "yUsername", "yPassword" })
//  public void test2 (String yUsername, String yPassword) {
//      email.sendKeys(yUsername);
//      pass.sendKeys(yPassword);
//      loginbtn.click();
//  }
}
