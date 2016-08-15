package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Newsletterpage {
	private static final By DragTargetPlace		= By.cssSelector("div.newsletter-content-target>div:nth-child(3)>div:nth-child(3)");
//	or	private static By DragTargetPlace	= By.cssSelector("div.newsletter-content-target>div:nth-child(3)>div.new-droppable-div");
//	or	private static By DragTargetPlace	= By.xpath("//*[@class='newsletter-content-target']/div[2]/div[3]");

	// Direction
	private static final By MenuContent			= By.linkText("Content".toUpperCase());
	private static final By subMenuNewsletter	= By.linkText("Newsletters".toUpperCase());
	private static final By Breadcrumb			= By.linkText("Newsletter");
	// Story Content
	private static final By _1stStory			= By.xpath("//section//form/div[3]/div[1]");
	// Custom Content
	private static final By EditCustomContentbtn	= By.cssSelector("button[class='fbutton b3 gt mb w45 gb free-form-button']");
	private static final By Textarea			= By.cssSelector("body#tinymce");
	private static final By Savebtn				= By.cssSelector("input[name='SaveTextDataButton']");
	// Frames
	public static final String Frame0	= "fancybox-frame";
	public static final String Frame1	= "freetext_data_ifr";

	public static WebElement oTargetPlace(WebDriver driver){
		return driver.findElement(DragTargetPlace);
	}

	public static WebElement oMenuContent(WebDriver driver){
		return driver.findElement(MenuContent);
	}

	public static WebElement osubMenuNewsletter(WebDriver driver){
		return driver.findElement(subMenuNewsletter);
	}

	public static WebElement oBreadcrumb(WebDriver driver){
		return driver.findElement(Breadcrumb);
	}

	public static WebElement o1stStory(WebDriver driver){
		return driver.findElement(_1stStory);
	}

	public static WebElement oEditCustomContentbtn(WebDriver driver){
		return driver.findElement(EditCustomContentbtn);
	}

	public static WebElement oTextarea(WebDriver driver){
		return driver.findElement(Textarea);
	}

	public static WebElement oSavebtn(WebDriver driver){
		return driver.findElement(Savebtn);
	}

	public static void SwitchtoFrame0(WebDriver driver){
		driver.switchTo().frame(Newsletterpage.Frame0);
	}

	public static void SwitchtoFrame1(WebDriver driver){
		driver.switchTo().frame(Newsletterpage.Frame1);
	}

	public static void SwitchtoParentFrame(WebDriver driver){
		driver.switchTo().parentFrame();
	}
}
