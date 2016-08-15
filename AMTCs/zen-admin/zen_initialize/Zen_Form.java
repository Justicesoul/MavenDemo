package zen_initialize;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Zen_Form {
	public static WebDriver driver = null;
	public static WebElement element = null;
	protected static final String BaseURL = "http://admin.zentest.audiencemedia.com/";
	protected static final String BaseURL2 = "http://www.admin.zen.vn.audiencemedia.com:81/";
	protected static String ValidUser = "admin@audiencemedia.com";
	protected static String ValidPass = "devteam";
	
	//// SETUP & CLEAN ////
	public static void Setup(){
		  driver = new FirefoxDriver();
		  driver.get(BaseURL2);
		  driver.manage().window().maximize();
	}
	
	public static void Clean(){
//		  driver.close();
		  System.out.println("@_@ DONE ^_^");
	}
	////////////////////

	
	//// ELEMENTS ////
	//Login
	protected static String cssUsername 	= ".form-control[type='email']";
	protected static String cssPassword 	= ".form-control[type='password']";
	protected static String cssLoginbtn	= ".btn.btn-lg.btn-primary.btn-block";
	protected static String cssLogoutbtn	= ".accordion>ul>li>a";
	protected static String linkLogoutOKbtn	= "OK";
	protected static String AssertSignin	= ".form-signin>h2";
	//Menu
	protected static String cssCtlManagement	= "div[data-reactid='.0.1.0.0.0.0.0:$0']>ul.accordion-header";
	protected static String linkCategory		= "Category";
	protected static String linkPublication	= "Publication";
	//View Category
	protected static String link1stCategory	= "Adulte";
	protected static String linkGeneralInfo	= "General Information";
	//View Publication
	protected static String link1stPublication	= "Top Santé";
	protected static String linkIssuePricing		= "Issue Pricing";


}