package initialize;

public class Configs {

	public static final String Environment	= "http://stg-api.ziniopro.com";
	public static String path 				= "/console/v1/applications/10036";
	public static String path2				= "/newsstand/v1/newsstands/3051/issues";
	
	/////////////// UPLOAD FILE /////////////
	protected static final String TestCaseFile_path2 = "F:\\Selenium\\SelProjects\\zData\\Console_Resource_Data.xlsx";
	protected static final String TestCaseFile_path = "F:\\Selenium\\SelProjects\\zData\\API_Automation.xlsx";
	protected static int start_row				= 11;
	protected static int start_column			= 2;
	protected static int status_column			= 3;
	protected static int No_of_items			= 6;
	protected static int end_row				= 16;
	
	/////////////// ZEN-3726 FILE /////////////
	protected static final String TestCaseFile_path3 = "F:\\ZENITH\\Tickets\\ZEN-3726 (auto)_REST.xlsx";
	protected static final String TestCaseFile_path4 = "";
	protected static int start_item_row		= 1;
	protected static int start_item_col		= 1;
	protected static int status_col			= 2;
	protected static int end_item_row		= 195;
	protected static String	path3			= "http://stg-api.ziniopro.com/search/v1/publications?newsstand_id=881";
	protected static String	parameter3		= "&q=";
	
	/////////////// RESPONSE HEADERS /////////////
	public static final int	Acceptable_Time		= 300;
	public static final int OK					= 200;
	public static final int Not_found			= 404;
	public static final int Bad_request			= 400;
	public static final String Limit 		= "X-Pagination-Limit";
	public static final String Page 		= "X-Pagination-Page";
	public static final String Total 		= "X-Pagination-Total";
	public static final String Debug_Token	= "X-Debug-Token";
	
	/////////////// RESPONSE DATAS ///////////// (Shortly for Demo)
	public static final String param1		= "id";
	public static final String param2		= "name";
	public static final String param3		= "status";
	public static final String param4		= "remote_identifier";
	// ZEN-3726
	public static final String param_manual3726_1	= "id";
	public static final String param_manual3726_2	= "name";
	// ZEN-3727
	public static final String param_manual1	= "issue.issue_zenith_id";
	public static final String param_manual2	= "issue.issue_cover_date";
	public static final String param_manual3	= "issue.issue_status";
	public static 		int No_of_records		= 0;
	
	///////////// ERROR message ///////////
	public static String Invalid_Status		= "Unknown status detected!";
	public static String Invalid_Param		= "The param is not exist";
	public static String Accept_Time		= "The time is lessthan " + Configs.Acceptable_Time + "ms. Passed";
	public static String Unaccept_Time		= "The time is over " + Configs.Acceptable_Time + "ms!! Failed";
	public String success			= "There are " + No_of_records +" records. Passed";
//	public static String success			= "There are " + No_of_records +" records. Passed";
	public static String unsuccess			= "No records. Failed";
	
}
