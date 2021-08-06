package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;
import java.util.Scanner;

public class  JbdcDemo3Multiple  {
public static void main(String[] args) throws ClassNotFoundException, SQLException,SQLSyntaxErrorException {
	int[] ids = {121,122,123};
	String [] firstNames = {"Aparna", "Vinay", "Priya"};
	String [] lastNames = {"Mahesh", "Konanoor", "Prabhu"};
	String [] emails = {"aparna@yahoo.com", "vinay@unext.com", "priya@unext.com"};
	String [] passwords = {"absc123", "absc888", "absce3"};

	Class.forName("oracle.jdbc.OracleDriver");
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "hr", "saniya");
	String query= "insert into users values(?,?,?,?,?)";
	PreparedStatement preparedStatement = connection.prepareStatement(query);
	for(int i = 0; i<ids.length; i++) {
	preparedStatement.setInt(1, ids[i]);
	preparedStatement.setString(2, firstNames[i]);
	preparedStatement.setString(3, lastNames[i]);
	preparedStatement.setString(4, emails[i]);
	preparedStatement.setString(5, passwords[i]);
	int status = preparedStatement.executeUpdate();
	System.out.println(status);
	}
	connection.close();

   
  }

}