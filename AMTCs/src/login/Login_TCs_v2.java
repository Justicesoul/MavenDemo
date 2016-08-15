package login;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import initialize.Login_Functions_v2;


public class Login_TCs_v2 {
  @Test
  public void f() throws Exception {
	  Login_Functions_v2.Login_Invalid();
	  Login_Functions_v2.Login_Valid();
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  Login_Functions_v2.Setup();
  }

  @AfterMethod
  public void afterMethod() {
//	  Loginsource_v2.Clean();
  }
  
}
