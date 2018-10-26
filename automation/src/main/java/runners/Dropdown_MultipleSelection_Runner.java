package runners;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import selenium_Basic.Dropdown_MultipleSelection;

public class Dropdown_MultipleSelection_Runner {
	////Setup & Clean////
	@BeforeClass
	public void beforeClass() {
		Dropdown_MultipleSelection.Setup(Dropdown_MultipleSelection.BaseURL);
	}

	@AfterClass
	public void afterClass() {
		Dropdown_MultipleSelection.Clean();
	}
	////////////////////

	@Test
	public void Demo() throws InterruptedException {
		Dropdown_MultipleSelection.Drop_Down_List();
		Dropdown_MultipleSelection.Multiple_Selection();
	}
}
