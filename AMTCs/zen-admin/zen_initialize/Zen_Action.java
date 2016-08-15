package zen_initialize;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Zen_Action extends Zen_Form{

	public static void Login(){
		driver.findElement(By.cssSelector(cssUsername)).sendKeys(ValidUser);
		driver.findElement(By.cssSelector(cssPassword)).sendKeys(ValidPass);
		driver.findElement(By.cssSelector(cssLoginbtn)).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Assert
		element = driver.findElement(By.cssSelector(cssLogoutbtn));
		Assert.assertEquals(element.getText(), "LOG OUT");
	}
	public static void Logout() {
		driver.findElement(By.cssSelector(cssLogoutbtn)).click();
		driver.findElement(By.linkText(linkLogoutOKbtn)).click();
//		element = driver.findElement(By.cssSelector(".container>p"));
//		Assert.assertEquals(element.getText(), "You are now logged out");
		
		element = driver.findElement(By.cssSelector(AssertSignin));
		Assert.assertEquals(element.getText(), "Please sign in");
	}

	public static void SelectCategory() {
		CategoryList();
		driver.findElement(By.linkText(link1stCategory)).click();
		//Assert
		element = driver.findElement(By.linkText(linkGeneralInfo));
		Assert.assertEquals(element.getText(), "General Information");
	}
	
	public static void SelectPublication(){
		PublicationList();
		driver.findElement(By.linkText(link1stPublication)).click();
		//Assert
		element = driver.findElement(By.linkText(linkIssuePricing));
		Assert.assertTrue(element.isDisplayed());
	}


	public static void CategoryList() {
		driver.findElement(By.cssSelector(cssCtlManagement)).click();
		driver.findElement(By.linkText(linkCategory)).click();
	}
	public static void PublicationList() {
		driver.findElement(By.cssSelector(cssCtlManagement)).click();
		driver.findElement(By.linkText(linkPublication)).click();
	}



}
