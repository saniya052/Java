package com.Assignmnet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;


public class ProductMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Scanner sc=new Scanner (System.in);
	System.out.print("No of products to be added:");
	int n=sc.nextInt();
	
	 int prod_code1;
	 String  prod_name;
     int  prod_price;
	 String  prod_catg;
	 
	 ArrayList<product> pr=new ArrayList<product>();
	
	for(int i=0;i<n;i++) {
		System.out.println("enter details for product  "+i);
		System.out.print("prod_code");
		prod_code1=sc.nextInt();
		System.out.print("prod_name ");
		prod_name=sc.next();
		System.out.print("prod_price ");
	    prod_price=sc.nextInt();
	    System.out.print(" prod_catg ");
	    prod_catg=sc.next();
	     
	   product pro= (product) new product(prod_code1,prod_name,prod_price,prod_catg);
	   pr.add(pro);
	   
	}
	
	
	Class.forName("oracle.jdbc.OracleDriver");
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "hr", "saniya");
	String query= "insert into product_new1 values(?,?,?,?)";
	PreparedStatement preparedStatement = connection.prepareStatement(query);
	
	int count=0;
	for ( product p : pr) {
		prod_code1=p.getProd_code1();
		prod_name=p.getProd_name();
	    prod_price=p.getProd_price();
		prod_catg=p.getProd_catg();
		// System.out.println(prod_code1+prod_name+prod_price+prod_catg);
        preparedStatement.setInt(1,prod_code1);
	    preparedStatement.setString(2,prod_name);
	    preparedStatement.setInt(3,prod_price);
	    preparedStatement.setString(4, prod_catg);
        int status = preparedStatement.executeUpdate();
	  //  System.out.println(status);
	    if(status==1) {
	    	count+=1;
	    }
	}
	if(count== n) {
		 System.out.println("All products inserted");
	}
	connection.close();

	
	}

}
