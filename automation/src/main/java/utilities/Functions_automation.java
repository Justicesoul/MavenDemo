package utilities;

import java.util.ArrayList;
import java.util.List;

import initialize.ExcelUtils_auto;
import selenium_Basic.Upload_File;

public class Functions_automation {

	
	public static List <String> Get_list_items(String ExcelFile_path, int start_item_row, int start_item_col, int end_item_row) throws Exception{
		List <String> items = new ArrayList<String>();
		for (int i = start_item_row; i <= end_item_row; i++) {
			// No matter Home or Company
				ExcelUtils_auto.setExcelFile(ExcelFile_path, "Sheet1");

			String Path 		= ExcelUtils_auto.getCellData(Upload_File.local_link_row, Upload_File.local_link_col);
			String File_name 	= ExcelUtils_auto.getCellData(i, start_item_col);

			items.add(Path+File_name);
		}
		return items;
	}
	
	public static void Set_item(String result, String excelFile_path, int row, int col) throws Exception{
		ExcelUtils_auto.setCellData(result , excelFile_path, row, col);
	}

	public static void Set_item(int result, String excelFile_path, int row, int col) throws Exception {
		ExcelUtils_auto.setCellData(result , excelFile_path, row, col);
	}
}
