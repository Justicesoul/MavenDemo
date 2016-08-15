package selenium2_webdriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Practise_Close {
	public static void main(String[] args){
	
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://selenium.googlecode.com/svn/trunk/docs/api/java/index.html";
		driver.get(baseUrl);
		
		driver.switchTo().frame("classFrame");
		WebElement myEle = driver.findElement(By.linkText("Deprecated"));
		myEle.click();
		
		driver.quit();
		System.out.println("Done!");
}
}
