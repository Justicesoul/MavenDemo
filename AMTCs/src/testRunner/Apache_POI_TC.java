package testRunner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utility.Constant;

public class Apache_POI_TC {
  @Test
  public void Test() throws Exception {
	  Constant.Login_Invalid();
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  Constant.Setup();
  }

  @AfterMethod
  public void afterMethod() {
//	  Constant.Clean();
  }

}
