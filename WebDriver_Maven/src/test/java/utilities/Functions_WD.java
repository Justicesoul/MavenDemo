package utilities;

import java.util.ArrayList;
import java.util.List;

import initialization.ExcelUtils_auto;

public class Functions_WD {
	public static List <String> Get_list_items(String path, int start_item_row, int start_item_col, int end_item_row) throws Exception{
		List <String> items = new ArrayList<String>();
		ExcelUtils_auto.setExcelFile(path, 0);
		
		for (int i = start_item_row; i <= end_item_row; i++) {
			String Cell 	= ExcelUtils_auto.getCellData(i, start_item_col);
			items.add(Cell);
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
