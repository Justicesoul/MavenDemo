package login;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Dashboard_Settings {
	WebDriver driver;
	String BaseUrl = "http://qa_thinh_publication_name_2b-bd.audiencemedia.com";
	String Valid_User = "admin"; String Valid_Pass = "devteam";
	String Email = "thinh.luong+001@audiencemedia.com";
	WebElement Ob1;


  @Test (groups = "checka")
  public void Login_Valid () {
	  Ob1 = driver.findElement(By.id("id1"));	  Ob1.sendKeys(Valid_User);
	  Ob1 = driver.findElement(By.id("id2"));	  Ob1.sendKeys(Valid_Pass);
	  Ob1.submit();
	  Ob1 = driver.findElement(By.cssSelector("div[class='panel-1-header']>h1"));
	  Assert.assertTrue(Ob1.isDisplayed());
	}
  
  @Test (enabled=true, dependsOnMethods={"Login_Valid"}, dependsOnGroups={"checka"})
  public void Check_Settings_checkboxes(){
/*	  Assert.assertTrue(driver.findElement(By.cssSelector("label[for='ckb_my_content']")).isDisplayed());
	  Ob1 = driver.findElement(By.id("ckb_my_content"));
	  if (Ob1.isSelected()) {
		System.out.println("Checkbox is now ENABLED");
		Assert.assertTrue(driver.findElement(By.cssSelector("section[id='my_content']>div>h1")).isDisplayed());
		Ob1.click();
	} else {
		System.out.println("Checkbox is now DISABLED");
		Ob1.click();
		Assert.assertTrue(driver.findElement(By.cssSelector("section[id='my_content']>div>h1")).isDisplayed());
	}*/
	  
//	  List<WebElement> Ob2 = driver.findElements(By.cssSelector("input[class='content'][type='checkbox']"));
	  List<WebElement> Ob2 = driver.findElements(By.cssSelector("input[type='checkbox']"));
	  System.out.println("Number of checkboxes: " + Ob2.size());
	  for (WebElement subOb2 : Ob2) {
		String id = subOb2.getAttribute("id");
		if (subOb2.isSelected()) {
			System.out.println("Checkbox id: " + id + "is now ENABLED");
		} else {
			System.out.println("Checkbox id: " + id + "is now DISABLED");
		}
		subOb2.click();
	}
  }
  
  @Test (enabled=true, dependsOnMethods={"Login_Valid"}, dependsOnGroups={"checka"})
  public void Check_Settings_radios(){
	  List<WebElement> Ob1 = driver.findElements(By.cssSelector("input[type='radio'][name='setcolumn']"));
	  System.out.println("Number of radios: " + Ob1.size());
	  
	  for (WebElement subOb2 : Ob1) {
		subOb2.click();

		// Wait to the columns appear
		WebDriverWait element = new WebDriverWait(driver, 5);
		element.until(ExpectedConditions
		.presenceOfElementLocated(By.cssSelector("div[class='column dragable ui-sortable']")));

		//Count the number of columns
		List<WebElement> Ob3 = driver.findElements(By.cssSelector("[class='column dragable ui-sortable']"));
		System.out.println("Hien ra " + Ob3.size() + " cot");
//==> BUG		Assert.assertEquals(Ob3.size(), Ob2.size());
	}  
  }
  
  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
	  driver.get(BaseUrl + "/admin");
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("\n---------------DONE---------------\n");
	  driver.close();
  }
}
