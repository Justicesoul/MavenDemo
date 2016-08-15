//GOOD

package selenium_webdriver;

import com.thoughtworks.selenium.*;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class abc3 {
	@SuppressWarnings("deprecation")
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
//			selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://www.chotot.vn/");
//			selenium.start();
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://www.chotot.vn";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testAbc3() throws Exception {
		selenium.open("/");
		selenium.click("id=region_13");
		selenium.waitForPageToLoad("30000");
//		�?ồ điện tử
		selenium.click("//*[@id='main_content']/div[2]/div[1]/div[2]/span/a");
		selenium.waitForPageToLoad("30000");
//		Máy tính & Phụ kiện
		selenium.click("//*[@id='main_content']/div[2]/div/div[3]/span/a");
		selenium.waitForPageToLoad("30000");
//		Công ty / Cá nhân
//		selenium.click("//*[@id='tabnav']/li[3]/a");
		selenium.click("//*[@id='tabnav']/li[2]/a");
		selenium.waitForPageToLoad("30000");
//		List 100
		selenium.click("//*[@id='tabnav']/li/div[1]/a[2]");
		selenium.waitForPageToLoad("30000");
		selenium.click("//*[@id='hl']/div[1]/div[4]/a");
		selenium.waitForPageToLoad("30000");
	}

	@After
	public void tearDown() throws Exception {
//		selenium.stop();
		System.out.println("abc Done2");
	}
}
