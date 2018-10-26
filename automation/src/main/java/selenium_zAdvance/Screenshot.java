package selenium_zAdvance;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import initialize.Sel_Form;

public class Screenshot extends Sel_Form{
//	String BaseURL 	= "http://www.google.com";
		String BaseURL	= "http://qa_thinh_publicationname1b-.audiencemedia.com/admin";

	@Test (enabled=false)
	public void f1() throws IOException {
		String inputnumber	= "2+2";
		int expectedresult 	= 7;

		element = driver.findElement(By.id("lst-ib"));
		element.sendKeys(inputnumber);
		element.submit();
		element = driver.findElement(By.id("cwos"));

		/// Assert doesn't work in try-catch
		/*	try {
				Assert.assertEquals(Integer.parseInt(element.getText()), expectedresult);
			} catch (Exception e) {
				e.printStackTrace();
				Assert.fail();
				highlightElement(driver, element);
			}*/

		if (Integer.parseInt(element.getText()) != expectedresult){
			highlightElement(driver, element);
			Assert.fail();
		}
	}

	@Test (enabled=true)
	public void f2() throws IOException {
		Login_Valid();
	}


	@BeforeMethod
	public void beforeMethod() {
		Setup(BaseURL);
	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException{
		if (!result.isSuccess()) {
			TakeScreenshot("FFThinh");
		} else{
			TakeScreenshot("Passed");
		}

		Clean();
	}
}