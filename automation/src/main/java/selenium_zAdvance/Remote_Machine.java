package selenium_zAdvance;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import initialize.Sel_Form;

public class Remote_Machine extends Sel_Form{
	@Test
	public void f() throws Exception {
		DesiredCapabilities browsers[] = {
				DesiredCapabilities.firefox(),
				DesiredCapabilities.internetExplorer(),
				DesiredCapabilities.chrome()	
		};

		for (DesiredCapabilities capabilities :browsers){
			//		@SuppressWarnings("static-access")
			//		DesiredCapabilities capabilities = new DesiredCapabilities().firefox();
			String browserName	= capabilities.getBrowserName();
			System.out.println("Executing  Test in  "+browserName);

			if (browserName == "internet explorer")
				capabilities.setCapability("ignoreZoomSetting", true);
			
			//// Open browser on remote machine
			// 1 - With standalone server
//			 driver = new RemoteWebDriver(new URL("http://192.168.4.75:4444/wd/hub"), capabilities);
			// 2 - With hub-node
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities); 
			// or 2b - driver = new RemoteWebDriver(new URL("http://192.168.4.252:4444/wd/hub"), capabilities); 

			//// Run test
			driver.get("http://google.com");
			element = driver.findElement(By.name("q"));
			element.sendKeys("test!");
			element.submit();
			Thread.sleep(1000);
			Assert.assertTrue(driver.getTitle().contains("test!"));
		}
	}


	@BeforeMethod
	public void beforeMethod() throws Exception {

	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException {
		if (!result.isSuccess()) {
			TakeScreenshot("Remote Machine");
		}

		Clean();
	}
}
