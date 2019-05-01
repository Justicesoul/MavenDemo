package selenium_Basic_runners;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import selenium_Basic.HandleDynamicWebTables;

public class HandleDynamicWebTables_Runner {
	////Setup & Clean////
	@BeforeClass
	public void beforeClass() {
		HandleDynamicWebTables.Setup(HandleDynamicWebTables.BaseURL);
	}

	@AfterClass
	public void afterClass() {
		HandleDynamicWebTables.Clean();
	}
	////////////////////

	@Test
	public void Demo() throws InterruptedException {
		HandleDynamicWebTables.Exercise1();
		HandleDynamicWebTables.Exercise2();
	}
}
