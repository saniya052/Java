package com;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import com.TrainDAO;
import com.exp.DateInvalidException;
import com.*;

public class TicketApplication {
	//static int no=0;

	public static void main(String[] args) throws ParseException, ClassNotFoundException, SQLException, DateInvalidException, IOException {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the train no:");
		int train_no=sc.nextInt();
	    Train train=TrainDAO.findTrain(train_no);

	 
	    if(train== null) {
	    	System.out.print("Train doesn't exists");
	    	System.exit(1);
	    }
		
	
		System.out.println("Enter travel date:");
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("d/M/yyyy");
		String userInput=sc.next();
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
		System.out.println("Ticket booked with PNR: " + t.getPnr());
	
		//System.out.println("No ticket generated on:"+LocalDate.now()+"is: "+no);
		
	}


}
