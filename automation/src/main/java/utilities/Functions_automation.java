package utilities;

import java.util.ArrayList;
import java.util.List;

import selenium_Basic.UploadFile;

public class Functions_automation {
		//Interaction to Excel, refer to ExcelUtils_auto.class

	public static List <String> Get_list_items(String ExcelFile_path, int start_item_row, int start_item_col, int end_item_row) throws Exception{
		List <String> items = new ArrayList<String>();
		for (int i = start_item_row; i <= end_item_row; i++) {
			// No matter Home or Company
				ExcelUtils_auto.setExcelFile(ExcelFile_path, "Sheet1");

			String Path 		= ExcelUtils_auto.getCellData(UploadFile.local_link_row, UploadFile.local_link_col);
			String File_name 	= ExcelUtils_auto.getCellData(i, start_item_col);

			items.add(Path+File_name);
		}
		return items;
	}
	
	public static void Set_String_item(String result, String excelFile_path, int row, int col) throws Exception{
		ExcelUtils_auto.setCellData(result , excelFile_path, row, col);
	}

	public static void Set_Int_item(int result, String excelFile_path, int row, int col) throws Exception {
		ExcelUtils_auto.setCellData(result , excelFile_path, row, col);
	}
}
