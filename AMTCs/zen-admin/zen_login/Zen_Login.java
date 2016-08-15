package zen_login;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import zen_initialize.Zen_Action;

public class Zen_Login {
	@BeforeClass
	public void beforeClass() {
		Zen_Action.Setup();
		Zen_Action.Login();
	}
	@AfterClass
	public void afterClass() {
		Zen_Action.Logout();
		Zen_Action.Clean();
	}

	
	
	@Test
	public void Test() {
		Zen_Action.SelectCategory();
	}
	@Test
	public void Test2() {
		Zen_Action.SelectPublication();
	}
}
