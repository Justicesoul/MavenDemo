package selenium_Basic;

import initialize.Sel_Form;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultipleSelection extends Sel_Form{
	public static String BaseURL = "http://www.toolsqa.com/automation-practice-form/";
	
	public static void Multiple_Selection() throws InterruptedException {
		// Step 3: Select 'Selenium Commands' Multiple select box ( Use Name locator to identify the element )
		Select oSelect = new Select(driver.findElement(By.name("selenium_commands")));
 
		// Step 4: Select option 'Browser Commands' and then deselect it (Use selectByIndex and deselectByIndex)
		oSelect.selectByIndex(0); 
		Thread.sleep(2000);
		oSelect.deselectByIndex(0);
 
		// Step 5: Select option 'Navigation Commands'  and then deselect it (Use selectByVisibleText and deselectByVisibleText)
		oSelect.selectByVisibleText("Navigation Commands");
		Thread.sleep(2000);
		oSelect.deselectByVisibleText("Navigation Commands");
 
		// Step 6: Print and select all the options for the selected Multiple selection list.
		List<WebElement> oSize = oSelect.getOptions();
		// Setting up the loop to print all the options
		for (WebElement sub_oSize : oSize) {
			String sValue = sub_oSize.getText();
			System.out.println(sValue);
			oSelect.selectByVisibleText(sValue);
		}
		
		// Step 7: Deselect all
		oSelect.deselectAll();
	}
}