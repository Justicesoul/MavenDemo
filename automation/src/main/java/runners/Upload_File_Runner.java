package runners;

import org.testng.annotations.Test;

import selenium_Basic.Upload_File;
import utilities.Functions_automation;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.AfterMethod;

public class Upload_File_Runner {
	@BeforeMethod
	public void beforeMethod() {
		Upload_File.Setup(Upload_File.BaseURL6);
	}
	@AfterMethod
	public void afterMethod() {
//		Upload_File.Clean();
	}


	@Test
	public void Demo() throws Exception {
		Upload_File.UploadImage6(Functions_automation.Get_list_items(Upload_File.ExcelFile_path, Upload_File.start_item_row, Upload_File.start_item_col, Upload_File.end_item_row));
	}
}
