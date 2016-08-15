package newsletter;

import org.testng.annotations.Test;

import initialize.Newsletter_Functions;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Newsletter_TCs{
  @Test
  public void Test() {
//	  Newsletter_Functions.GotoNewsletterMenu();
	  Newsletter_Functions.EditCustomContent();
//	  Newsletter_Functions.AddStory();
	  Newsletter_Functions.AddMultipleStories();
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  Newsletter_Functions.Setup();
	  Newsletter_Functions.Login_Valid();
  }

  @AfterMethod
  public void afterMethod() {
//	  Newsletter_Functions.Clean();
  }

}
