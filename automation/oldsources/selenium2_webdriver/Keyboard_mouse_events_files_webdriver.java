package selenium2_webdriver;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

public class Keyboard_mouse_events_files_webdriver {
	public static void main(String[] args){
		WebDriver driver = new FirefoxDriver();
		
		/*String baseUrl = "http://newtours.demoaut.com/";
		driver.get(baseUrl);
		
		WebElement Ele1 = driver.findElement(By.linkText("Home"));
		WebElement Ele2 = driver.findElement(By.xpath("//html/body/div"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr"));
		
		Actions pointer = new Actions(driver);
		Action hover = pointer.moveToElement(Ele1).build();
		
		String colour = Ele2.getCssValue("background-color");
		System.out.println("Before hover: " + colour);
		hover.perform();
		colour = Ele2.getCssValue("background-color");
		System.out.println("After hover: " + colour);
		
		System.out.println("Done 1");
		
		WebElement username = driver.findElement(By.cssSelector("input[name=\"userName\"]"));
		Action inputtext = pointer.moveToElement(username)
				.click()
				.keyDown(Keys.SHIFT)
				.sendKeys("thinhne")
				.keyUp(Keys.SHIFT)
				.doubleClick(username)
				.contextClick(username)
				.build();
		inputtext.perform();
		System.out.println("Done 2");*/
		
		String baseUrl = "http://megafileupload.com/";
		driver.get(baseUrl);
		
		WebElement filebox = driver.findElement(By.id("uploadfile_0"));
		filebox.sendKeys("F:\\IMAGE SOURCE\\Data for upload\\Art Situation_Images\\Picture-6.png");
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.name("send")).click();
		
		//driver.quit();
	}
}
