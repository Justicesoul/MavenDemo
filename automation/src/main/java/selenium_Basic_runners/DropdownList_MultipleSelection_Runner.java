package selenium_Basic_runners;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import selenium_Basic.DropdownList;
import selenium_Basic.MultipleSelection;

public class DropdownList_MultipleSelection_Runner {
	////Setup & Clean////
	@BeforeClass
	public void beforeClass() {
		DropdownList.Setup(DropdownList.BaseURL);
	}

	@AfterClass
	public void afterClass() {
		DropdownList.Clean();
	}
	////////////////////

	@Test
	public void Demo() throws InterruptedException {
		DropdownList.Drop_Down_List();
		MultipleSelection.Multiple_Selection();
	}
}