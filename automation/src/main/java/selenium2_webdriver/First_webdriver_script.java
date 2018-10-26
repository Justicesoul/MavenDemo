package selenium2_webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class First_webdriver_script {
	public static void main(String[] args){
		
		WebDriver driver = new FirefoxDriver();
		//Try-catch
		/*String baseUrl = "http://newtours.demoaut.com/";
		String userName = "tutorial";
		driver.get(baseUrl);
		
		WebElement myEle1 = driver.findElement(By.linkText("REGISTER"));
		try {
			if (myEle1.isDisplayed()) {
				System.out.println("Try detected!");
			}
		} catch (NoSuchElementException nsee) {
			// TODO: handle exception
			System.out.println(nsee.toString());
			System.out.println("Catch detected!");
		}
		////////////////////////
		
		WebElement myEle2 = driver.findElement(By.cssSelector("input[name=\"userName\"]"));
		try {
			if (myEle2.isEnabled()) {
				myEle2.sendKeys(userName);
			}
		} catch (NoSuchElementException nsee) {
			// TODO: handle exception
			System.out.println(nsee.toString());
		}*/
		
		//MULTIPLE CHOICES
		/*String baseUrl = "http://jsbin.com/osebed/2";
		driver.get(baseUrl);
		
		Select Fruits = new Select(driver.findElement(By.id("fruits")));
		if (Fruits.isMultiple()) {
			Fruits.selectByVisibleText("Orange");
			Fruits.selectByValue("apple");
			Fruits.selectByIndex(3);
		}*/
		
		
		String baseUrl = "http://newtours.demoaut.com/";
		driver.get(baseUrl);

		String underConsTitle = "Under Construction: Mercury Tours";
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 
        driver.get(baseUrl);
        List<WebElement> linkElements = driver.findElements(By.tagName("a"));
        String[] linkTexts = new String[linkElements.size()];
        int i = 0;

        //extract the link texts of each link element
        for (WebElement e : linkElements) {
            linkTexts[i] = e.getText();
            i++;
        }
 
        //test each link
        for (String t : linkTexts) {
            driver.findElement(By.linkText(t)).click();
            if (driver.getTitle().equals(underConsTitle)) {
                System.out.println("\"" + t + "\"" + " is under construction.");
            } else {
                System.out.println("\"" + t + "\"" + " is working.");
            }
            driver.navigate().back();
		
        }
        
		System.out.println("Done!");
		//driver.quit();
	}
}
