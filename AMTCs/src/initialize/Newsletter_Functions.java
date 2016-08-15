package initialize;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import pageObjects.Newsletterpage;

public class Newsletter_Functions extends AM_Form{
	public final static String TestNewsletterUrl = "http://playboy-fr.dev.audiencemedia.com/admin2/newsletter/compose/2";

	public static void Setup(){
		  driver = new FirefoxDriver();
		  driver.get(TestNewsletterUrl);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void GotoNewsletterMenu(){
		// Go to subMenu_Newsletter
		Actions action = new Actions(driver);
		action.moveToElement(Newsletterpage.oMenuContent(driver)).perform();
		action.moveToElement(Newsletterpage.osubMenuNewsletter(driver)).click().perform();
		// Assert
		Assert.assertTrue(Newsletterpage.oBreadcrumb(driver).isDisplayed());
	}

	public static void Create() {

	}
	
	public static void CreateTemplate() {
		
	}

	public static void AddStory() {
		// Movement Activities
		Actions actions = new Actions(driver);
		actions.clickAndHold(Newsletterpage.o1stStory(driver)).perform();;
		actions.moveToElement(Newsletterpage.oTargetPlace(driver)).release().perform();
	}

	public static void AddMultipleStories(){
		Actions actions = new Actions(driver);
		String draggable_Content	= "content-item ui-draggable";
		// Find original elements then move them
		for (int i = 1; i <= 10; i++) {
			element = driver.findElement(By.xpath("//section//form/div[3]/div[" + i + "]"));
			if (element.getAttribute("class").equalsIgnoreCase(draggable_Content)) {
				actions.clickAndHold(element)
				.moveToElement(Newsletterpage.oTargetPlace(driver))
				.release()
				.perform();	
			}
		}
	}

	public static void EditCustomContent() {
		String inputText	= "Congras FFThinh";
		
		Newsletterpage.oEditCustomContentbtn(driver).click();
		Newsletterpage.SwitchtoFrame0(driver);
		Newsletterpage.SwitchtoFrame1(driver);
		
		System.out.println("The previous text: "+ Newsletterpage.oTextarea(driver).getText());
		Newsletterpage.oTextarea(driver).clear();
		Newsletterpage.oTextarea(driver).sendKeys(inputText);
		System.out.println("The new text: "+ Newsletterpage.oTextarea(driver).getText());
		
		Newsletterpage.SwitchtoParentFrame(driver);
		Newsletterpage.oSavebtn(driver).click();
		// Must wait until the page refresh completely
		pWait(Newsletterpage.oEditCustomContentbtn(driver));
	}

}
