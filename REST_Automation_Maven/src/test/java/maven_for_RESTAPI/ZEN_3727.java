package maven_for_RESTAPI;

import org.testng.annotations.Test;

import ultilities.Functions_REST;

public class ZEN_3727 extends Functions_REST{
  @Test
  public void f() {
	  GET_Function("http://stg-api.ziniopro.com/search/v1/featured_articles?newsstand_id=881&limit=20");
  }
}
