package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.Statement;

public class InsertRecord {
	public static void main(String[] args) {
		
	try {
		String url="jdbc:mysql://localhost:3306/javadb";
				String userName="root";
				String password="password";
				Connection con=DriverManager.getConnection(url, userName,password);
				System.out.println("Connected succesfully");
				
				//New Code
				String query="insert into customer values(107,'Rob',7362,'rob@gmail.com')"; //query to be executed against DB
				Statement stmt=con.createStatement(); // to create SQL Statement
				stmt.executeUpdate(query);
				System.out.println("One record insterted succesfully");
				
				
				
	//New Code//
				
	}catch(Exception e)
		{
		    System.out.println(e.getMessage());
			System.out.println("Something went wrong");
		}
	}
	
}
