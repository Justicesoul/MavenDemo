package fService;

import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.MatcherAssert.assertThat;


import java.util.List;

import org.json.JSONException;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;
import com.jayway.restassured.path.json.JsonPath;

public class GET_demo_1 {

	String slash = "/";

	/*	@Test
  public void f() throws JSONException{
	  //make get request to fetch capital of norway 
	  Response resp = get("http://restcountries.eu/rest/v1/name/norway"); 


	  //Fetching response in JSON 
	  JSONArray jsonResponse = new JSONArray(resp.asString()); 

	  //Fetching value of capital parameter 
	  String capital 	= jsonResponse.getJSONObject(0).getString("capital");
	  String lTime 		= resp.getHeader("Connection");
	  int status 		= resp.getStatusCode();
	  String statusL 	= resp.getStatusLine();

	  //Asserting that capital of Norway is Oslo 
	  Assert.assertEquals(capital, "Oslo");

	  System.out.println(capital + "-" + lTime + "-" + status + "\n" + statusL);
  }*/


	//  @Test
	//  public void Test2() {
	//	  String json = get(path).asString();
	//	  JsonPath jsonP = new JsonPath(json);
	//
	//	  
	//	  String Capital = jsonP.getString("name");
	//	  System.out.println(Capital);
	//
	//	  
	//	  List <String> translations = jsonP.get("translations");
	//	  for (String translation : translations) {
	//		System.out.println(translation + "\n");
	//	}
	//  }

	@Test
	public void Test3() throws JSONException{
		JSON_Schema_Validation();
//		Newsstand_Test();
	}

	public void JSON_Schema_Validation() throws JSONException{
		String path 		= "http://zendev2.vn.audiencemedia.com/newsstand/v1/newsstands/3051/issues";
		Response resp		= get(path);
//		System.out.println(resp.time() + slash + resp.timeIn(TimeUnit.SECONDS));
		assertThat(resp.getBody().asString(), matchesJsonSchemaInClasspath("abc_jsonschema.json"));
//		assertThat("abc.json", matchesJsonSchemaInClasspath("abc_jsonschema.json"));
		
	}

	public <T> void Newsstand_Test(){
		String path 		= "http://zendev2.vn.audiencemedia.com/newsstand/v1/newsstands/3051/issues";
		Response resp		= get(path);
		JsonPath jsonP		= new JsonPath(resp.asString());
		// Single Issue
		List <T> issue_id		= jsonP.get("data.id");
		List <T> publication_id	= jsonP.get("data.publication_id");
		System.out.println(issue_id);
		System.out.println(publication_id);
	}

	public void Norway_Test(){
		String path 		= "http://restcountries.eu/rest/v1/name/norway";
		Response resp		= get(path);
		JsonPath jsonP 		= new JsonPath(resp.asString());

		String Capital 		= jsonP.getString("name");
		int fff				= jsonP.get("population[0]");
		//		String abc			= jsonP.get("translations[0].fr");
		//		List<String> abc2		= jsonP.get("translations.fr");
		List<String> abc3		= jsonP.get("translations");
		System.out.println(Capital);
		System.out.println(fff);
		//		System.out.println(abc);
		//		System.out.println(abc2);
		System.out.println(abc3);
	}
}
