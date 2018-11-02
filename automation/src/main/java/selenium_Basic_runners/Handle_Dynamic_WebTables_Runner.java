package selenium_Basic_runners;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import selenium_Basic.Handle_Dynamic_WebTables;

public class Handle_Dynamic_WebTables_Runner {
	////Setup & Clean////
	@BeforeClass
	public void beforeClass() {
		Handle_Dynamic_WebTables.Setup(Handle_Dynamic_WebTables.BaseURL);
	}

	@AfterClass
	public void afterClass() {
		Handle_Dynamic_WebTables.Clean();
	}
	////////////////////

	@Test
	public void Demo() throws InterruptedException {
		Handle_Dynamic_WebTables.Exercise1();
		Handle_Dynamic_WebTables.Exercise2();
	}
}
