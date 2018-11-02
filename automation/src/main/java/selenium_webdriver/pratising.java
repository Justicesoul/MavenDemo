package selenium_webdriver;
//Need to import Libraty of Selenium to open the long comment below

/*
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

@SuppressWarnings("deprecation")
public class pratising {
	@SuppressWarnings({ "unused" })
	public static void main(String[] args){
	WebDriver driver = new FirefoxDriver();
	String baseUrl = "http://www.google.com";
//	String baseUrl = "http://www.vietcombank.com.vn/";

	Selenium selenium = new WebDriverBackedSelenium(driver, baseUrl);
	selenium.open("/");
	selenium.type("name=q","cheese");
	selenium.click("name=btnG");

	// Get the underlying WebDriver implementation back. This will refer to the
	// same WebDriver instance as the "driver" variable above.
	
	WebDriver driverInstance = ((WebDriverBackedSelenium) selenium).getWrappedDriver();
//	Or this??? 
//	WebDriver driverInstance = ((WrapsDriver) selenium).getWrappedDriver();
	
	//Finally, close the browser. Call stop on the WebDriverBackedSelenium instance
	//instead of calling driver.quit(). Otherwise, the JVM will continue running after
	//the browser has been closed.
	selenium.stop();
	System.out.println("Done");
//	driver.get(baseUrl);
//	driver.quit();
	System.out.println("OK");
	}
}
*/
