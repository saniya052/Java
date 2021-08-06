package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.TicketApplication;
import com.exp.DateInvalidException;
import com.exp.TrainDoesNotexistException;
public class TrainMenu {
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, DateInvalidException, IOException {
		
	    Scanner sc=new Scanner(System.in);
		
		System.out.print("Choose options");
		System.out.println("1. Book a Ticket");
		System.out.println("2. Enquiry");
		System.out.println("3. No of ticket booked");
		System.out.println("4. print all the tickets");
		System.out.println("5. Exit");
		
		int no=sc.nextInt();
		
		TicketApplication tr=new TicketApplication ();
		
		switch(no) {
		  case 1:
			  System.out.print("Enter the train no:");
				int train_no=sc.nextInt();
			    Train train=TrainDAO.findTrain(train_no);

			 
			    if(train== null) {
			    	System.out.print("Train doesn't exists");
			    	System.exit(1);
			    }
				
				System.out.println("Enter travel date:");
				String userInput= sc.next();
				DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("d/M/yyyy");
			    LocalDate travelDate = LocalDate.parse(userInput, dateFormat);
			    System.out.println(travelDate);
				
				Ticket t=new Ticket(train,travelDate);
			    
				System.out.print("Enter the no of passangers:");
				int num=sc.nextInt();		
			
			
				for(int i=0;i<num;i++) {
					    System.out.print("Enter the Name");
						String Name=sc.next();
					    System.out.print("Enter the Age");
					    int Age=sc.nextInt();
					    System.out.print("Enter the Gender");
					    String Gender=sc.next();
				
					    t.addPassanger(Name,Age,Gender);
					    
					}
				
				t.writeTicket();
			 
		    break;
		  case 2:
			  System.out.print("Enter the train no:");
				int train_no1=sc.nextInt();
			    Train train1=TrainDAO.findTrain(train_no1);
			    if(train1== null) {
			    	System.out.print("Train doesn't exists");
			    	System.exit(1);
			    }else {
			    	System.out.println("Train NO:  "+train1.getTrainNo());
			    	System.out.println("Train Name:  "+train1.getTrainName());
			    	System.out.println("Train Source:  "+train1.getSource());
			    	System.out.println("Train Destination:  "+train1.getDestination());
			    	System.out.println("Train Price:  "+train1.getTicketPrice());
			    }
				
			 break;
			 
			 
				 
		  case 3:
			   System.out.println("No of ticket booked");
			  
			   final String DRIVER_Name="oracle.jdbc.OracleDriver";
			   final String DB_URL="jdbc:oracle:thin:@127.0.0.1:1521:XE" ;
			   final String USER_NAME= "hr" ;
			   final String PASSWORD="saniya";
			   
		        //step 1 - register the driver
		        Class.forName(DRIVER_Name);
		        //Step 2 - establish a connection
		        Connection connection = DriverManager.getConnection(DB_URL,USER_NAME, PASSWORD);
		        //Step 3 - create a statement
		        Statement statement = connection.createStatement();
		        ResultSet resultSet = statement.executeQuery("SELECT * FROM NoTicket");
		        boolean status=(resultSet.next());
		        
		        if(status)
		        { 
		        	int count=resultSet.getInt(1);
		        	System.out.print("No of Ticket Book Till Now: "+count);
		        
		        }
		        connection.close();
			    break;
			    
			    
			    
	
			    
		  case 4:
			  System.out.println("Enter the PNR NO:");
			  String pnrNo=sc.nextLine();
			  try {
				  FileReader fileReader = new FileReader(pnrNo+".txt");
				  BufferedReader bufferedReader = new BufferedReader(fileReader);
		            
				  String line=null;
				  while((line = bufferedReader.readLine()) != null)
		            {
		                System.out.println(line);
		            } 
			  }catch(IOException ex) {
				  System.out.println("File Name " + pnrNo + "Doesn't Exists");
			  }
			 
			    break;
		  case 5:
			  System.out.println("Exit...");
			    break;
		  default:
			  System.out.println("Invalid Option");
		}
		
	}
	
	
}
