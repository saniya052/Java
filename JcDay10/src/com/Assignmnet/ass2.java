package com.Assignmnet;

import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;



public class ass2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException,SQLSyntaxErrorException {
		
		//step 1 - register the driver
		 Class.forName("oracle.jdbc.OracleDriver");

		//Step 2 - establish a connection
		 Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "hr", "saniya");

		//Step 3 - create a statement
		 Statement statement = connection.createStatement();
		 
	
		Scanner sc=new Scanner(System.in);
		System.out.println("product_code:");
		int prod_code=sc.nextInt();
		
		String query="SELECT * FROM products where prod_code="+prod_code ;
		 statement.executeUpdate(query);
		ResultSet resultSet = statement.executeQuery(query);
	    
	    //System.out.println(status);
	    
	    while(resultSet.next()) {
		     int prod_code1 = resultSet.getInt(1);
		     String  prod_name= resultSet.getString(2);
			 int  prod_price= resultSet.getInt(3);
		     String  prod_catg= resultSet.getString(4);
		     
		     System.out.println( prod_code1+ "\t"+prod_name+"\t"+prod_price+"\t"+prod_catg);
		    }
		   connection.close();
		
	}

}
