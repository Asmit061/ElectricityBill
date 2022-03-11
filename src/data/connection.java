package data;
import java.sql.*;
public class connection {
static Connection con;

public static Connection createConnection() throws ClassNotFoundException, SQLException {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electricitybill","root","");
		System.out.println("connection successfull proceed");
		return con;
	} 
	catch (SQLException e) {
		System.out.println("Database not connected error-dbconnect: ");
		e.printStackTrace();
		return null;
	} catch (ClassNotFoundException e) {
		System.out.println("database class not found error - dbconnect");
		e.printStackTrace();
		return null;
	}
}
}


//}
//
//package DB;
//import java.sql.*;
//public class connection {
//static Connection con;
//Statement st;
//static String url="jdbc:mysql://localhost:3306/ElectricityBillingSystem";
//static String username="vatsuvaksi";
//static String password="";
//public static Connection createConnection() throws ClassNotFoundException, SQLException {
//	Class.forName("com.mysql.jdbc.Driver");
//	con =DriverManager.getConnection(url, username, password);
//	return con;
//}
//}
