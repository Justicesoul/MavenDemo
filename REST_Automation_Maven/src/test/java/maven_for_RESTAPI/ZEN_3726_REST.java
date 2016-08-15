package maven_for_RESTAPI;

import java.util.List;

import org.testng.annotations.Test;

import initialize.Configs;
import ultilities.Functions_REST;

public class ZEN_3726_REST extends Functions_REST{

	
  @Test
  public void f() throws Exception {
	  List<String> items = perfect_List(ListAPIonFile(Configs.TestCaseFile_path3, Configs.start_item_row, Configs.start_item_col, Configs.end_item_row));
	  GET_Function_MultipleAPI(items);
  }

}
