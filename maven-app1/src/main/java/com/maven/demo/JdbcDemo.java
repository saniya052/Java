package com.maven.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		//step 1 - register the driver
		Class.forName("oracle.jdbc.OracleDriver");
		//Step 2 - establish a connection
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "hr", "saniya");
		//Step 3 - create a statement
		Statement statement = connection.createStatement();
		//Step 4 - pass the SQL query and get the result
		ResultSet resultSet = statement.executeQuery("SELECT * FROM Train");
		while(resultSet.next()) {
		int userId = resultSet.getInt(1);
		String name = resultSet.getString(2);
		System.out.println(userId + "\t"+ name);
		}
		connection.close();
	}

}


