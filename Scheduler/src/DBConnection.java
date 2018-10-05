import java.sql.*;

public class DBConnection {
	
	
	
	public DBConnection() throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/Customers";
		String username = "root";
		String password = "";
		 
		System.out.println("Connecting database...");

		try (Connection connection = DriverManager.getConnection(url, username, password)) {
		    System.out.println("Database connected!");
		    StartUp.lbl1.setText("Database connected!");
		    StartUp.lbl2.setText("Database:Customer | User:Default");
		  
		} catch (SQLException e) {
		    System.out.println("Cannot connect the database!");
		    e.printStackTrace();
		}
		
	}
}
