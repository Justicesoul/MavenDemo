//Log not work
package testNG_Framework;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
/*import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;*/


public class Reporters_Asserts {
	  private static WebDriver driver;
//	  private static Logger Log = Logger.getLogger(Log.class.getName());
	    @Test (enabled=false)
	  public static void test_Reporters() {
//	      DOMConfigurator.configure("log4j.xml");
	        driver = new FirefoxDriver();
//	        Log.info("New driver instantiated");
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	        Log.info("Implicit wait applied on the driver for 10 seconds");
	        driver.get("https://www.facebook.com/");
//	        Log.info("Web application launched");
	        // Our first step is complete, so we produce a main event log here for our reports.
	        Reporter.log("Application Lauched successfully | ");
	   
	        driver.findElement(By.id("email")).sendKeys("yourusername");
//	        Log.info("Username entered in the Username and email text box");
	        driver.findElement(By.id("pass")).sendKeys("yourpassword");
//	        Log.info("Password entered in the Password text box");
	        driver.findElement(By.id("loginbutton")).click();
//	        Log.info("Click action performed on Submit button");
	        // Here we are done with our Second main event
	        Reporter.log("Sign In Successful | " );
	        driver.quit();
//	        Log.info("Browser closed");
	        // This is the third main event
	        Reporter.log("User is Logged out and Application is closed | ");
	  }
	    
	    @Test
	    public static void test_Asserts() {
	        driver = new FirefoxDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("https://www.facebook.com/");
	        
	        // Here driver will try to find out My username textbox on the application
	        WebElement text_username = driver.findElement(By.id("email"));
	        
	        //Test will only continue, if the below statement is true
	        //This is to check whether the textbox is displayed or not
	        Assert.assertTrue(text_username.isDisplayed());
		    //My username text will be type only if the above condition is true
		    text_username.sendKeys("your_username");
	        
	        driver.quit();        
	    }

}
