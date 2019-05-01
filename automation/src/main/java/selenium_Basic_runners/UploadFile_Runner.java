package selenium_Basic_runners;

import org.testng.annotations.Test;

import selenium_Basic.UploadFile;
import utilities.Functions_automation;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.AfterMethod;

public class UploadFile_Runner {
    @BeforeMethod
    public void beforeMethod() {
        UploadFile.Setup(UploadFile.BaseURL6);
    }

    @AfterMethod
    public void afterMethod() {
//		UploadFile.Clean();
    }

    @Test
    public void Demo() throws Exception {
        UploadFile.UploadImage6(Functions_automation.Get_list_items(UploadFile.ExcelFile_path, UploadFile.start_item_row, UploadFile.start_item_col, UploadFile.end_item_row));
    }
}
