package selenium_zAdvance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	public static void  main(String[] args) throws  ClassNotFoundException, SQLException {                                                  
/*		// LOCAL CONNECTOR
 		//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"        
		String dbUrl = "jdbc:mysql://localhost:3306/database_test";                   
		//Database Username     
		String username = "FFThinh";   
		//Database Password     
		String password = "123456";             
		//Query to Execute      
		String query = "select *  from employee;"; */ 
		
		// REAL CONNECTOR
		String dbUrl 	= "jdbc:mysql://db-1.zenith.xen.int:3306/";
		String db		= "zen_identity";
		String username = "admin";   
		String password = "devteam";             
		String query = "SELECT * FROM users WHERE email LIKE \"thinh.luong%\" AND directory_id = 24;"; 

		//Load mysql jdbc driver        
		Class.forName("com.mysql.jdbc.Driver");         

		//Create Connection to DB       
		Connection con = DriverManager.getConnection(dbUrl+db,username,password);
		//Create Statement Object       
		Statement stmt = con.createStatement();                  
		// Execute the SQL Query. Store results in ResultSet        
		ResultSet rs= stmt.executeQuery(query);                         

		// While Loop to iterate through all data and print results     
		while (rs.next()){
			String ID		= rs.getString(2);
			String myName 	= rs.getString("email");                                        
			String myAge 	= rs.getString("remote_identifier"); 
//			String mystatus	= rs.getString("status");
			int mystatus	= rs.getInt("status");
			System. out.println(ID+"\t"+myName+"\t"+myAge+"\t"+mystatus);     
		}       
		// closing DB Connection       
		con.close();            
	}
}
