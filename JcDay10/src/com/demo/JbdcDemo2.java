package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;
import java.util.Scanner;

public class  JbdcDemo2  {
public static void main(String[] args) throws ClassNotFoundException, SQLException,SQLSyntaxErrorException {
	
//step 1 - register the driver
 Class.forName("oracle.jdbc.OracleDriver");

//Step 2 - establish a connection
 Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "hr", "saniya");

//Step 3 - create a statement
 Statement statement = connection.createStatement();
 
 

//Step 4 - pass the SQL query and get the result
 
 Scanner sc=new Scanner(System.in);
 System.out.println("Id:");
 int userId=sc.nextInt();
 System.out.println("First Name:");
 String FName=sc.next();
 System.out.println("Last Name:");
 String LName=sc.next();
 System.out.println("Email:");
 String Email=sc.next();
 System.out.println("Password:");
 String password=sc.next();
 
 
/*  int userId=209;
   String FName="abcd";
   String LName="sdhjds";
   String Email="dhjdf";
   String password="1234";
 
 */
 
    String query="insert into users values("+userId+",'" +FName+"','" +LName+"','" +Email+"','" +password+"')";
    int status= statement.executeUpdate(query);
    
    System.out.println(status);
    
    ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
    while(resultSet.next()) {
      int userIId = resultSet.getInt(1);
      String name = resultSet.getString(2);
      System.out.println(userIId + "\t"+ name);
     }
    
    connection.close();
  }

}