package initialize;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AM_Form {
	public static WebDriver driver 		= null;
	public static WebElement element 	= null;
	private static final int WaitinSec		= 20;
	public int rand = ((int)Math.random()*100);

	public static String BaseUrl 	= "http://qa_thinh_publication_name_2b-bd.audiencemedia.com/admin";
	public final static String TestNewsletterUrl = "http://playboy-fr.dev.audiencemedia.com/admin2/newsletter/compose/2";

	//// Setup & Clean ////
	public static void Setup(){
		  driver = new FirefoxDriver();
		  driver.get(BaseUrl);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void Clean(){
		  driver.close();
		  System.out.println("@_@ DONE ^_^");
	}
	
	public static void pWait(WebElement elementWait){
		WebDriverWait wait = new WebDriverWait(driver, WaitinSec);
		wait.until(ExpectedConditions.visibilityOf(elementWait));
	}
	
	//// Methods ////
	public static void Login_Valid () {
		String Valid_User 	= "admin", Valid_Pass = "devteam";

		element = driver.findElement(By.id("id1"));	element.sendKeys(Valid_User);
		element = driver.findElement(By.id("id2"));	element.sendKeys(Valid_Pass);
		element.submit();
// Can only use the script below if open the BaseUrl
//		element = driver.findElement(By.cssSelector("div[class='panel-1-header']>h1"));
//		Assert.assertTrue(element.isDisplayed());
	}
}
