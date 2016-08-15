package Maven.TestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import initialization.ExcelUtils_auto;
import utilities.Functions_WD;

public class ZEN_3726_WD {
	public WebDriver driver;
	public WebElement Ob1;
//	String BaseUrl 			= "http://zinio-unlimited.staging.audiencemedia.com/magazine";
	String BaseUrl 			= "http://google.com.vn";
	String Xpath_Searchbtn	=	"//html/body/section[2]/div/div/div[1]/div/form/div/input[1]";
	String Xpath_Searchrs	=	"//html/body/section[2]/div/div/div[3]/div[2]/div[1]";

	//////////////////////////////////
	protected static String ExcelFile_path	= "F:\\ZENITH\\Tickets\\ZEN-3726 (auto).xlsx";
	protected static int start_item_row	= 1;
	protected static int start_item_col	= 1;
	protected static int status_col		= 2;
	protected static int end_item_row	= 196;

	@Test
	// Using the Get_list_items from file before
	public void f1() throws Exception{
		List <String> items = Functions_WD.Get_list_items(ExcelFile_path, start_item_row, start_item_col, end_item_row);

		for (String item : items) {
			Ob1 = driver.findElement(By.xpath(Xpath_Searchbtn));
			Ob1.clear();
			Ob1.sendKeys(item);
			Ob1.submit();

			try {
				driver.findElement(By.xpath(Xpath_Searchrs)).isDisplayed();
				Functions_WD.Set_item(ITestResult.SUCCESS, ExcelFile_path, start_item_row, status_col);
				System.out.println("Checking: " + item + "\t -- Passed\n");

			} catch (Exception e) {
				Functions_WD.Set_item(ITestResult.FAILURE, ExcelFile_path, start_item_row, status_col);
				System.out.println("Checking: " + item + "\t -- Failed\n");
			}
		}
	}

	@Test (enabled=false)
	// Using data from file directly
	public void f2() throws Exception {
		ExcelUtils_auto.setExcelFile(ExcelFile_path, 0);

		for (int i = start_item_row; i < end_item_row; i++) {
			String Cell 	= ExcelUtils_auto.getCellData(i, start_item_col);

			/////// WebDriver ///////
			Ob1 = driver.findElement(By.xpath(Xpath_Searchbtn));
			Ob1.clear();
			Ob1.sendKeys(Cell);
			Ob1.submit();

			//			System.out.println(Cell + "\n");

			try {
				driver.findElement(By.xpath(Xpath_Searchrs)).isDisplayed();
				ExcelUtils_auto.setCellData("Passed", ExcelFile_path, i, status_col);
				System.out.println("Checking: " + Cell + "\t -- Passed\n");
			} catch (Exception e) {

				ExcelUtils_auto.setCellData("Failed", ExcelFile_path, i, status_col);
				System.out.println("Checking: " + Cell + "\t -- Failed\n");
			}
		}
	}

	//// Self-running
	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();
		driver.get(BaseUrl);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	//		//// Remote-running
	//		@BeforeMethod
	//	public void beforeMethod() throws Exception {
	//		DesiredCapabilities browser = DesiredCapabilities.firefox(); 
	//		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), browser);
	//		
	//		driver.get(BaseUrl);
	//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//		driver.manage().window().maximize();
	//	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("\n---------------NGON LANH CANH DAO---------------\n");
		//	  driver.close();
		driver.quit();
	}

	public void pWait(WebElement elementWait){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(elementWait));
	}
}