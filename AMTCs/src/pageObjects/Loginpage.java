package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	private static final By User	= By.id("id1");
	private static final By Pass	= By.id("id2");
	private static final By Submitbtn	= By.name("LoginButton");
	private static final By Message	= By.cssSelector("div.message.error");
	
	public static WebElement oUser(WebDriver driver){
		return driver.findElement(User);
	}
	public static WebElement oPass(WebDriver driver){
		return driver.findElement(Pass);
	}
	public static WebElement oSubmit(WebDriver driver){
		return driver.findElement(Submitbtn);
	}
	public static WebElement oMessage(WebDriver driver){
		return driver.findElement(Message);
	}
	
}
