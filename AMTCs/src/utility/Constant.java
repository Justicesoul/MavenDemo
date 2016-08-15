package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Constant {
	public static final String URL 		= "http://www.store.demoqa.com";
	//	public static final String Path_TestData 	= "D://HOC_TAP//LAP_TRINH//Automation_Selenium//Selenium//";
	public static final String Path_TestData2	= "F://Selenium//SelProjects//";
	public static final String File_TestData 	= "TestData.xlsx";

	public static WebDriver driver 		= null;
	public static WebElement element 	= null;
	//	public final static String Valid_User 	= "admin", Valid_Pass = "devteam";
	//	public final static String Email 		= "thinh.luong+001@audiencemedia.com";
	//	public int rand = ((int)Math.random()*100);

	//// Setup & Clean ////
	public static void Setup(){
		driver = new FirefoxDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void Clean(){
		driver.close();
		System.out.println("o_0 DONE ^_^");
	}

	//// Methods ////
	public static void Login_Invalid () throws Exception {
		String css_Accountbtn = "header#header>div#account>a";
		String css_Warningmess = "#ajax_loginform>p";

		//This is to open the Excel file. Excel path, file name and the sheet name are parameters to this method
		ExcelUtils.setExcelFile(Constant.Path_TestData2 + Constant.File_TestData,"Sheet1");
		driver.findElement(By.cssSelector(css_Accountbtn)).click();
		String sUserName, sPassword, sMessage; int sAccount = 1;

		for (int i = 1; i <= 4; i++) {
			//Get account from file
			sUserName	= ExcelUtils.getCellData(i, sAccount);
			sPassword	= ExcelUtils.getCellData(i, sAccount+1);
			sMessage	= ExcelUtils.getCellData(i, sAccount+2);
			WebDriverWait wait = new WebDriverWait(driver, 20);

			// Input account
			WebElement element1 = driver.findElement(By.id("log"));	element1.sendKeys(sUserName);
			WebElement element2 = driver.findElement(By.id("pwd"));	element2.sendKeys(sPassword);
			driver.findElement(By.xpath("//*[@id='login']")).click();

			//Check message
			element = driver.findElement(By.cssSelector(css_Warningmess));
			wait.until(ExpectedConditions.visibilityOf(element));
			System.out.println("Expected: " + sMessage);
			System.out.println("Actual: " + element.getText());

			//This is to send the PASS/FAIL value to the Excel sheet in the result column.
			if (sMessage.equalsIgnoreCase(element.getText())) {
				ExcelUtils.setCellData("Passed", Path_TestData2+File_TestData, i, sAccount+3);	
			} else {
				ExcelUtils.setCellData("Failed", Path_TestData2+File_TestData, i, sAccount+3);
			}

			// Clear Username & Password
			element1.clear(); element2.clear();
		}
	}
}
