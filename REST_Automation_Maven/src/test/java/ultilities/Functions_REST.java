package ultilities;
import static com.jayway.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//import com.jayway.restassured.matcher.RestAssuredMatchers.*;
import com.jayway.restassured.path.json.JsonPath;
//import org.hamcrest.Matchers.*;

import com.jayway.restassured.response.Header;
/////////////////
import com.jayway.restassured.response.Headers;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.specification.RequestSpecification;

import initialize.Configs;
import initialize.ExcelUtils_auto;

import org.json.JSONObject;
import org.testng.Reporter;



public class Functions_REST extends Configs{
	public static void GET_Function(String path){
		set_up(path);
		System.out.println("@Checking: " + path);
		//		Response_Headers();
		Response_Data();
		Expected_Verification();

		//		Compare_records("id");
	}

	public static void Compare_records(String param){
		String[] values1;
		int[] values2;
		try {
			List<String> list	= Jpath.get("data."+param);
			values1 = list.toArray(new String[list.size()]);

			if (Check_SortDESC(values1)) {
				System.out.println(param + " is sorted in DESC");
			}else {
				System.out.println(param + " is sorted in ASC");
			}

		}
		catch (ClassCastException|ArrayStoreException e) {
			List<Integer> list	= Jpath.get("data."+param);
			values2 = new int[list.size()];
			Iterator<Integer> iterator	= list.iterator();

			for (int i = 0; i < list.size(); i++) {
				values2[i] = iterator.next().intValue();
			}

			if (Check_SortDESC(values2)) {
				System.out.println(param + " is sorted in DESC");
			}else {
				System.out.println(param + " is sorted in DESC");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void POST_Function(String npath){
		String APIBody = "{\"project_id\":\"1\"}";
		// Building request using requestSpecBuilder 
		RequestSpecBuilder builder = new RequestSpecBuilder(); 
		builder.setBody(APIBody);
		builder.setContentType("application/json; charset=UTF-8");

		RequestSpecification requestSpec = builder.build();

		//Making post request with authentication
		Response response = given().auth().preemptive().basic("", "")
				.spec(requestSpec).when().post(npath);

		JSONObject JSONResponseBody = new JSONObject(response.body().asString()); 
		//Fetching the desired value of a parameter 
		String result = JSONResponseBody.toString();

		System.out.println(result);
	}

	public static void GET_Function_MultipleAPI(List<String> Url){
		List<String>	URLs	= new ArrayList<String>(Url);
		for (String URL : URLs) {
			GET_Function(URL);
			System.out.println(enter);
		}
	}

	///////////////// Quick texts///////////////////////
	public static String slash			= "/";
	public static String enter			= "\n";

	////////////////////////////////////////
	///////////////// VARs /////////////////
	protected static String path;
	protected static Response resp;
	protected static JsonPath Jpath;

	protected static void set_up(String path) {
		//				resp 	= get(Configs.Environment + path);
		resp 	= get(path);
		Jpath	= new JsonPath(resp.asString()); 
	}

	//////////////////////////////////////////
	///////////////// METHOD /////////////////
	//////////////////////////////////////////

	// Response /////////////////
	protected static String	Response_Logging(){
		return resp.then().log().status().toString();
	}

	protected static void	Response_Headers(){
		System.out.println("\t HEADERS");
		//get Status
		System.out.println("Status: " + get_StatusLine());
		Reporter.log("Status: " + get_StatusLine() + enter);
		//get Response Time
		System.out.println("Loading time: " + get_ResponseTime() + " ms");
		//get Specific Header (Ex: X-Debug-Token)
		System.out.println(get_Header(Configs.Debug_Token));
		Response_HeadersforList();
	}

	protected static void 	Response_HeadersforList(){
		//		if (Check_isList()) {
		//get Headers
		Headers allHeaders = get_allHeaders();
		System.out.println(
				allHeaders.get(Configs.Limit) + enter 
				+ allHeaders.get(Configs.Page)+ enter
				+ allHeaders.get(Configs.Total) );
		//		}
	}

	protected static void 	Response_Data(){
		System.out.println("\t DATAS");
		if (get_Status() == Configs.OK) {
			//			boolean aaa 	= Jpath.get("status");
			//			System.out.println(aaa);

			//			Show_Data(ListExpected_Data());
//			Show_Data_List(ListExpected_Data());
			// For ZEN-3727		
			Show_Data_List(ListExpected_Data_manual());

		} else if(get_Status() == Configs.Not_found || get_Status() == Configs.Bad_request){
			boolean ccc	= Jpath.get("status");
			String ccc2	= Jpath.get("error.message");
			String ccc3	= Jpath.get("error.internal_code");
			System.out.println(ccc+enter+ccc2+enter+ccc3);
		} else{
			System.out.println(Configs.Invalid_Status);
			try {
				throw new Exception(Configs.Invalid_Status);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	protected static void	Show_Data(List<String> params){
		for (String param : params) {
			try {
				int bbb = Jpath.get("data[0]."+param);
				System.out.println(bbb);
			} catch (ClassCastException C) {
				String ccc = Jpath.get("data[0]."+param);
				System.out.println(ccc);	
			} catch (IllegalArgumentException D) {
				try {
					int ddd = Jpath.get("data."+param);
					System.out.println(ddd);
				} catch (Exception e) {
					String eee = Jpath.get("data."+param);
					System.out.println(eee);
				}
			} catch (NullPointerException e) {
				System.out.println(Configs.Invalid_Param);
			}
		}
	}

	protected static <T> void	Show_Data_List(List<String> params){
		for (String param : params) {
			System.out.println(param + ": ");
			try {
				List<T> bbb = Jpath.get("data."+param);
				System.out.println(bbb);
			} catch (ClassCastException C) {
				List<T> ccc = Jpath.get("data."+param);
				System.out.println(ccc);	
			} catch (NullPointerException e) {
				System.out.println(Configs.Invalid_Param);
			}
		}
	}


	// GET /////////////////
	protected static String	get_JSON_data(){
		return resp.asString();
	}

	protected static int 	get_Status (){
		return resp.statusCode();
	}

	protected static String	get_StatusLine(){
		return resp.statusLine();
	}

	protected static long 	get_ResponseTime(){
		return resp.time();
	}

	protected static Header	get_Header(String Headername){
		return get_allHeaders().get(Headername);
	}

	protected static Headers	get_allHeaders(){
		return resp.getHeaders();
	}

	// List
	protected static List<String>	ListAPIonFile(String TestCaseFile_path, int start_row, int start_column, int end_row) throws Exception {
		List<String> items	= new ArrayList<String>();
		ExcelUtils_auto.setExcelFile(TestCaseFile_path, 0);

		for (int i = start_row; i <= end_row; i++) {
			String item = ExcelUtils_auto.getCellData(i, start_column);
			items.add(item);
		}
		return items;
	}

	public static  List<String>	perfect_List(List<String> rawlist){
		List<String> perlist = new ArrayList<>();
		for (String item : rawlist) {
			item=Configs.path3+Configs.parameter3+item;
			perlist.add(item);
		}
		return perlist;
	}


	// SET //////////////////////
	public static void Set_item(String result, String excelFile_path, int row, int col) throws Exception{
		ExcelUtils_auto.setCellData(result , excelFile_path, row, col);
	}

	public static void Set_item(int result, String excelFile_path, int row, int col) throws Exception {
		ExcelUtils_auto.setCellData(result , excelFile_path, row, col);
	}


	// to check /////////////////
	protected static boolean	Check_isList(){
		// NEED TO BE DEFINED
		return false;
	}

	protected static boolean isRespTime_Acceptable(){
		boolean boo = false;
		int a = (int) get_ResponseTime();
		int result = Integer.compare(a, Configs.Acceptable_Time);

		boo = (result==1)?false:((result<=0)?true:null);
		return boo;
	}

	public static boolean Check_SortASC(String[] listString){
		boolean result = false;
		for (int i = 0, j=0; i < listString.length-1; i++) {
			j = listString[i].compareTo(listString[i+1]);
			if (j<0) result = true;
		}
		return result;
	}

	public static boolean Check_SortASC(int[] listInt){
		boolean result = false;
		for (int i = 0, j=0; i < listInt.length-1; i++) {
			j = Integer.compare(listInt[i], listInt[i+1]);
			if (j<0) result = true;
		}
		return result;
	}

	public static boolean Check_SortDESC(String[] listString){
		boolean result = false;
		for (int i = 0, j=0; i < listString.length-1; i++) {
			j = listString[i].compareTo(listString[i+1]);
			if (j>0) result = true;
		}
		return result;
	}

	public static boolean Check_SortDESC(int[] listInt){
		boolean result = false;
		for (int i = 0, j=0; i < listInt.length-1; i++) {
			j = Integer.compare(listInt[i], listInt[i+1]);
			if (j>0) result = true;
		}
		return result;
	}


	// to prepare /////////////////
	protected static List<String>	ListExpected_Data(){ //Manual at the moment
		List<String> params = new ArrayList<String>();
		params.add(Configs.param1); //id	//Manual at the moment
		params.add(Configs.param2); //name	//Manual at the moment
		params.add(Configs.param3); //status	//Manual at the moment
		params.add(Configs.param4);	//remote_identifier	//Manual at the moment
		return params;
	}

	protected static List<String>	ListExpected_Data_manual(){ //Manual at the moment
		List<String> params = new ArrayList<String>();
		params.add(Configs.param_manual1); //issue.issue_zenith_id
		//		params.add(Configs.param_manual2); //issue.issue_cover_date
		//		params.add(Configs.param_manual3); //issue.issue_status
		return params;
	}

	protected static List<String>	ListExpected_Header(){ //Manual at the moment - PENDING
		List<String> params = new ArrayList<String>();
		return params;
	}


	// to verify /////////////////
	public static void Expected_Verification(){
		System.out.println("\t VERIFICATION");
		//		Config.resp.then().assertThat().statusCode(201);

		// Verify there is record or not
		List<String> records	= Jpath.get("data");
		if (!records.isEmpty()) {
			No_of_records = records.size();
			System.out.println(No_of_records);
			
			Configs test = new Configs();
			System.out.println(test.success);
//			System.out.println(success);

		} else {
			System.out.println(unsuccess);
		}

		// Verify Loading Time
		if (isRespTime_Acceptable()) {
			System.out.println(Configs.Accept_Time);
		}else {
			System.out.println(Configs.Unaccept_Time);
		};
	}
}
