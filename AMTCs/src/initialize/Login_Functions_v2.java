// THIS VERSION WILL READ THE ACCOUNTS FROM FILE TO INPUT
package initialize;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import utility.ExcelUtils;


public class Login_Functions_v2 extends AM_Form{
	// Variables store data
	private static String sUsername;
	private static String sPassword;
	private static String sMessage;

	public static final String File_path	= "F:\\Selenium\\SelProjects\\zData\\";
//  or can use this
//	public static final String File_path	= "F://Selenium//SelProjects//zData//";
	
	// Invalid case
	private static final String File_name_Invalid	= "Invalid_Accounts.xlsx";
	private static final int start_Row		= 1;
	private static final int start_Col		= 0;
	private static final int No_of_Account	= 4;
	// Valid case
	private static final String File_name_Valid		= "Valid_Accounts.xlsx";
	private static final int start_Row_Valid	= 1;
	private static final int start_Col_Valid	= 0;

	private static void InputAccount(){
		WebElement User = Loginpage.oUser(driver); 
		User.clear(); User.sendKeys(sUsername);
		WebElement Pass = Loginpage.oPass(driver); 
		Pass.clear(); Pass.sendKeys(sPassword);
		Loginpage.oSubmit(driver).click();
	}
	
	public static void Login_Invalid () throws Exception{
		ExcelUtils.setExcelFile(File_path + File_name_Invalid, "Sheet1");

		for (int row = start_Row; row <= No_of_Account; row++) {
			// Get accounts
			sUsername 	= ExcelUtils.getCellData(row, start_Col);
			sPassword 	= ExcelUtils.getCellData(row, start_Col+1);
			sMessage 	= ExcelUtils.getCellData(row, start_Col+2);

			// Input account
			InputAccount();

			// Check message
			element = Loginpage.oMessage(driver);
			pWait(element);
			System.out.println("Expected: " + sMessage + "\nActual: " + element.getText());
			// Set status Passed/Failed
			if (element.getText().equalsIgnoreCase(sMessage)) {
				ExcelUtils.setCellData("Passed", File_path + File_name_Invalid, row, start_Col+3);
			} else {
				ExcelUtils.setCellData("Failed", File_path + File_name_Invalid, row, start_Col+3);
			}
		}
	}
	
	public static void Login_Valid(){
		try {
			ExcelUtils.setExcelFile(File_path + File_name_Valid, "Sheet1");

			// Get account
			sUsername	= ExcelUtils.getCellData(start_Row_Valid, start_Col_Valid);
			sPassword	= ExcelUtils.getCellData(start_Row_Valid, start_Col_Valid+1);

			// Input account
			InputAccount();
			
			// Assert
			Assert.assertTrue(Homepage.Breadcrumb(driver).isDisplayed());
			// Set status Passed
			ExcelUtils.setCellData("Passed", File_path+File_name_Valid, start_Row_Valid, start_Col_Valid+3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
