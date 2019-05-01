package initialize;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.Source;

public class Sel_Form {
	public static WebDriver driver = null;
	public static WebElement element = null;
	private static String Path_Screenshot	= "./screenshot/";
	
	////Setup & Clean////
	public static void Setup(String BaseURL){
		// for Window
		/*System.setProperty("webdriver.gecko.driver", Source.DriverPath() + "/geckodriver.exe");*/
		// for MacOS
		System.setProperty("webdriver.gecko.driver", Source.DriverPath() + "/MacOS/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(BaseURL);
		driver.manage().window().maximize();
	}

	public static void Clean() {
//		driver.close();
		driver.quit();
		System.out.println("@_@ DONE ^_^");
		System.exit(0);
	}

	////////////////////
	//Wait//
	public static void Wait(String xpath){
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement Ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}

	////////////////////
	//Verify Element//
	public static void verifyEquals(Object actual, Object expected) {
		try {
			Assert.assertEquals(expected, actual);
			System.out.println("The comparison is Passed!");
		} catch (Throwable e) {
			System.out.println("The comparison is Failed!");
		}
	}

	////////////////////
	//Check Existence//
	public static void checkexistence(WebDriver driver){

	}

	////////////////////
	//ScreenShot//
	public static void TakeScreenshot(String FileName) throws IOException{
		System.out.println("Screenshot is taken!");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(FilePath(FileName)));
	}

	private static String FileName (String fName) {
		DateFormat Dformat = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");
		Date date = new Date();
		return Dformat.format(date).toString()+"_"+ fName +".jpg"; 
	}

	private static String FilePath (String fName) throws IOException {
		return Path_Screenshot+FileName(fName);
		/* OR		File file = new File(".");
		return file.getCanonicalPath()+"/screenshot/"+FileName(fName);*/
	}

	////////////////////
	//Highlight element
	public static void highlightElement(WebDriver driver, WebElement element) {
//		 for (int i = 0; i < 2; i++)
//		 {
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: red; border: 2px solid red;");
////		 js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
//		 }
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: yellow; border: 2px solid red;");
	}


	////////////////////
	//Login//
	public static void Login_Valid () {
		String Valid_User 	= "admina", Valid_Pass = "devteam";

		element = driver.findElement(By.id("id1"));	element.sendKeys(Valid_User);
		element = driver.findElement(By.id("id2"));	element.sendKeys(Valid_Pass);
		element.submit();

		Assert.assertTrue(driver.findElement(By.linkText("Dashboard".toUpperCase())).isDisplayed(), "Can not find DASHBOARD menu");
	}

}