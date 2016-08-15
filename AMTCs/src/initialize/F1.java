package initialize;

public class F1 {
	//Setup
	public final static String BaseUrl = "http://qa_thinh_publication_name_2b-bd.audiencemedia.com";
	public final static String Valid_User = "admin", Valid_Pass = "devteam";
	public final static String Email = "thinh.luong+001@audiencemedia.com";
	
	static int rand = ((int)Math.random()*100);
	public final static String Issue_name = "Auto_Issue 001";
	public final static String Issue_description = "Issue Description "+rand;
	public final static String Section_name = "Section "+rand;
	public final static String Section_description = "Section Description " +rand;
	
	
	//Elements
	String Issue_name_2;
	String Cover_date;
	String Deadline;
	
	//Methods
	public static void DisplayVariables(){
		System.out.println(BaseUrl);
		System.out.println(Email);
		System.out.println(Valid_User);
		System.out.println(Valid_Pass);
	}
}
