package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class AgeCalculator2 {
	
	 static String calulateAge(String date1,int currentYear){
	    	
	       String lastFourDigits = date1.substring( date1.length() - 4);
		   //System.out.println(lastFourDigits);
		   int BirthYear = Integer.parseInt(lastFourDigits); 
		   int age=currentYear-BirthYear;
		   String s=Integer.toString(age);

		  return s;
		   
	   }
	   
	   
	public static boolean isValidFormat(String format, String value) {
	        Date date = null;
	        try {
	            SimpleDateFormat sdf = new SimpleDateFormat(format);
	            date = sdf.parse(value);
	            if (!value.equals(sdf.format(date))) {
	                date = null;
	            }
	        } catch (ParseException ex) {
	            ex.printStackTrace();
	        }
	        return date != null;
	    }


	public static void main(String[] args) throws ParseException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the birth date dd/MM/yyyy:");
		String Birthdate=sc.nextLine();
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String CurrDate=dateFormat.format(date);
		
		 Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(Birthdate);  
		 Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(CurrDate);  
		
		
		try{
	            
		       if(!isValidFormat("dd/MM/yyyy",Birthdate)) {
		    	   throw new DateException();
		       }
		       
		      				
		     }
		     catch (DateException exception) {
			          exception.printStackTrace();
			         // System.out.println(exception.getMessage());
		        }
	   
	   	try {
			   if(date1.after(date2)) {
		    	   throw new DateMoreException();
		        }
		    }catch (DateMoreException e) {
			e.printStackTrace();
	         // System.out.println(exception.getMessage());
		   }
	   	
		     Date d=new Date(); 
	         @SuppressWarnings("deprecation")
			 int year=d.getYear();  
	         int currentYear=year+1900; 

	         String ans= calulateAge(Birthdate,currentYear);
	         System.out.println(ans);  
	   }
}
