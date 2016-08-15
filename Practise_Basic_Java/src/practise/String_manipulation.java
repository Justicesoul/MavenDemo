package practise;

public class String_manipulation {
	
	public static void main (String [] args) throws Exception{
		String a = getTestCaseName("automationFramework.UDF_TC@2550036c");
		System.out.println(a);
	}
	
	 public static String getTestCaseName(String sTestCase)throws Exception{

	        String value = sTestCase;

	        try{

	            int posi = value.indexOf("@");
	    		System.out.println("Posi is: " + posi);

	            value = value.substring(0, posi);	// Cut the string from 0 -> posi
	    		System.out.println("Value is: " + value);

	            posi = value.lastIndexOf(".");    
	    		System.out.println("Posi_2 is: " + posi);

	            value = value.substring(posi + 1);
	    		System.out.println("Value_2 is: " + value);

	            return value;

	                }catch (Exception e){
	                	e.printStackTrace();
//	            Log.error("Class Utils | Method getTestCaseName | Exception desc : "+e.getMessage());

	            throw (e);

	        }
}
}
