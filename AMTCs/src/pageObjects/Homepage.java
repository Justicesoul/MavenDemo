package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
/*	//Object
	private static String css_Breacrumb	= "div#breadcrumb>ul>li";
	
	public static WebElement Breadcrumb(WebDriver driver){
		return driver.findElement(By.cssSelector(css_Breacrumb));
	}*/
	
	private static final By Breadcrumb	= By.cssSelector("");
	
	public static WebElement Breadcrumb(WebDriver driver){
		return driver.findElement(Breadcrumb);
	}
}
